
package Modelo;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class VehiculoDAO implements CRUD {
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
       List<Vehiculo> lista= new ArrayList<>();
       String sql= "select * from vehiculos ";
        try {
            con= cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Vehiculo v=new Vehiculo();
                v.setId(rs.getInt(1));
                v.setTipo(rs.getString(2));
                v.setMarca(rs.getString(3));
                v.setModelo(rs.getString(4));
                v.setAño(rs.getInt(5));
                lista.add(v);
            }
        } catch (Exception e) {
        }
       return lista;
    }

    @Override
    public int add(Object []o) {
        int r=0;
       String sql= "INSERT INTO vehiculos (tipo, marca, modelo, año)VALUES ('Automóvil', 'Toyota', 'Corolla', 2022);";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object []o) {
        int r=0;
       String sql="update vehiculo set tipo=?, marca=?, modelo=?, año=? where Idvehiculo=? ";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql= "delete from vehiculo where IdVehiculo=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    
}
