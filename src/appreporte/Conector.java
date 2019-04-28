package appreporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    
    
    
    
    
 public Connection conectar(){
 
     Connection c = null;
     
     try {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/la_torre", "root", "");

            System.out.println("Coneccion exitosa!");
     } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
     }
 
 
 return c;
 } 
    
    
    
    
    
    
    
    
    
}
