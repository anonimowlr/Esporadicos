/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;

import dao.CadastroDAO;
import entidades.Cadastro;
import java.util.List;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static rotinasportal.Coletas.driver;
import util.Utils;

/**
 *
 * @author f5078775
 */
public class ColetaAjureResponsavel {

    Coletas coletas = new Coletas();

    List<Cadastro> lista = null;
    CadastroDAO cadastroDAO = new CadastroDAO();

    public ColetaAjureResponsavel() {
    }

    public void iniciar() {

        createList();    // descomentar para coletar portal antes de sisbb
        lerLista();
        
        if(driver != null){
           driver.close();
        }
        
    }

    public void createList() {
        lista = cadastroDAO.buscarParaLerAjureResponsavel();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Consulta no Portal Jurídico finalizada");
        } else {
            coletas.autenticarUsuario();   // habilitar no bb
        }
    }

    public void lerLista() {

        for (Cadastro cadastro : lista) {
            capturarAjure(cadastro); // habilitar no bb

        }

    }

    private void capturarAjure(Cadastro cadastro) {
        
        if(cadastro.getIdentific3() == null ||cadastro.getIdentific3().equals("") ){
            cadastro.setObs("Nao foi informado o npj");
            cadastroDAO.salvar(cadastro);
            return;
        }
       if (cadastro.getIdentific3() == null || cadastro.getIdentific3().equals("")) {
            cadastro.setObs("Nao foi informado o npj");
            cadastroDAO.salvar(cadastro);
            return;
        }
        int tamanhoNpj = cadastro.getIdentific3().length();
        
        if(tamanhoNpj < 14){
            return;
        }
        
        
        

        //driver.manage().window().maximize();

        if (coletas.isElementPresentXpath(driver, "//table/tbody/tr[1]/td[1]/span")) {
            coletas.clickElementXpath(driver, "/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/section/article/div/div/div/div/div[1]/ng-include/section/article/form/div[2]/div/button/span");

            coletas.procuraElementoPorId(driver, "focus1", cadastro.getIdentific3().subSequence(0, 4).toString());
            coletas.procuraElementoPorId(driver, "focus2", cadastro.getIdentific3().subSequence(4, 11).toString());
            coletas.procuraElementoPorId(driver, "focus3", cadastro.getIdentific3().subSequence(11, cadastro.getIdentific3().length()).toString());
            coletas.clickElementXpath(driver, "/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/section/article/div/div/div/div/div[1]/ng-include/section/article/form/div[2]/div/input");

        } else {
            coletas.setURL("https://juridico.intranet.bb.com.br/paj/juridico/v2?anoProcesso=" + cadastro.getIdentific3().subSequence(0, 4).toString() + "&app=processoConsultaRapidoApp&numeroProcesso=" + cadastro.getIdentific3().subSequence(4, 11).toString() + "&variacaoProcesso=" + cadastro.getIdentific3().subSequence(11, cadastro.getIdentific3().length()).toString() + "");
            WebElement elementFrame = driver.findElement(By.xpath("//iframe[@id='WIDGET_ID_1']"));
            driver.switchTo().defaultContent();
            driver.switchTo().frame(elementFrame);
        }
        
        

        // verifica se um elemento esta na tela                             
        if (!coletas.isElementPresentXpath(driver, "//table/tbody/tr[1]/td[1]/span")) {
            int l = 0;
            while (!coletas.isElementPresentXpath(driver, "//table/tbody/tr[1]/td[1]/span")) {
                coletas.pausar(1000);
                if (l >= 3) {
                    cadastro.setObs("npj nao localizado");
                    cadastroDAO.salvar(cadastro);
                    return;
                }
                l++;
            }

        }

        if (coletas.isElementPresentID(driver, "modaldivMessagesGlobal")) {

            String n = coletas.lerValorElementoID("modaldivMessagesGlobal");

            if (!n.equals("")) {

                cadastro.setObs(n);
                cadastroDAO.salvar(cadastro);
                return;
            }
        }

        int qtdreg = 1;
        for (int reg = 0; reg < qtdreg; reg++) {

            String npjPortal = Utils.tratarVariavel(coletas.lerValorElementoByXpth("//table/tbody/tr[1]/td[1]/span"));

            if (npjPortal.equals(cadastro.getIdentific3())) {
                cadastro.setAjureResponsavel(coletas.lerValorElementoByXpth("//table/tbody/tr[1]/td[2]/span"));
                cadastro.setAdvogadoBb(coletas.lerValorElementoByXpth("//table/tbody/tr[1]/td[5]/span"));
                cadastroDAO.salvar(cadastro);
                return;
            }

        }

    }

}
