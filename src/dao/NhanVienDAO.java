/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import connectDB.KetNoiCSDL;
import entity.LoaiNhanVien;
import entity.NhanVien;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class NhanVienDAO {

    public ArrayList<NhanVien> getAllNV() throws SQLException {
        ArrayList<NhanVien> dsNV = new ArrayList<>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM NhanVien";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String maNV = rs.getString(1);
                String hoTen = rs.getString(2);
                String soDT = rs.getString(3);
                String soCCCD = rs.getString(4);
                String diaChi = rs.getString(5);
                boolean gioiTinh = rs.getBoolean(6);
                String chucVu = rs.getString(7);
                LoaiNhanVien loaiNV = new LoaiNhanVien(rs.getString(8));

                NhanVien nv = new NhanVien(maNV, hoTen, soDT, soCCCD, diaChi, gioiTinh, chucVu, loaiNV);
                dsNV.add(nv);
            }
        } catch (Exception e) {
            System.err.println("getAllNV failed - pls check in NhanVienDAO");
            e.printStackTrace();
        }
        return dsNV;
    }

    public ArrayList<NhanVien> getNhanVienByMaNV(String maNV) throws SQLException {
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            String sql = "Select * from NhanVien WHERE maNV = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maNV);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {
                String maNVV = rs.getString(1);
                String hoTen = rs.getString(2);
                String soDT = rs.getString(3);
                String soCCCD = rs.getString(4);
                String diaChi = rs.getString(5);
                boolean gioiTinh = rs.getBoolean(6);
                String chucVu = rs.getString(7);
                LoaiNhanVien loaiNV = new LoaiNhanVien(rs.getString(8));

                NhanVien nhanVien = new NhanVien(maNV, hoTen, soDT, soCCCD, diaChi, gioiTinh, chucVu, loaiNV);
                nv.add(nhanVien);
            }
        } catch (Exception e) {
            System.err.println("getNhanVienByMaNV failed - pls check in NhanVienDAO");
            e.printStackTrace();
        } return nv;
    }

    public String getTenNhanVienByMaNV(String maNV) throws SQLException {
        String hotenNV = "";
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            String sql = "Select hoTen from NhanVien WHERE maNV = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maNV);

            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                hotenNV = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hotenNV;
    }

    public String getChucVuNhanVienByMaNV(String maNV) throws SQLException {
        String chucVuNV = "";
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        try {
            String sql = "Select chucVu from NhanVien WHERE maNV = ?";
            PreparedStatement prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, maNV);

            ResultSet rs = prepStmt.executeQuery();
            rs.next();
            chucVuNV = rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chucVuNV;
    }
}
