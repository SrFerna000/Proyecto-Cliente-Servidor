
package Compras;

import InicioSesion.Vehiculos;


public class Compra {
    private Vehiculos vehiculo;
    private String metodoPago;
    private String tipoDeTarjeta;
    private String numeroTarjeta;
    
    public Compra(Vehiculos vehiculo, String metodoPago){
        this.vehiculo= vehiculo;
        this.metodoPago=metodoPago;
    }
    public Vehiculos getVehiculo(){
        return vehiculo;
    }
    public String ObtenerMetodoPago(){
        return metodoPago;
    }
    public void setDetallesTarjetaCredito(String tipoDeTarjeta, String numeroTarjeta){
        this.tipoDeTarjeta=tipoDeTarjeta;
        this.numeroTarjeta=numeroTarjeta;
    }
    public boolean TarjetaCreditoValida(){
        if(tipoDeTarjeta.equals("Visa")|| tipoDeTarjeta.equals("mastercard")){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Compra de: "+vehiculo+", Metodo de pago: "+metodoPago;
    }
}
