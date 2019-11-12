/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import entidades.ValorCausa;

import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;


/**
 *
 * @author f5078775
 */
public class ValorCausaDAO {
    String mensagem = "";
    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<ValorCausa> buscarParaLerValorCausa() {
    
        return  em.createQuery("From ValorCausa i where i.obs = null and i.npj !=null and i.vlrCausa = null").getResultList();
        



    }

    public void salvar(ValorCausa valorCausa) {
        em.getTransaction().begin();
       
        try{
        if(valorCausa.getId()== null){
          em.persist(valorCausa);
          em.getTransaction().commit();
        } else{
            em.merge(valorCausa);
            em.getTransaction().commit();
        }
        
        }catch(Exception e){
         mensagem = "Erro" + e;
          em.getTransaction().rollback();
        }


    }

    
    
}
