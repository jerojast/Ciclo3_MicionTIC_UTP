/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.Herramientas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Carlos Grajales
 */
public class OperacionesDB {
    
    public static void main(String[] args) {
        listarHerramienta();
        
        actualizarHerramienta(1, "PODADORA");
        
        
        //Herramienta herramienta = new Herramienta(1, "HR-1", "Taladro", "TEST", 5000, "foto");
        //System.out.println(herramienta);
    }
    
    
    public static void actualizarHerramienta(int id_herramienta, String nombre) {
        
        DBConnection con = new DBConnection();
        String sql = "UDPATE herramientas SET nombre = '" + nombre + "' where id_herramienta= " + id_herramienta;
    
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            con.desconectar();
        }
    }
    
    
    public static void listarHerramienta() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM herramientas";
        
         try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
             while (rs.next()) {
                 int id_herramienta = rs.getInt("id_herramienta");
                 String referencia = rs.getString("referencia");
                 String nombre= rs.getString("nombre");
                 String descripcion = rs.getString("descripcion");
                 double precio_alquiler_dia = rs.getDouble("precio_alquiler_dia");
                 String foto = rs.getString("foto");
                 int cantidad_disponible = rs.getInt("cantidad_disponible");
                 int cantidad_alquilada = rs.getInt("cantidad_alquilada");
                 
                 Herramientas herramientas = new Herramientas(id_herramienta, referencia, nombre, descripcion, precio_alquiler_dia, foto, cantidad_disponible, cantidad_alquilada );
                 System.out.println(herramientas.toString());
             }
             st.executeQuery(sql);  
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    
    }
    
    
    
    
    
}


