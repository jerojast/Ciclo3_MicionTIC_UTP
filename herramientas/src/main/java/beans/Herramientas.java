/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Carlos Grajales
 */
public class Herramientas {
 private int id_herramienta;
 private String referencia;
 private String nombre;
 private String descripcion;
 private double precio_alquiler_dia;
 private String foto;
 private int cantidad_disponible;
 private int cantidad_alquilada;

    public Herramientas(int id_herramienta, String referencia, String nombre, String descripcion, double precio_alquiler_dia, String foto, int cantidad_disponible, int cantidad_alquilada) {
        this.id_herramienta = id_herramienta;
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_alquiler_dia = precio_alquiler_dia;
        this.foto = foto;
        this.cantidad_disponible = cantidad_disponible;
        this.cantidad_alquilada = cantidad_alquilada;
    }

   
    public Herramientas() {
        
    }

    public int getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_alquiler_dia() {
        return precio_alquiler_dia;
    }

    public void setPrecio_alquiler_dia(double precio_alquiler_dia) {
        this.precio_alquiler_dia = precio_alquiler_dia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public int getCantidad_alquilada() {
        return cantidad_alquilada;
    }

    public void setCantidad_alquilada(int cantidad_alquilada) {
        this.cantidad_alquilada = cantidad_alquilada;
    }

    @Override
    public String toString() {
        return "Herramientas{" + "id_herramienta=" + id_herramienta + ", referencia=" + referencia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio_alquiler_dia=" + precio_alquiler_dia + ", foto=" + foto + ", cantidad_disponible=" + cantidad_disponible + ", cantidad_alquilada=" + cantidad_alquilada + '}';
    }
    
    
    

    

    
    
}
