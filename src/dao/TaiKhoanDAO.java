/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import connectDB.KetNoiCSDL;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author acer
 */
public class TaiKhoanDAO {

    public boolean kiemTraTaiKhoan(String taiKhoan, String matKhau) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        PreparedStatement prepStmt = null;
        String sql = "SELECT * FROM TaiKhoan WHERE tenDN = ? AND matKhau = ?";

        try {
            prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, taiKhoan);
            prepStmt.setString(2, matKhau);
            ResultSet rs = prepStmt.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("kiemTraTaiKhoan failed - pls check in TaiKhoanDAO");
            e.printStackTrace();
        }
        return false;
    }

    public String getMaNVDangNhap(String taiKhoan, String matKhau) throws SQLException {
        KetNoiCSDL.getInstance();
        KetNoiCSDL ketNoiCSDL = new KetNoiCSDL();
        ketNoiCSDL.connect();

        Connection con = ketNoiCSDL.getConnection();

        PreparedStatement prepStmt = null;
        String sql = "SELECT maNV FROM TaiKhoan WHERE tenDN = ? AND matKhau = ?";

        try {
            prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, taiKhoan);
            prepStmt.setString(2, matKhau);
            ResultSet rs = prepStmt.executeQuery();

            if (rs.next()) {
                return rs.getString(1);
            } else {
                return "Không có nhân viên này!";
            }
        } catch (Exception e) {
            System.err.println("getMaNVDangNhap failed - pls check in TaiKhoanDAO");
            e.printStackTrace();
        }
        return "Tên nhân viên";
    }
}
