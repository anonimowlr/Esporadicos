/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidades.Assunto;
import entidades.Fiscalizar;
import entidades.Irregularidade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import jpa.EntityManagerUtil;
import util.Utils;


/**
 *
 * @author f5078775
 */
public class IrregularidadeDAO<T> {
    private String mensagem = "";
    private EntityManager em ;
    
    
    public List<Irregularidade> buscarParaEnviarCorreio() {
    
        return  getEm().createQuery("From Irregularidade i where i.numeroCorreio = null and (i.situacaoGst = '103' or i.situacaoGst = '203' or  i.situacaoGst = '205' )").getResultList();
        



    }
    
    public List<Irregularidade> buscarParaLerSitServTecnico() {
    
        return  getEm().createQuery("From Irregularidade i where i.situacaoGst = null").getResultList();
        



    }

    public IrregularidadeDAO() {
        
        em = EntityManagerUtil.getEntityManager();
    }
    
    
    

    public boolean salvar(T objeto) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(objeto);
            getEm().getTransaction().commit();
            setMensagem("Salvo com sucesso");
            return true;
        } catch (Exception e) {
            rollback();
            atualizar(objeto);
//            mensagem ="Erro ao salvar - "  + Util.getMensagemErro(e);
//            Util.mensagemErro(mensagem);
            return false;
        }

    }
    
    
    
    public boolean atualizar(T objeto) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(objeto);
            getEm().getTransaction().commit();
            setMensagem("Atualizado com sucesso");
            return true;

        } catch (Exception e) {
            rollback();
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
    
    
    public void rollback() {
        if (getEm().getTransaction().isActive() == false) {
            getEm().getTransaction().begin();
        }

        getEm().getTransaction().rollback();
    }
    
    
    

    public List<Irregularidade> buscarTudo() {
        getEm().clear();
        return  getEm().createQuery("From Irregularidade i").getResultList();
          

    }

    public List<Irregularidade> consultaPorProtocolo(int protocolo) {
    
        getEm().clear();
        
    
        
        List<Irregularidade>  lista = new ArrayList<>();
        
        try{
          lista = getEm().createQuery("from Irregularidade n where n.cdPrc =" + protocolo  ).getResultList();
            
            
            
            
            
        }catch(Exception ex){
            System.err.println(ex);
        }finally{
       
        }
       
        return  lista;
    
    
    
    }

    public void removeRegistro(String tb_tarifa, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    
   
    
    
    
}
