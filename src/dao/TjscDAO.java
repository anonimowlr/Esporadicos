/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import conexaoJDBC.Conector;
import java.sql.Statement;


/**
 *
 * @author f5078775
 */
public class TjscDAO {
    
    
    public  String ler()
    {
        String sql = "SELECT * FROM esporadico.tb_subconta_tjsc where captura = 0";
        return sql;
    }
    
    
    public  void update(String npj, String subconta) throws Throwable
    {
        Conector con = new Conector();
        Statement stUpdate = con.conectar().createStatement();
        
        String sql = "insert into esporadico.tb_subconta_tjsc_resultado (npj, subconta) values "
                + " ('"+npj+"', '"+subconta+"')";
        stUpdate.execute(sql);
        stUpdate.close();
        
        capturado(npj);
    }
    
    
    public void update(String npj, String subconta, String titular, String cnpj) throws Throwable
    {
        Conector con = new Conector();
        Statement stUpdate = con.conectar().createStatement();
        
        titular = titular.replace("'", "");
        String sql = "insert into esporadico.tb_subconta_tjsc_resultado (npj, subconta, titular, cnpj) values "
                + " ('"+npj+"', '"+subconta+"', '"+titular+"', '"+cnpj+"')";
        stUpdate.execute(sql);
        stUpdate.close();
        
        capturado(npj);
    }
    
    
    public void capturado(String npj) throws Throwable
    {
       Conector con = new Conector();
        Statement stUpdate = con.conectar().createStatement();
        
        String sql = "update esporadico.tb_subconta_tjsc set captura = '-1' where npj = '" + npj + "'";
        stUpdate.execute(sql);
        stUpdate.close();
    }
   
    
    
    
}
