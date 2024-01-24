/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.KetNoiCSDL;
import entity.LoaiXe;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class LoaiSanPhamDAO {
    public ArrayList<LoaiXe> getAllLoaiSanPham() throws SQLException {
        ArrayList<LoaiXe> dsLoaiXe = new ArrayList<>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM LoaiXe";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String maLoaiXe = rs.getString(1);
                String tenLoaiXe = rs.getString(2);
                LoaiXe loaiXe = new LoaiXe(maLoaiXe, tenLoaiXe);
                dsLoaiXe.add(loaiXe);
            }
        } catch (Exception e) {
            System.err.println("getAllLoaiXe failed - pls check in LoaiXeDAO");
            e.printStackTrace();
        } return dsLoaiXe;
    }
    
    
}
