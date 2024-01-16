/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class config {
       public static Connection conn;
    
     public static Connection Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_penjualan_buku","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void main(String args[]){
        System.out.println(config.Conn());
    }
}
    