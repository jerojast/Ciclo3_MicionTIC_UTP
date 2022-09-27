/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carlos Grajales
 */
public class DBConnection {
    
    Connection connection;
    static String bd = "herramientasdb";
    static String port = "3307";
    static String login = "root";
    static String password = "admin";
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexion Exitosa");
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar() {
        connection = null;
    }
}
