/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidades.Assunto;
import entidades.Fiscalizar;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;
import util.Utils;


/**
 *
 * @author f5078775
 */
public class FiscalizacaoDAO {
    String mensagem = "";
    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<Fiscalizar> buscarParaEnviarCorreio() {
    
        return  em.createQuery("From Fiscalizar i where i.numeroCorreio = null").getResultList();
        



    }

    public FiscalizacaoDAO() {
   em.clear();
    }
    
    
    

    public void salvar(Fiscalizar fiscalizar) {
        em.getTransaction().begin();
       
        try{
        if(fiscalizar.getCdPrc()== null){
          em.persist(fiscalizar);
          em.getTransaction().commit();
        } else{
            em.merge(fiscalizar);
            em.getTransaction().commit();
        }
        
        }catch(Exception e){
         mensagem = "Erro" + e;
          em.getTransaction().rollback();
        }


    }

    public List<Fiscalizar> buscarTudo() {
        return  em.createQuery("From Fiscalizar i").getResultList();
          

    }

    public List<Fiscalizar> consultaPorProtocolo(int protocolo) {
   
    EntityManager em = EntityManagerUtil.getEntityManager();
        
     
        
        List<Fiscalizar>  lista = new ArrayList<>();
        
        try{
          lista = em.createQuery("from Fiscalizar n where n.cdPrc =" + protocolo  ).getResultList();
            
            
            
            
            
        }catch(Exception ex){
            System.err.println(ex);
        }finally{
       
        }
       
        return  lista;
    
    
    
    }

    public void removeRegistro(String tb_tarifa, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
    
}
