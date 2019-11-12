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
public class ColetarSaldoDeb {
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

        
        
        
        
        sisbb.aguardar(1, 3, "DEBM0050");
        sisbb.teclarAguardarTroca("@E");
        sisbb.posicionar(21, 11);
        sisbb.teclar("40");
        sisbb.teclarAguardarTroca("@E");
        
    }

    
    
    
    public void createList(Janela3270 sisbb) throws SQLException {

      lista = cntDAO.buscarParaSaldoCnt();
        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "Não há registros para coletar");
        } 

    }

    public void lerLista(Janela3270 sisbb) throws Throwable {


        for (Cnt cnt : lista) {

          
           
            coletaSisbb(cnt, sisbb);

           

        }

    }

    private void coletaSisbb(Cnt cnt ,Janela3270 sisbb) throws RoboException {
        int i;
        while (!sisbb.copiar(18, 3, 5).equals("Opção")) {
            
            String texto = sisbb.copiar(18, 3, 5);
             texto = sisbb.copiar(18, 3, 5);
            
            sisbb.teclarAguardarTroca("@3");
        }
        
        
        
        
        sisbb.aguardar(18, 3, "Opção");
        sisbb.posicionar(18, 16);
        sisbb.teclar("06");
        sisbb.posicionar(20, 16);
        sisbb.teclar("    ");
        sisbb.posicionar(20, 16);
        sisbb.teclar(cnt.getAgencia());
        sisbb.posicionar(21, 16);
        sisbb.teclar("          ");
        sisbb.posicionar(21, 16);
        sisbb.teclar(cnt.getConta());
        
        sisbb.teclarAguardarTroca("@E");
        
        sisbb.aguardar(1, 3, "DEBM406A");
        
        cnt.setSaldoDebAtual(Utils.converterStringParaBigDecimal(sisbb.copiar(6, 61, 20)));
         try {
             cnt.setDataSaldoDeb(Utils.getDataAtualFormatoMysql());
         } catch (Exception ex) {
             Logger.getLogger(ColetarSaldoDeb.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        cntDAO.salvar(cnt);
        
               
    }

    
    
    
    
    

    
}
