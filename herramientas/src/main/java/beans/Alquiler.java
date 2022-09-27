/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;

/**
 *
 * @author Carlos Grajales
 */
public class Alquiler {
    private int id;
    private String username;
    private int herramienta;
    private String num_factura;
    private Date fecha_alquiler;
    private Date fecha_devolucion;
    private Date fecha_limite_devolucion;
    private int cantidad_solicitada;
    private double costo_total;

    public Alquiler(int id, String username, int herramienta, String num_factura, Date fecha_alquiler, Date fecha_devolucion, Date fecha_limite_devolucion, int cantidad_solicitada, double costo_total) {
        this.id = id;
        this.username = username;
        this.herramienta = herramienta;
        this.num_factura = num_factura;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.fecha_limite_devolucion = fecha_limite_devolucion;
        this.cantidad_solicitada = cantidad_solicitada;
        this.costo_total = costo_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_herramienta() {
        return herramienta;
    }

    public void setId_herramienta(int herramienta) {
        this.herramienta = herramienta;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Date getFecha_limite_devolucion() {
        return fecha_limite_devolucion;
    }

    public void setFecha_limite_devolucion(Date fecha_limite_devolucion) {
        this.fecha_limite_devolucion = fecha_limite_devolucion;
    }

    public int getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(int cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", herramienta=" + herramienta + ", num_factura=" + num_factura + ", fecha_alquiler=" + fecha_alquiler + ", fecha_devolucion=" + fecha_devolucion + ", fecha_limite_devolucion=" + fecha_limite_devolucion + ", cantidad_solicitada=" + cantidad_solicitada + ", costo_total=" + costo_total + '}';
    }

   
    
   

}
