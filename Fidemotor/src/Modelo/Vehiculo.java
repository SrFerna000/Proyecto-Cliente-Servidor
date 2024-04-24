
package Modelo;


public class Vehiculo {
    private int id;
    private String tipo;
    private String marca;
    private String modelo;
    private int año;
    
    public Vehiculo(){
        this.id=0;
        this.tipo="";
        this.marca="";
        this.modelo="";
        this.año=0;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
}
