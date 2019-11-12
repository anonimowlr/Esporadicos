/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidades.Assunto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;
import util.Utils;


/**
 *
 * @author f5078775
 */
public class AssuntoDAO {
    String mensagem = "";
    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<Assunto> buscarParaLerAssunto() {
    
        //return  em.createQuery("From Assunto i where i.dataVerificacao < CURRENT_DATE  or i.dataVerificacao = null and i.assunto = null" ).getResultList();
        return  em.createQuery("From Assunto i where i.valorCausa = null" ).getResultList();
        



    }

    public void salvar(Assunto assunto) {
        em.getTransaction().begin();
       
        try{
        if(assunto.getCdPrc()== null){
          em.persist(assunto);
          em.getTransaction().commit();
        } else{
            em.merge(assunto);
            em.getTransaction().commit();
        }
        
        }catch(Exception e){
         mensagem = "Erro" + e;
          em.getTransaction().rollback();
        }


    }

    public List<Assunto> buscarTudo() {
        return  em.createQuery("From Assunto i").getResultList();
          

    }

    public List<Assunto> consultaPorProtocolo(int protocolo) {
   
    EntityManager em = EntityManagerUtil.getEntityManager();
        
     
        
        List<Assunto>  listaAssunto = new ArrayList<>();
        
        try{
          listaAssunto = em.createQuery("from Assunto n where n.cdPrc =" + protocolo  ).getResultList();
            
            
            
            
            
        }catch(Exception ex){
            System.err.println(ex);
        }finally{
       
        }
       
        return  listaAssunto;
    
    
    
    }
    
    
   
    
    
    
}
