package rotinassisbb;

import br.com.bb.jibm3270.RoboException;
import dao.FiscalizacaoDAO;
import dao.IrregularidadeDAO;
import entidades.Fiscalizar;
import entidades.Irregularidade;

import java.awt.AWTException;
import java.awt.Robot;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import sisbbgeneric.Janela3270;
import sisbbgeneric.LogarUsuarioSisbb;
import util.Utils;

/**
 *
 * @author suporte
 */
public class EnviaCorreioSisbbIrregularidade {

    List<Irregularidade> lista = null;
    IrregularidadeDAO<Irregularidade> d = new IrregularidadeDAO<>();
    Robot robot;

    public EnviaCorreioSisbbIrregularidade() throws AWTException {
        this.robot = new Robot();
    }

    public void inicioRotinaSisbb(Janela3270 sisbb, String sistema) throws Throwable {
       
        
        if( createList(sisbb)== false){
           return;
        }
        LogarUsuarioSisbb logar = new LogarUsuarioSisbb();
        logar.autenticar(sistema, sisbb);

        posicionarTela(sisbb);

       

        lerLista(sisbb);

    }

    private void posicionarTela(Janela3270 sisbb) throws RoboException {

        sisbb.aguardar(1, 2, "COEPC001");
        sisbb.teclarAguardarTroca("@E");
        sisbb.posicionar(21, 17);
        sisbb.teclar("01");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(21, 3, "Informe Opção");
       

    }

    public boolean createList(Janela3270 sisbb) throws SQLException {

        lista = d.buscarParaEnviarCorreio();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Não há correio a ser enviado!!");
          return false;  
        }
        return true;
    }

    public void lerLista(Janela3270 sisbb) throws Throwable {

        for (Irregularidade irregularidade : lista) {

            enviarCorreio(irregularidade, sisbb);

        }

    }

    private void enviarCorreio(Irregularidade irregularidade, Janela3270 sisbb) throws RoboException, InterruptedException, Exception {
        int i;
        while (!sisbb.copiar(6 , 9, 4).equals("Novo")) {
            sisbb.teclarAguardarTroca("@3");
        }

        
        
        sisbb.aguardar(21, 3, "Informe Opção");
        sisbb.posicionar(21, 18);
        sisbb.teclar("01");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(4, 3, "Titulo"); 
        sisbb.posicionar(4, 26);
        sisbb.teclar("FISC. TRAT. IRREGULARIDADES");
        sisbb.posicionar(6, 26);
        sisbb.teclar("S");
        sisbb.posicionar(7, 9);
        sisbb.teclar("De:    1915  CENOP SERVIÇOS CURITIBA (PR) ");
        sisbb.posicionar(8, 9);
        sisbb.teclar("Para:  "  + irregularidade.getCdPrfDepe() + "  " +   irregularidade.getNmDepe() );
        sisbb.posicionar(10, 9);
        sisbb.teclar("PROCEDIMENTOS TRATAMENTO DE IRREGULARIDADES EM FISCALIZAÇÃO");
        sisbb.posicionar(12, 9);
        sisbb.teclar("O serviço técnico deve ser consultado no aplicativo GST, na aba  ");
        sisbb.posicionar(13, 9);
        sisbb.teclar("**consultar**,apresentando os estados 103, 203 e 205, a agência deverá:");
        sisbb.posicionar(15, 9);
        sisbb.teclar("1. Analisar a IRREGULARIDADE e informar as providências adotadas para a regularização no aplicativo GST. A agência deverá consultar o relatório de fiscalização, consultado o serviço técnico e após clicar na aba:");
        sisbb.posicionar(18, 9);
        sisbb.teclar("**consultar formulário**");
        
        
        
        
        sisbb.posicionar(20, 9);
        sisbb.teclar("2. Se ao informar providências, marcar o apontamento **agendar nova fis-calização**, não é gerado serviço automaticamente, deve ser aberto novo");
      
        sisbb.teclarAguardarTroca("@8");
        
        sisbb.posicionar(8, 9);
        sisbb.teclar("serviço na aba **incluir**.");
       
        sisbb.posicionar(10, 9);
        sisbb.teclar("3.Após o registro das providências é gerado protocolo (prazo de 15 dias corridos) para o CENOP Serviços Curitiba analisar as providências,");
        sisbb.posicionar(12, 9);
        sisbb.teclar("podendo recusar ou validar as informações.");
      
        sisbb.posicionar(13, 9);
        sisbb.teclar("No caso de RECUSA, a agência será informada através de registro no apli-cativo do GST sobre o motivo da RECUSA, deverá providenciar a ");
       
        sisbb.posicionar(15, 9);
        sisbb.teclar("regularização conforme as observações registradas.");
        
        sisbb.posicionar(16, 9);
        sisbb.teclar("A consulta ao motivo  da recusa é realizada no detalhamento do serviço ");
        sisbb.posicionar(17, 9);
        sisbb.teclar("técnico, clicando em cima do estado (Estado 205 - IRREGULAR - DEVOLVIDO pela DEP. VALIDADORA ), sempre em azul. ");
      
        sisbb.teclarAguardarTroca("@8");
        
        
        
        sisbb.posicionar(9, 9);
        sisbb.teclar("4.PRIORIZAÇÕES de análise,caso a IRREGULARIDADE esteja impactando a con-tratação ou liberação de operações do cliente, a agência deverá  solici-tar ao CENOP Serviços Curitiba a priorização da análise através do Fale com o CENOP. ");
        
        sisbb.posicionar(14, 9);
        sisbb.teclar("5.Orientações constam nas INs 01, 29, 623, 677, 749, todas relacionadas as linhas de créditos oferecidas. ");
       
        sisbb.posicionar(17, 9);
        sisbb.teclar("6.As dúvidas devem ser registradas através do Fale com o CENOP,  página da UOP.");
        
        sisbb.teclarAguardarTroca("@8");
        
        sisbb.posicionar(9, 9);
        sisbb.teclar("IMPORTANTE: Não é necessário que a agência se manifeste via SICOM nos casos em que o apontamento for de NOTIFICAR e VALIDAR.");
        
        
        
       // sisbb.teclarAguardarTroca("@8");
        
        sisbb.posicionar(16, 9);
        sisbb.teclar("Atenciosamente");
        sisbb.posicionar(17, 9);
        sisbb.teclar("CENOP SERVIÇOS CURITIBA (PR)");
        sisbb.posicionar(18, 9);
        sisbb.teclar("Equipe Fisc  Irregularidades");
        sisbb.posicionar(19, 9);
        sisbb.teclar("E-mail: cenopserv.tratamento@bb.com.br");
        
        
        
        
        
        
       sisbb.teclarAguardarTroca("@9");
       sisbb.aguardar(6, 9, "Para Dependencias");
       sisbb.posicionar(21, 18);
       sisbb.teclar("01");
       sisbb.teclarAguardarTroca("@E");
       sisbb.aguardar(4 , 28, "Dependência"); 
       sisbb.posicionar(5 , 46);
       sisbb.teclar("FISCIRREGP");
       sisbb.posicionar(7, 46);
       sisbb.teclar("001");
       sisbb.posicionar(8, 46);
       sisbb.teclar(irregularidade.getCdPrfDepe());
       sisbb.teclarAguardarTroca("@9");
       
       if(sisbb.copiar(22, 48, 3).equals("não")){
           irregularidade.setObs(sisbb.copiar(22, 28, 48));
           d.salvar(irregularidade);
           return;
       }
       
       sisbb.aguardar(21, 44, "Confirma");
       sisbb.posicionar(21, 60);
       sisbb.teclar("S");
       sisbb.teclarAguardarTroca("@9");
       Thread.sleep(1000);
       if(sisbb.copiar(21, 40, 8).equals("MENSAGEM")){
           irregularidade.setObs(sisbb.copiar(21, 40, 30));
           irregularidade.setNumeroCorreio(sisbb.copiar(21, 40, 30));
           irregularidade.setDataEnvioCorreio(Utils.getDataAtualFormatoMysql());
           d.atualizar(irregularidade);
       }
       
       
        

        

    }

}
