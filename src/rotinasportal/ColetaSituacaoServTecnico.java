/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;

import dao.IrregularidadeDAO;
import entidades.Irregularidade;
import java.util.List;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static rotinasportal.Coletas.driver;
import static rotinasportal.Coletas.wait;
import util.Utils;

/**
 *
 * @author f5078775
 */
public class ColetaSituacaoServTecnico {

    Coletas coletas = new Coletas();

    List<Irregularidade> lista = null;
    IrregularidadeDAO<Irregularidade> d = new IrregularidadeDAO<>();

    public ColetaSituacaoServTecnico() {
    }

    public void iniciar() {

        createList();    // descomentar para coletar portal antes de sisbb
        lerLista();
        
        if(driver != null){
           driver.close();
        }
        
    }

    public void createList() {
        lista = d.buscarParaLerSitServTecnico();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Consulta no Portal Jurídico finalizada");
        } else {
            coletas.autenticarUsuarioGst();   // habilitar no bb
        }
    }

    public void lerLista() {

        for (Irregularidade irregularidade : lista) {
            capturarSitSevTecnico(irregularidade); // habilitar no bb

        }

    }

    private void capturarSitSevTecnico(Irregularidade irregularidade) {
      
        coletas.setURL("https://intranet.bb.com.br/gst/APPS/paginas/consultarservicotecnico/consultarQuadroResumo.bb?cid=739");
        coletas.selecionarElementoID("numServTecnico:tipoIdentificacaoCliente", 5);
        coletas.aguardaElementoTelaByName("numServTecnico:j_id160");
        String controle = "";
        
       
        
        for(int i = irregularidade.getIdentific3().length();i < 4; i++){
             
             controle  = controle + "0";
            
             
            
        }
        irregularidade.setIdentific3(controle + irregularidade.getIdentific3());
        
        coletas.procuraElementoPorName(driver, "numServTecnico:j_id160", irregularidade.getIdentific2() + irregularidade.getIdentific3());
        coletas.clickElementId(driver, "numServTecnico:idOPR");
        coletas.aguardaElementoTelaByID("listarServicoTecnicoForm:j_id313:j_id317");
        
        String numeroServ = Utils.tratarVariavel(coletas.lerValorElementoID("listarServicoTecnicoForm:j_id313:j_id317"));
        
        irregularidade.setSituacaoGst(numeroServ);
        d.atualizar(irregularidade);
        

    }

}
