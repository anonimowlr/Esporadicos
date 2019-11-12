/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidades.Cadastro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;


/**
 *
 * @author f5078775
 */
public class CadastroDAO {
    String mensagem = "";
    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<Cadastro> buscarParaLerAjureResponsavel() {
    
        return  em.createQuery("From Cadastro i where i.ajureResponsavel = null and i.identific3 !=null  and i.obs = null").getResultList();
        



    }

    public void salvar(Cadastro cadastro) {
        em.getTransaction().begin();
       
        try{
        if(cadastro.getCdPrc() == null){
          em.persist(cadastro);
          em.getTransaction().commit();
        } else{
            em.merge(cadastro);
            em.getTransaction().commit();
        }
        
        }catch(Exception e){
         mensagem = "Erro" + e;
          em.getTransaction().rollback();
        }


    }

    public List<Cadastro> buscarTudo() {
        return  em.createQuery("From Intimacao i").getResultList();
          

    }

    public List<Cadastro> consultaPorProtocolo(int protocolo) {
   
    EntityManager em = EntityManagerUtil.getEntityManager();
        
     
        
        List<Cadastro>  listaIntimacao = new ArrayList<>();
        
        try{
          listaIntimacao = em.createQuery("from Intimacao n where n.cdPrc =" + protocolo  ).getResultList();
            
            
            
            
            
        }catch(Exception ex){
            System.err.println(ex);
        }finally{
       
        }
       
        return  listaIntimacao;
    
    
    
    }
    
    
    public List<Cadastro> buscarParaEnviarCorreio() {
   
    EntityManager em = EntityManagerUtil.getEntityManager();
        
     
        
        List<Cadastro>  listaIntimacao = new ArrayList<>();
        
        try{
          listaIntimacao = em.createQuery("from Intimacao n where n.obs = null and n.ajureResponsavel !=null and n.ajureResponsavel <> '8661' " ).getResultList();
            
            
            
            
            
        }catch(Exception ex){
            System.err.println(ex);
        }finally{
       
        }
       
        return  listaIntimacao;
    
    
    
    }
    
    
    
    
}
