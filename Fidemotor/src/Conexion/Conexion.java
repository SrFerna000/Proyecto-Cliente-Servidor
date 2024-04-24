
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
Connection con;
     String url= "jdbc:mysql://127.0.0.1:3306/fidemotor";
    String user="root";
    String pass= "123456789";
         public Connection Conectar() {
             try {
                 Class.forName("com.mysql.jdbc.Driver");
                 con=DriverManager.getConnection(url, user, pass);
             } catch (Exception e) {
             }
             return con;
    
    }

}
