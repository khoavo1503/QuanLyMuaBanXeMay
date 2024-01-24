/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.KetNoiCSDL;
import entity.LoaiXe;
import entity.Xe;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class SanPhamDAO {
    public ArrayList<Xe> getAllSanPham() throws SQLException {
        ArrayList<Xe> dsXe = new ArrayList<Xe>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Xe";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String maXe  = rs.getString(1);
                String tenXe = rs.getString(2);
                String mauXe = rs.getString(3);
                String nuocSanXuat = rs.getString(4);
                String hangXe = rs.getString(5);
                double giaXe = rs.getDouble(6);
                String soKhung = rs.getString(7);
                String phanKhoi = rs.getString(8);
                int soLuong = rs.getInt(9);
                LoaiXe loaiXe = new LoaiXe(rs.getString(10));
                Xe xe = new Xe(maXe, tenXe, mauXe, nuocSanXuat, hangXe, giaXe, soKhung, phanKhoi, soLuong, loaiXe);
                dsXe.add(xe);
            }
        } catch (Exception e) {
            System.err.println("GetAllSanPham failed - vui lòng kiểm tra trong SanPhamDAO");
            e.printStackTrace();
        } return dsXe;
    } 
//    Tìm xe qua mã xe
    public ArrayList<Xe> getSanPhamXeByMaXe(String maXe) throws SQLException {
        ArrayList<Xe> spXe = new ArrayList<Xe>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Select * from Xe WHERE maXe = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maXe);
            ResultSet rs = prepStmt.executeQuery();
            
            while (rs.next()) {
                String maXee = rs.getString(1);
                String tenXe = rs.getString(2);
                String mauXe = rs.getString(3);
                String nuocSanXuat = rs.getString(4);
                String hangXe = rs.getString(5);
                double giaBan = rs.getDouble(6);
                String soKhung = rs.getString(7);
                String phanKhoi = rs.getString(8);
                int soLuong = rs.getInt(9);
                LoaiXe loaiXe = new LoaiXe(rs.getString(10));
                
                Xe xe = new Xe(maXe, tenXe, mauXe, nuocSanXuat, hangXe, giaBan, soKhung, phanKhoi, soLuong, loaiXe);
                spXe.add(xe);
            }
        } catch (Exception e) {
            System.err.println("GetSanPhamXeByMaXe failed - vui lòng kiểm tra trong SanPhamDAO");
            e.printStackTrace();
        } return spXe;
        
    }
    
    public ArrayList<Xe> getSanPhamXeByLoaiXe(String maLoaiXe) throws SQLException {
        ArrayList<Xe> spXe = new ArrayList<Xe>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Select * from Xe WHERE maLoaiXe=?";
            prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maLoaiXe);
            ResultSet rs = prepStmt.executeQuery();
            
            while(rs.next()) {
                String maXe = rs.getString(1);
                String tenXe = rs.getString(2);
                String mauXe = rs.getString(3);
                String nuocSanXuat = rs.getString(4);
                String hangXe = rs.getString(5);
                double giaBan = rs.getDouble(6);
                String soKhung = rs.getString(7);
                String phanKhoi = rs.getString(8);
                int soLuong = rs.getInt(9);
                LoaiXe loaiXe = new LoaiXe(rs.getString(10));
                
                Xe xe = new Xe(maXe, tenXe, mauXe, nuocSanXuat, hangXe, giaBan, soKhung, phanKhoi, soLuong, loaiXe);
                spXe.add(xe);
            }
        } catch (Exception e) {
            System.err.println("GetSanPhamXeByLoaiXe failed - vui lòng kiểm tra trong SanPhamDAO");
            e.printStackTrace();
        } return spXe;
    }
    
    
    
    public boolean createXe (Xe xe) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n=0;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "INSERT INTO Xe VALUES (?,?,?,?,?,?,?,?,?,?)";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, xe.getMaXe());
            prepStmt.setString(2, xe.getTenXe());
            prepStmt.setString(3, xe.getMauXe());
            prepStmt.setString(4, xe.getNuocSanXuat());
            prepStmt.setString(5, xe.getHangXe());
            prepStmt.setDouble(6, xe.getGiaXe());
            prepStmt.setString(7, xe.getSoKhung());
            prepStmt.setString(8, xe.getPhanKhoi());
            prepStmt.setInt(9, xe.getSoLuong());
            prepStmt.setString(10, xe.getLoaiXe().getMaLoaiXe());
            
            n = prepStmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                prepStmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } return n>0;
    }

    public boolean updateXe (Xe xe) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n=0;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Update Xe set tenXe=?, mauXe=?, nuocSanXuat=?, hangXe=?, giaBan=?, soKhung=?, phanKhoi=?, soLuong=?, maLoaiXe=? WHERE maXe=?";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, xe.getTenXe());
            prepStmt.setString(2, xe.getMauXe());
            prepStmt.setString(3, xe.getNuocSanXuat());
            prepStmt.setString(4, xe.getHangXe());
            prepStmt.setDouble(5, xe.getGiaXe());
            prepStmt.setString(6, xe.getSoKhung());
            prepStmt.setString(7, xe.getPhanKhoi());
            prepStmt.setInt(8, xe.getSoLuong());
            prepStmt.setString(9, xe.getLoaiXe().getMaLoaiXe());
            prepStmt.setString(10, xe.getMaXe());
            
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
    
    public boolean deleteXe  (String maXe) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        PreparedStatement prepStmt = null;
        int n=0;
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Delete from Xe WHERE maXe=?";
            prepStmt = con.prepareStatement(sql);
            
            prepStmt.setString(1, maXe);
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
