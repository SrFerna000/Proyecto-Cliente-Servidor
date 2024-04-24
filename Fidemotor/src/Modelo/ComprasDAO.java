
package Modelo;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ComprasDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    public String compras(){
        String c="";
        String sql="select from Compra";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                c=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return c;
    }
    public int RealizarCompras(Compras c){
        Compras compras= new Compras();
        String sql="INSERT INTO Compra ( precio, metodo_pago, tipo_tarjeta) VALUES (?, ?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setDouble(1, c.getPrecio());
            ps.setString(2, c.getMetodoPago());
            ps.setString(3, c.getTipoDeTarjeta());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public int verCompras(Compras c){
        String sql="INSERT INTO Compra ( precio, metodo_pago, tipo_tarjeta) VALUES (?, ?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setDouble(1, c.getPrecio());
            ps.setString(2, c.getMetodoPago());
            ps.setString(3, c.getTipoDeTarjeta());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
}
