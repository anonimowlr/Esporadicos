package conexaoJDBC;
import java.sql.*;

public class Conector {
    //abre e retorna a conexao com o mysql
    public Connection conect;
    
    public Connection conectar()throws Throwable{
        
        String servidor = "172.20.0.33";
        String usuario = "lucia";
        String senha = "EaBwZrzt";
        String banco = "aof";
        
        String url = "jdbc:mysql://"+servidor+":3306/"+banco;
        Connection conect = DriverManager.getConnection(url,usuario,senha);
        return  conect;
    }       
    public Connection conectar250()throws Throwable{
        
        String servidor = "10.105.87.250";
        String usuario = "lucia";
        String senha = "EaBwZrzt";
        String banco = "aof";
        
        String url = "jdbc:mysql://"+servidor+":3306/"+banco;
        Connection conect = DriverManager.getConnection(url,usuario,senha);
        return  conect;
    }   
    
    public void fechar() throws SQLException
    {
        //conect.close();
    }
}


