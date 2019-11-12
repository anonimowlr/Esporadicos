package rotinassisbb;

import br.com.bb.jibm3270.RoboException;
import dao.FiscalizacaoDAO;
import entidades.Fiscalizar;

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
public class EnviaCorreioSisbb {

    List<Fiscalizar> lista = null;
    FiscalizacaoDAO fiscalizacaoDAO = new FiscalizacaoDAO();
    Robot robot;

    public EnviaCorreioSisbb() throws AWTException {
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

        lista = fiscalizacaoDAO.buscarParaEnviarCorreio();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Não há correio a ser enviado!!");
          return false;  
        }
        return true;
    }

    public void lerLista(Janela3270 sisbb) throws Throwable {

        for (Fiscalizar fiscalizar : lista) {

            enviarCorreio(fiscalizar, sisbb);

        }

    }

    private void enviarCorreio(Fiscalizar fiscalizar, Janela3270 sisbb) throws RoboException, InterruptedException, Exception {
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
        sisbb.teclar("FISCALIZAÇÃO - 3ª DEV/REG");
        sisbb.posicionar(6, 26);
        sisbb.teclar("S");
        sisbb.posicionar(7, 9);
        sisbb.teclar("De:    1915  CENOP SERVIÇOS CURITIBA (PR) ");
        sisbb.posicionar(8, 9);
        sisbb.teclar("Para:  "  + fiscalizar.getCdPrfDepe() + "  " +   fiscalizar.getNmDepe() );
        sisbb.posicionar(10, 9);
        sisbb.teclar("Sr.(a) Administrador,");
        sisbb.posicionar(12, 9);
        sisbb.teclar("Sua dependência possui operação com laudo de fiscalização irregular, ");
        sisbb.posicionar(13, 9);
        sisbb.teclar("com recusa de providências pela terceira vez,não sendo mais passível");
        sisbb.posicionar(14, 9);
        sisbb.teclar("o tratamento das irregularidades apontadas.");
        sisbb.posicionar(16, 9);
        sisbb.teclar("Serviço Técnico: "  + fiscalizar.getIdentific2()+ "/" + fiscalizar.getIdentific3());
        sisbb.posicionar(18, 9);
        sisbb.teclar("Mutuário: " + fiscalizar.getNmCli()+ ".");
        sisbb.posicionar(20, 9);
        sisbb.teclar("Nº Único Operação: " + fiscalizar.getIdentific1()+ ".");
       
        sisbb.teclarAguardarTroca("@8");
       
        sisbb.posicionar(9, 9);
        sisbb.teclar("A partir deste momento cabe à agência condutora:");
        
        sisbb.posicionar(11, 9);
        sisbb.teclar("   1. Após a regularização abrir novo serviço técnico , se for o caso.");
        
        sisbb.posicionar(12, 9);
        sisbb.teclar("   2. Caso não seja possível regularizar, proceder conforme IN 623 para ");
        sisbb.posicionar(13, 9);
        sisbb.teclar("   operações rurais ou normativos específicos para operações envolvendo  ");
        sisbb.posicionar(14, 9);
        sisbb.teclar("   crédito geral.  ");
        sisbb.posicionar(15, 9);
        sisbb.teclar("   3. Se a operação já estiver regularizada desconsiderar este correio. ");
        
        
        
        
        sisbb.posicionar(17, 9);
        sisbb.teclar("Atenciosamente");
        sisbb.posicionar(18, 9);
        sisbb.teclar("CENOP SERVIÇOS CURITIBA (PR)");
        sisbb.posicionar(19, 9);
        sisbb.teclar("Equipe Fisc  Irregularidades");
        
        
        
        
        
//        String textoEmail = "Prezados, \n"
//                + "\n"
//                + "Recebemos intimação vinculada ao NPJ: " + intimacao.getIdentific3().subSequence(0, 4).toString() + "/" + intimacao.getIdentific3().subSequence(4, intimacao.getIdentific3().length() - 3).toString() + "-" + intimacao.getIdentific3().subSequence(intimacao.getIdentific3().length() - 3, intimacao.getIdentific3().length()) + ".\n"
//                + "Processo sob condução do advogado(a):" + intimacao.getAdvogadoBb() + ".\n"
//                + "Gentileza verificar documento(s) anexado(s) ao processo em " + Utils.convertDateToString(intimacao.getDtEtpAtual()) + ".\n"
//                + "\n"
//                + "\n"
//                + "Atenciosamente\n"
//                + "\n"
//                + "\n"
//                + "CENOP SERVIÇOS CURITIBA (PR)    \n"
//                + "Cadastramento NPJ - Intimações \n"
//                + "\n\n"
//                + "\n\n";

//        sisbb.posicionar(7, 9);
//        Utils.copyCliboard(textoEmail);
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        Thread.sleep(1000);
        
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
       sisbb.teclar(fiscalizar.getCdPrfDepe());
       sisbb.teclarAguardarTroca("@9");
       sisbb.aguardar(21, 44, "Confirma");
       sisbb.posicionar(21, 60);
       sisbb.teclar("S");
       sisbb.teclarAguardarTroca("@9");
       
       if(sisbb.copiar(22, 48, 3).equals("não")){
           fiscalizar.setObs(sisbb.copiar(22, 28, 48));
           fiscalizacaoDAO.salvar(fiscalizar);
           return;
       }
       
       Thread.sleep(1000);
       if(sisbb.copiar(21, 40, 8).equals("MENSAGEM")){
           fiscalizar.setObs(sisbb.copiar(21, 40, 30));
           fiscalizar.setNumeroCorreio(sisbb.copiar(21, 40, 30));
           fiscalizar.setDataEnvioCorreio(Utils.getDataAtualFormatoMysql());
           fiscalizacaoDAO.salvar(fiscalizar);
       }
       
       
        

        

    }

}
