/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.KetNoiCSDL;
import entity.HopDong;
import entity.KhachHang;
import entity.NhanVien;
import entity.Xe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class HopDongDAO {
    public ArrayList<HopDong> getAllHopDong() throws SQLException {
        ArrayList<HopDong> dsHopDong = new ArrayList<HopDong>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            Statement stmt  = con.createStatement();
            String sql = "Select * from HopDong";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                String maHopDong = rs.getString(1);
                LocalDateTime ngayLap = rs.getTimestamp(2).toLocalDateTime();
                String thoiHanBaoHanh = rs.getString(3);
                double soTienPhaiTT = rs.getDouble(4);
                double soTienDaTT = rs.getDouble(5);
                String soLanTT = rs.getString(6);
                KhachHang kH = new KhachHang(rs.getInt(7));
                NhanVien nv = new NhanVien(rs.getString(8));
                Xe xe = new Xe(rs.getString(9));
                
                HopDong hopDong = new HopDong(maHopDong, ngayLap, thoiHanBaoHanh, soTienPhaiTT, soTienDaTT, soLanTT, kH, nv, xe);
                dsHopDong.add(hopDong);
            }
        } catch (Exception e) {
            System.err.println("GetAllHopDong failed - vui lòng kiểm tra trong HopDongDAO");
            e.printStackTrace();
        } return dsHopDong;
    }
    
    public boolean lapHopDong(HopDong hopDong) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n = 0;
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "INSERT INTO HopDong VALUES (?,?,?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, hopDong.getMaHopDong());
            prepStmt.setString(2, hopDong.getNgayLapString());
            prepStmt.setString(3, hopDong.getThoiHanBaoHanh());
            prepStmt.setDouble(4, hopDong.getSoTienPhaiTT());
            prepStmt.setDouble(5, hopDong.getSoTienDaTT());
            prepStmt.setString(6, hopDong.getSoLanTT());
            prepStmt.setInt(7, hopDong.getKhachHang().getMaKH());
            prepStmt.setString(8, hopDong.getNhanVien().getMaNV());
            prepStmt.setString(9, hopDong.getXe().getMaXe());
            
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
    
    public ArrayList<HopDong> getHopDongByMaHopDong (String maHopDong) throws SQLException {
        ArrayList<HopDong> banHopDong = new ArrayList<HopDong>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Select * from HopDong WHERE maHopDong = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maHopDong);
            ResultSet rs = prepStmt.executeQuery();
            
            while (rs.next()) {
                String maHopDongg = rs.getString(1);
                LocalDateTime ngayLap = rs.getTimestamp(2).toLocalDateTime();
                String thoiHanBaoHanh = rs.getString(3);
                double soTienPhaiTT = rs.getDouble(4);
                double soTienDaTT = rs.getDouble(5);
                String soLanTT = rs.getString(6);
                KhachHang kH = new KhachHang(rs.getInt(7));
                NhanVien nv = new NhanVien(rs.getString(8));
                Xe xe = new Xe(rs.getString(9));
                
                HopDong hopDong = new HopDong(maHopDongg, ngayLap, thoiHanBaoHanh, soTienPhaiTT, soTienDaTT, soLanTT, kH, nv, xe);
                banHopDong.add(hopDong);
            }
        } catch (Exception e) {
            System.err.println("GetHopDongByMaHopDong failed - vui lòng kiểm tra trong HopDongDAO");
            e.printStackTrace();
        } return banHopDong;
    }
    
    public boolean xoaHopDong(String maHopDong) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n=0;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Delete from HopDong WHERE maHopDong = ?";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, maHopDong);
            n=prepStmt.executeUpdate();
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
