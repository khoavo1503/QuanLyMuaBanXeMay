/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author QuanAB
 */
public class KetNoiCSDL {
    public static Connection con = null;
    public static KetNoiCSDL instance = new KetNoiCSDL();
    
    public static KetNoiCSDL getInstance() {
        return instance;
    }
    
    public void connect() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databasename=MUABANXEMAY";
        String user = "sa";
        String password = "sapassword";
        con = DriverManager.getConnection(url, user, password);
    }
    
    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static Connection getConnection() {
        System.out.println(con);
        return con;
    }
}
