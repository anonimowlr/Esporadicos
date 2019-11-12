/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;

import dao.AssuntoDAO;
import entidades.Assunto;
import entidades.Cadastro;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static rotinasportal.Coletas.driver;
import util.Utils;

/**
 *
 * @author f5078775
 */
public class ColetaAssunto {

    Coletas coletas = new Coletas();

    List<Assunto> lista = null;
    AssuntoDAO assuntoDAO = new AssuntoDAO();

    public ColetaAssunto() {
    }

    public void iniciar() {

        createList();    // descomentar para coletar portal antes de sisbb
        lerLista();

        if (driver != null) {
            driver.close();
        }

    }

    public void createList() {
        lista = assuntoDAO.buscarParaLerAssunto();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Consulta no Portal Jurídico finalizada");
        } else {
            coletas.autenticarUsuario();   // habilitar no bb
        }
    }

    public void lerLista() {

        for (Assunto assunto : lista) {
            capturarAssunto(assunto);
            capturarOrigem(assunto);
        }

    }

    private void capturarAssunto(Assunto assunto) {

        try {

            if (assunto.getIdentific3() == null) {
                //desconciliacaoDAO.editarGenerico("tb_inedito", "OBS_COMPLEMENTAR", "conta invalida", codigo);
                return;
            }

            int tamanhoNpj = assunto.getIdentific3().length();

            if ((Utils.tratarVariavel(assunto.getIdentific3())).length() < 11) {
                return;
            }

            driver.manage().window().maximize();
            coletas.setURL("https://juridico.intranet.bb.com.br/paj/paginas/negocio/processo/consultar/relatorioCompleto.seam?idProcessoPrincipal=" + (Utils.tratarVariavel(assunto.getIdentific3()).subSequence(0, 11).toString()) + "");

            
           
            
            
            
            coletas.aguardaElementoTelaByID("detalharProcessoForm:j_id202");
            
            
            
            // coletas.pausar(1000);
            coletas.clickElementId(driver, "detalharProcessoForm:j_id202"); //202 visualizar todos
            //coletas.pausar(1000);
            
            
            
            
            int i =0;
            while(!coletas.isElementPresentID(driver, "detalharProcessoForm:reuDecorate:reuOutput")){
                
                
                coletas.pausar(1000);
                if(i>5){
                    return;
                }
                
                i++;
                
            }
            

            
            
            
            
            
            
            
           

            if (!coletas.isElementPresentID(driver, "detalharProcessoForm:assuntoDecorate:assuntoOutput")) {
                return;
            }

            if (!coletas.isElementPresentID(driver, "detalharProcessoForm:numeroProcessoFrame")) {
                return;
            }

//                                                   detalharProcessoForm:assuntoDecorate:assuntoOutput
            String assuntoPortal = coletas.lerValorElementoID("detalharProcessoForm:assuntoDecorate:assuntoOutput");

            String materia = coletas.lerValorElementoID("detalharProcessoForm:materiaDecorate:materiaOutput");

            assunto.setAssunto(assuntoPortal);
            assunto.setValorCausa(Utils.converterDobleParaBigDecimal(coletas.lerValorElementoID("detalharProcessoForm:valorCausaDecorate:valorCausaOutput")));
            assuntoDAO.salvar(assunto);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void capturarOrigem(Assunto assunto) {

        if (assunto.getIdentific3() == null || assunto.getIdentific3().equals("")) {

            return;
        }

        if (assunto.getIdentific3() == null || assunto.getIdentific3().equals("")) {

            return;
        }
        int tamanhoNpj = assunto.getIdentific3().length();

        driver.manage().window().maximize();

        if (coletas.isElementPresentXpath(driver, "//form[@name='formConsultaProcesso']/div/label/span/button")) {
            coletas.clickElementXpath(driver, "//form[@name='formConsultaProcesso']/div/label/span/button");

            coletas.procuraElementoPorId(driver, "focus1", assunto.getIdentific3().subSequence(0, 4).toString());
            coletas.procuraElementoPorId(driver, "focus2", assunto.getIdentific3().subSequence(4, 11).toString());
            coletas.procuraElementoPorId(driver, "focus3", assunto.getIdentific3().subSequence(11, assunto.getIdentific3().length()).toString());
            coletas.clickElementXpath(driver, "//input[@id='focus3']/following-sibling::input");

        } else {
            coletas.setURL("https://juridico.intranet.bb.com.br/paj/juridico/v2?anoProcesso=" + assunto.getIdentific3().subSequence(0, 4).toString() + "&app=processoConsultaRapidoApp&numeroProcesso=" + assunto.getIdentific3().subSequence(4, 11).toString() + "&variacaoProcesso=" + assunto.getIdentific3().subSequence(11, assunto.getIdentific3().length()).toString() + "");
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

                    return;
                }
                l++;
            }

        }

        if (coletas.isElementPresentID(driver, "modaldivMessagesGlobal")) {

            String n = coletas.lerValorElementoID("modaldivMessagesGlobal");

            if (!n.equals("")) {

                return;
            }
        }

        int qtdreg = 1;
        for (int reg = 0; reg < qtdreg; reg++) {

            String npjPortal = Utils.tratarVariavel(coletas.lerValorElementoByXpth("//table/tbody/tr[1]/td[1]/span"));

            if (npjPortal.equals(assunto.getIdentific3())) {

                if (coletas.isElementPresentXpath(driver, "//table/tbody/tr[1]/td[7]/span")) {
                    coletas.clickElementXpath(driver, "//table/tbody/tr[1]/td[7]/span");
                } else {
                    return;
                }

                coletas.aguardaElementoTelaByXpath("html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[1]/section/article/ul/li[5]/span");
                coletas.pausar(1000);

                coletas.clickElementXpath(driver, "html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[1]/section/article/ul/li[5]/span");

                if (!coletas.isElementPresentXpath(driver, "/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[1]/div/div/section/article/div/div[1]/div/span/span/span")) {

                    int l = 0;
                    while (!coletas.isElementPresentXpath(driver, "/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[1]/div/div/section/article/div/div[1]/div/span/span/span")) {
                        coletas.pausar(1000);
                        coletas.clickElementXpath(driver, "html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[1]/section/article/ul/li[5]/span");
                        if (l >= 10) {

                            return;
                        }
                        l++;
                    }

                }

                coletas.aguardaElementoTelaByXpath("/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[2]/div/div/div/div/section/article/div[2]/div/label");

                coletas.pausar(1000);

                if (coletas.isElementPresentXpath(driver, "/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[1]/div/div/section/article/div/div[1]/div/span/span/span")) {

                    assunto.setOrigem(coletas.lerValorElementoByXpth("/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[1]/div/div/section/article/div/div[1]/div/span/span/span"));
                    assunto.setGrupo((coletas.lerValorElementoByXpth("/html/body/plt-template-base/div/ng-transclude/ng-view/div/div/div/div[2]/div/div/ng-include/div/origem-demanda/div/bb-panel/section/bb-panel-body/article/div/div/ng-include[1]/div/div/section/article/div/div[1]/div/span/small/span").trim()));
                    try {
                        assunto.setDataVerificacao(Utils.getDataAtualFormatoMysql());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Data Atual não gravada");
                    }
                } else {

                    assunto.setOrigem("não informado");
                    assunto.setGrupo("não informado");
                    try {
                        assunto.setDataVerificacao(Utils.getDataAtualFormatoMysql());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Data Atual não gravada");
                    }

                }

                coletas.pausar(1000);
                coletas.clickElementXpath(driver, "html/body/plt-template-base/div/ng-transclude/ng-view/div/div/button");
                assuntoDAO.salvar(assunto);

                return;
            }

        }

    }

}
