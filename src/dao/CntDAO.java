/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import entidades.Cnt;
import entidades.ValorCausa;

import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;


/**
 *
 * @author f5078775
 */
public class CntDAO {
    String mensagem = "";
    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<Cnt> buscarParaSaldoCnt() {
    
        return  em.createQuery("From Cnt i ").getResultList();
        



    }
    
    public List<Cnt> buscarParaEfetuarPartida() {
    
        return  em.createQuery("From Cnt i where i.egt = null ").getResultList();
        



    }
    
    
    

    public void salvar(Cnt cnt) {
        em.getTransaction().begin();
       
        try{
        if(cnt.getId()== null){
          em.persist(cnt);
          em.getTransaction().commit();
        } else{
            em.merge(cnt);
            em.getTransaction().commit();
        }
        
        }catch(Exception e){
         mensagem = "Erro" + e;
          em.getTransaction().rollback();
        }


    }

    
    
}
