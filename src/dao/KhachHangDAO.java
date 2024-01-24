/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.KetNoiCSDL;
import entity.KhachHang;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class KhachHangDAO {

    public ArrayList<KhachHang> getAllKhachHang() throws SQLException {
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            Statement stmt = con.createStatement();
            String sql = "Select * from KhachHang";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int maKH = rs.getInt(1);
                String hoTen = rs.getString(2);
                String soDT = rs.getString(3);
                String diaChi = rs.getString(4);
                String soCCCD = rs.getString(5);
                boolean gioiTinh = rs.getBoolean(6);

                KhachHang kH = new KhachHang(maKH, hoTen, soDT, diaChi, soCCCD, gioiTinh);
                dsKH.add(kH);
            }
        } catch (Exception e) {
            System.err.println("GetAllKhachHang failed - vui lòng kiểm tra trong KhachHangDAO");
            e.printStackTrace();
        }
        return dsKH;
    }

    public void themKhachHang(KhachHang kh) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            String sql = "INSERT INTO KhachHang VALUES (?,?,?,?,?)";
            PreparedStatement prepStmt = con.prepareStatement(sql);

            prepStmt.setString(1, kh.getHoTenKH());
            prepStmt.setString(2, kh.getSoDT());
            prepStmt.setString(3, kh.getDiaChi());
            prepStmt.setString(4, kh.getSoCCCD());
            prepStmt.setBoolean(5, kh.isGioiTinh());

            prepStmt.executeUpdate();

        } catch (Exception e) {
            System.err.println("Kiểm tra themKhachHang - KhachHangDAO");
            e.printStackTrace();
        }
    }

    public int getLastMaKH() throws SQLException {
        int maCuoi = 0;
        KetNoiCSDL.getInstance();
        KetNoiCSDL knCSDL = new KetNoiCSDL();
        knCSDL.connect();
        Connection con = knCSDL.getConnection();

        String sql = "SELECT max(maKH) as LastKH FROM KhachHang";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            maCuoi = rs.getInt(1);

        } catch (Exception e) {
            System.err.println("Kiểm tra getLastMaKH - KhachHangDAO");
            e.printStackTrace();
        }

        return maCuoi;
    }
    
    public ArrayList<KhachHang> getKhachHangByMaKH(String maKH) throws SQLException {
        ArrayList<KhachHang> kh = new ArrayList<KhachHang>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();
        
        Connection con = ketNoiCSDL.getConnection();
        
        try {
            String sql = "Select * from KhachHang WHERE maKH = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maKH);
            ResultSet rs = prepStmt.executeQuery();
            
            while (rs.next()) {
                int maKh = rs.getInt(1);
                String hoTen = rs.getString(2);
                String soDT = rs.getString(3);
                String diaChi = rs.getString(4);
                String soCCCD = rs.getString(5);
                boolean gioiTinh = rs.getBoolean(6);

                KhachHang kH = new KhachHang(maKh, hoTen, soDT, diaChi, soCCCD, gioiTinh);
                kh.add(kH);
            }
        } catch (Exception e) {
            System.err.println("GetKhachHangByMaKH failed - vui lòng kiểm tra trong KhachHangDAO");
            e.printStackTrace();
        } return kh;
        
    }
}
