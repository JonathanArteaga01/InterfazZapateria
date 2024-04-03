

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String bd = "BD_Prueba1";
    private static final String usuario = "root";
    private static final String password = "Diana24183";
    private static final String host = "localhost";
    private static final String puerto = "3306";
    private final String url;
    
    
    private Connection conexion;
    
    public Conexion(){
    url = "jdbc:mysql://" + host + ":" + puerto + "/" + bd;
    }
   public boolean abrir(){
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = DriverManager.getConnection(url,usuario, password);
       return true;
   }catch (SQLException | ClassNotFoundException e){
        return false;
               }
   }
    
    
public Connection obtener(){

    return conexion;
}
public boolean cerrar(){
    try{
    conexion.close();
    return true;
    }catch (SQLException e){
        return false;
    }    
  }
}
    