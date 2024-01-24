/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import connectDB.KetNoiCSDL;
import entity.LoaiNhanVien;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class LoaiNhanVienDAO {
    public ArrayList<LoaiNhanVien> getAllLoaiNV() throws SQLException {
        ArrayList<LoaiNhanVien> dsLoaiNV = new ArrayList<>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM LoaiNhanVien";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String maLoaiNV = rs.getString(1);
                String tenLoaiNV = rs.getString(2);
                
                LoaiNhanVien loaiNV = new LoaiNhanVien(maLoaiNV, tenLoaiNV);
                dsLoaiNV.add(loaiNV);
            }
        } catch (Exception e) {
            System.err.println("getAllLoaiNV failed - pls check in LoaiNhanVienDAO");
            e.printStackTrace();
        } return dsLoaiNV;
    }
}
