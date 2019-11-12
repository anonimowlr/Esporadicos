package rotinassisbb;


import br.com.bb.jibm3270.RoboException;
import dao.CntDAO;
import entidades.Cnt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sisbbgeneric.LogarUsuarioSisbb;
import sisbbgeneric.Janela3270;

/**
 *
 * @author suporte
 */
public class ColetaSituacaoPartida {
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

        sisbb.aguardar(6, 9, "Confeccionar");

        sisbb.posicionar(19, 20);
        
        
        
        
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
      
        while (!sisbb.copiar(19, 3, 15).equals("Informe a opção")) {
            sisbb.teclarAguardarTroca("@3");
            
        
        }
        
        
       

        sisbb.teclar("21");
        sisbb.teclarAguardarTroca("@E");

        sisbb.aguardar(1, 3, "EGTM153L");

     
        
        
        sisbb.posicionar(10, 5);
        sisbb.teclar(cnt.getEgt());
        sisbb.teclarAguardarTroca("@E");
        
        if(sisbb.copiar(23, 3, 3).equals("Nen")){
         return;
        }

        sisbb.aguardar(11, 3, "_");

        sisbb.posicionar(11, 3);
        sisbb.teclar("x");
        sisbb.teclarAguardarTroca("@E");

        sisbb.aguardar(13, 8, "Evento");

        String lancamento = sisbb.copiar(7, 20, 8);

        if (!lancamento.equals(cnt.getEgt())) {
           
            cnt.setSitEgt("Partida não encontrada");
            return;
        }

        String n = sisbb.copiar(11, 17, 15);

        if (!n.equals("")) {

           cnt.setSitEgt(n); 
          
           
        }
         cntDAO.salvar(cnt);
        
               
    }

    
    
    
    
    

    
}
