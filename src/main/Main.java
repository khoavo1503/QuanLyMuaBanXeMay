/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import GUI.GDDangNhap;
import GUI.GiaoDienChinh;
import GUI.QLBanHang_GUI;
import GUI.QLHoaDon_GUI;
import GUI.QLHopDong_GUI;
import GUI.QLKhachHang_GUI;
import GUI.QLNhanVien_GUI;
import GUI.SanPham_GUI;
import java.sql.SQLException;

/**
 *
 * @author QuanAB
 */
public class Main {
    
    public static GiaoDienChinh gdChinh;
    public static SanPham_GUI sp_GUI;
    public static QLBanHang_GUI qlbh_GUI;
    public static QLHopDong_GUI qlhopdong_GUI;
    public static QLKhachHang_GUI qlkh_GUI;
    public static QLHoaDon_GUI qlhoadon_GUI;
    public static QLNhanVien_GUI qlnv_GUI;
    
    public int a;
    
    public static void main(String args[]) throws SQLException {
        System.out.println("Vạn sự khởi đầu nan - Gian nan bắt đầu bỏ!");
        new GDDangNhap().setVisible(true);
    }
}
