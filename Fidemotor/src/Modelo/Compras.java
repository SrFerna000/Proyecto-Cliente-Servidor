
package Modelo;


public class Compras {
    
      private Vehiculo vehiculo;
      private double precio;
    private String metodoPago;
    private String tipoDeTarjeta;
   

    public Compras(Vehiculo vehiculo,double precio, String metodoPago, String tipoDeTarjeta, String numeroTarjeta) {
        this.vehiculo = vehiculo;
        this.precio=precio;
        this.metodoPago = metodoPago;
        this.tipoDeTarjeta = tipoDeTarjeta;
        
    }

  

    public Compras() {
       
    }

  

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getTipoDeTarjeta() {
        return tipoDeTarjeta;
    }

    public void setTipoDeTarjeta(String tipoDeTarjeta) {
        this.tipoDeTarjeta = tipoDeTarjeta;
    }

    
    
    
}
