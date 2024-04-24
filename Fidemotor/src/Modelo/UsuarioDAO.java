
package Modelo;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion con= new Conexion();
    Connection acceso;
    
public Usuario ValidarUsuario(String contraseña, String identificacion){
     Usuario u= new Usuario();
    String sql= "select identificacion, contrasena from usuarios where identificacion= \"123456\" and contrasena = \"contrasena\";";
    try {
        acceso= con.Conectar();
        ps=acceso.prepareStatement(sql);
        ps.setString(1, contraseña);
        ps.setString(2, identificacion);
        rs= ps.executeQuery();
        while(rs.next()){
            u.setNombre(rs.getString(1));
            u.setApellidos(rs.getString(2));
            u.setTelefono(rs.getString(3));
            u.setIdentificacion(rs.getString(4));
            u.setContrasena(rs.getString(5));
            u.setDireccion(rs.getString(6));
            u.setSexo(rs.getString(7));
            u.setFechaNacimiento(rs.getString(8));
            u.setEstado(rs.getInt(9));
        }
    } catch (Exception e) {
    }
    return u;
}
}