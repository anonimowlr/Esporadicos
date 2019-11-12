/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;

import dao.CadastroDAO;
import dao.ValorCausaDAO;
import entidades.Cadastro;
import entidades.ValorCausa;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.swing.JOptionPane;
import static rotinasportal.Coletas.driver;
import util.Utils;

/**
 *
 * @author f5078775
 */
public class ColetaValorCausa {

    Coletas coletas = new Coletas();

    List<ValorCausa> lista = null;
    ValorCausaDAO valorCausaDAO = new ValorCausaDAO();

    public ColetaValorCausa() {
    }

    public void iniciar() {

        createList();    // descomentar para coletar portal antes de sisbb
        lerLista();
        
        if(driver != null){
           driver.close();
        }
        
    }

    public void createList() {
        lista = valorCausaDAO.buscarParaLerValorCausa();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Consulta no Portal Jurídico finalizada");
        } else {
            coletas.autenticarUsuario();   // habilitar no bb
        }
    }

    public void lerLista() {

        for (ValorCausa  valorCausa : lista) {
            capturarPortal(valorCausa); // habilitar no bb

        }

    }

    private void capturarPortal(ValorCausa valorCausa) {
        
        
        if(valorCausa.getNpj()== null ||valorCausa.getNpj().equals("") ){
            valorCausa.setObs("Nao foi informado o npj");
            valorCausaDAO.salvar(valorCausa);
            return;
        }
        int tamanhoNpj = valorCausa.getNpj().length();
        

        driver.manage().window().maximize();
        coletas.setURL("https://juridico.intranet.bb.com.br/paj");

        coletas.aguardaElementoTelaByName("anoProcesso");
        
        coletas.procuraElementoPorName(driver, "anoProcesso", valorCausa.getNpj().subSequence(0, 4).toString());
        coletas.procuraElementoPorName(driver, "numeroProcesso", valorCausa.getNpj().subSequence(4, tamanhoNpj - 3).toString());
        coletas.procuraElementoPorName(driver, "numeroVariacaoProcesso", valorCausa.getNpj().subSequence(tamanhoNpj - 3, tamanhoNpj).toString());

        coletas.clickElementXpath(driver, "//form[@name='buscaRapidaForm']/button");

        if (coletas.isElementPresentID(driver, "modaldivMessagesGlobal")) {

            String n = coletas.lerValorElementoID("modaldivMessagesGlobal");

            if (!n.equals("")) {

                valorCausa.setObs(n);
                valorCausaDAO.salvar(valorCausa);
                return;
            }
        }

        // ler gegistros na pagina
        Integer qtdreg = null;
        if (coletas.isElementPresentID(driver, "consultarProcessoForm:j_id83")) {

            String n = coletas.lerValorElementoID("consultarProcessoForm:j_id83");

            qtdreg = Integer.parseInt(coletas.quantidadeRegistrosListados(n));
        } else {

            valorCausa.setObs("npj não localizado");
            valorCausaDAO.salvar(valorCausa);
            return;
        }

        if (qtdreg > 9) {

            coletas.clickElementId(driver, "consultarProcessoForm:j_id112");

        }
        
        

        for (int reg = 0; reg < qtdreg; reg++) {

             String npjPortal = Utils.tratarVariavel(coletas.lerValorElementoID("consultarProcessoForm:dataTabletableProcessos:" + reg + ":colBBJURDecorate:colBBJUROutput"));
             
             if(npjPortal.equals(valorCausa.getNpj())){

                 String situacaoNpj = coletas.lerValorElementoID("consultarProcessoForm:dataTabletableProcessos:" + reg + ":colSituacaoDecorate:colSituacaoOutput");
                 
                 if(situacaoNpj.contains("Excl")){
                     valorCausa.setObs("Npj excluído");
                     valorCausaDAO.salvar(valorCausa);
                     return;
                 }
                 
                 
                coletas.clickElementId(driver, "consultarProcessoForm:dataTabletableProcessos:" + reg + ":j_id325");
                coletas.aguardaElementoTelaByID("includePopup:detalharProcessoForm:valorCausaDecorate:valorCausaOutput");
                
                String valorCausatexo = coletas.lerValorElementoID("includePopup:detalharProcessoForm:valorCausaDecorate:valorCausaOutput");
                
                valorCausa.setVlrCausa(Utils.converterStringParaBigDecimal(coletas.lerValorElementoID("includePopup:detalharProcessoForm:valorCausaDecorate:valorCausaOutput")));

                 valorCausaDAO.salvar(valorCausa);
                 return;
             }
             
             

           

        }

    }

}
