/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import connectDB.KetNoiCSDL;
import entity.HoaDon;
import entity.HopDong;
import entity.NhanVien;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.PreparedStatement;
/**
 *
 * @author acer
 */
public class HoaDonDAO {
    public ArrayList<HoaDon> getAllHoaDon() throws SQLException {
        ArrayList<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            Statement stmt = con.createStatement();
            String sql = "Select * from HoaDon";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int maHoaDon = rs.getInt(1);
                LocalDateTime ngayLap = rs.getTimestamp(2).toLocalDateTime();
                double tongTien = rs.getDouble(3);
                String nguoiNhan = rs.getString(4);
                HopDong hopDong = new HopDong(rs.getString(5));
                NhanVien nhanVien = new NhanVien(rs.getString(6));
                
                HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, tongTien, nguoiNhan, hopDong, nhanVien);
                dsHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            System.err.println("GetAllHoaDon failed - vui lòng kiểm tra trong HoaDonDAO");
            e.printStackTrace();
        } return dsHoaDon;
    }
    
    public boolean themHoaDon(HoaDon hoaDon) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n=0;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "INSERT INTO HoaDon VALUES(?,?,?,?,?)";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, hoaDon.getNgayLapString());
            prepStmt.setDouble(2, hoaDon.getTongTien());
            prepStmt.setString(3, hoaDon.getNguoiNhan());
            prepStmt.setString(4, hoaDon.getHopDong().getMaHopDong());
            prepStmt.setString(5, hoaDon.getNhanVien().getMaNV());
            
            n = prepStmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                prepStmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } return n>0;
    }
}
