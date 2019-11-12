package rotinassisbb;

import br.com.bb.jibm3270.RoboException;
import dao.CntDAO;
import entidades.Cnt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sisbbgeneric.LogarUsuarioSisbb;
import sisbbgeneric.Janela3270;
import util.Utils;

/**
 *
 * @author suporte
 */
public class GerarPartidataEGT {

    List<Cnt> lista = new ArrayList<>();
    CntDAO cntDAO = new CntDAO();

    public void inicioRotinaSisbb(Janela3270 sisbb, String sistema) throws Throwable {

        LogarUsuarioSisbb logar = new LogarUsuarioSisbb();
        logar.autenticar(sistema, sisbb);

        posicionarTela(sisbb);

        createList(sisbb);

        lerLista(sisbb);

    }

    private void posicionarTela(Janela3270 sisbb) throws RoboException {

        sisbb.aguardar(1, 3, "EGT");

        sisbb.posicionar(19, 20);
        sisbb.teclar("01");
        sisbb.teclarAguardarTroca("@E");

    }

    public void createList(Janela3270 sisbb) throws SQLException {

        lista = cntDAO.buscarParaEfetuarPartida();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Não há registros para coletar");
        }

    }

    public void lerLista(Janela3270 sisbb) throws Throwable {

        for (Cnt cnt : lista) {

            coletaSisbb(cnt, sisbb);

        }

    }

    private void coletaSisbb(Cnt cnt, Janela3270 sisbb) throws RoboException {
        int i;
        while (!sisbb.copiar(5, 3, 8).equals("Registro")) {

            String texto = sisbb.copiar(18, 3, 5);
            texto = sisbb.copiar(18, 3, 5);

            sisbb.teclarAguardarTroca("@3");
        }

        sisbb.aguardar(19, 3, "Informe");
        sisbb.posicionar(19, 20);
        sisbb.teclar("  ");
        sisbb.posicionar(19, 20);
        sisbb.teclar("01");
        sisbb.posicionar(21, 20);
        sisbb.teclar("    ");
        sisbb.posicionar(21, 20);
        sisbb.teclar(cnt.getAgencia());
        System.out.println(cnt.getAgencia());
        sisbb.teclarAguardarTroca("@E");

        sisbb.aguardar(4, 3, "Instituição");

        sisbb.posicionar(7, 16);

        switch (cnt.getRazao()) {
            case "288409010": //OK
                sisbb.teclar("872953"); // substituido o eventos 872955 por 872953
                sisbb.teclarAguardarTroca("@E");
                sisbb.posicionar(9, 6);
                sisbb.teclar("x");
                cnt.setEvento("872953");
                break;
            case "288409020": //OK
                sisbb.teclar("872949");
                sisbb.teclarAguardarTroca("@E");
                sisbb.posicionar(9, 6);
                sisbb.teclar("x");
                cnt.setEvento("872949");
                break;
            case "288401050"://OK
                sisbb.teclar("872956");
                sisbb.teclarAguardarTroca("@E");
                sisbb.posicionar(9, 6);
                sisbb.teclar("x");
                cnt.setEvento("872956");
                break;
            case "288403010": //OK
                sisbb.teclar("872962");
                sisbb.teclarAguardarTroca("@E");
                sisbb.posicionar(9, 6);
                sisbb.teclar("x");
                cnt.setEvento("872962");
                break;
            case "288403050"://OK
                sisbb.teclar("872961");
                sisbb.teclarAguardarTroca("@E");
                sisbb.posicionar(9, 6);
                cnt.setEvento("872961");
                sisbb.teclar("x");
                break;
            default:
                break;
        }

        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(4, 3, "Instituição");
        sisbb.posicionar(16, 3);
        sisbb.teclar("x");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(1, 3, "EGTN1100");
        sisbb.posicionar(6, 16);
        sisbb.teclar(cnt.getConta());
        System.out.println(cnt.getConta());
        sisbb.posicionar(7, 16);
        sisbb.teclar(cnt.getSaldoDebAtual().toString());
        System.out.println(cnt.getSaldoDebAtual());
        sisbb.posicionar(8, 16);
        sisbb.teclar("N");
        sisbb.teclarAguardarTroca("@E");
        sisbb.posicionar(12, 6);
        sisbb.teclar("9599");
        sisbb.posicionar(12, 23);
        sisbb.teclar(cnt.getSaldoDebAtual().toString());
        System.out.println(cnt.getSaldoDebAtual());
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(22, 3, "Confirma");
        sisbb.posicionar(22, 36);
        sisbb.teclar("S");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(23, 3, "Pressione");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(8, 3, "Serviço");
        sisbb.posicionar(8, 16);
        sisbb.teclar("20180258");
        sisbb.teclarAguardarTroca("@E");
        sisbb.aguardar(10, 13, "Histórico");
        sisbb.posicionar(12, 13);
        sisbb.teclar("CFE NT-2018/00258-DIRIS-31.12.2018, RECONH. DESPESA DEP.JUDICIAL.");
        sisbb.posicionar(13, 13);
        sisbb.teclar("BCO : " + cnt.getInstDepCnt() + " MODALIDADE:" + cnt.getModDepCnt() + " DEP: " + cnt.getNDepositoCnt() + "." );
        sisbb.posicionar(14, 13);
        sisbb.teclar("NPJ : " + cnt.getBbjurCnt() + ".");
        System.out.println(cnt.getBbjurCnt());
        sisbb.posicionar(15, 13);
        sisbb.teclar("QUE ORA BAIXAMOS CFE NT SUPRA.");
        
        sisbb.teclarAguardarTroca("@E");
        
        if(sisbb.copiar(17, 7, 6).equals("Existe") && sisbb.copiar(12 , 35, 9).equals("Cancelado") ){
           
            sisbb.teclarAguardarTroca("@E");
        }
        
        sisbb.aguardar(22, 3, "Confirma");
        sisbb.posicionar(22, 37);
        sisbb.teclar("S");
        sisbb.teclarAguardarTroca("@E");
        
        sisbb.aguardar(23 , 3, "Lançamento Efetuado");
        cnt.setEgt(sisbb.copiar(23, 24, 8));
        cnt.setSitEgt("Partida efetuada");
        
        
        cntDAO.salvar(cnt);

    }

}
