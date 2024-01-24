/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author acer
 */
public class HopDong {

    private String maHopDong;
    private LocalDateTime ngayLap;
    private String thoiHanBaoHanh;
    private double soTienPhaiTT;
    private double soTienDaTT;
    private String soLanTT;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private Xe xe;

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public LocalDateTime getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDateTime ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }

    public void setThoiHanBaoHanh(String thoiHanBaoHanh) {
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public double getSoTienPhaiTT() {
        return soTienPhaiTT;
    }

    public void setSoTienPhaiTT(double soTienPhaiTT) {
        this.soTienPhaiTT = soTienPhaiTT;
    }

    public double getSoTienDaTT() {
        return soTienDaTT;
    }

    public void setSoTienDaTT(double soTienDaTT) {
        this.soTienDaTT = soTienDaTT;
    }

    public String getSoLanTT() {
        return soLanTT;
    }

    public void setSoLanTT(String soLanTT) {
        this.soLanTT = soLanTT;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    public HopDong(String maHopDong, LocalDateTime ngayLap, String thoiHanBaoHanh, double soTienPhaiTT, double soTienDaTT, String soLanTT, KhachHang khachHang, NhanVien nhanVien, Xe xe) {
        this.maHopDong = maHopDong;
        this.ngayLap = ngayLap;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
        this.soTienPhaiTT = soTienPhaiTT;
        this.soTienDaTT = soTienDaTT;
        this.soLanTT = soLanTT;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.xe = xe;
    }

    public HopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public HopDong() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.maHopDong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HopDong other = (HopDong) obj;
        return Objects.equals(this.maHopDong, other.maHopDong);
    }

    @Override
    public String toString() {
        return "HopDong{" + "maHopDong=" + maHopDong + ", ngayLap=" + ngayLap + ", thoiHanBaoHanh=" + thoiHanBaoHanh
                + ", soTienPhaiTT=" + soTienPhaiTT + ", soTienDaTT=" + soTienDaTT + ", soLanTT=" + soLanTT + ", khachHang=" + khachHang
                + ", nhanVien=" + nhanVien + ", xe=" + xe + '}';
    }

    public String get10char(String s) {
        return s.substring(0, 10);
    }

    public String getNgayLapString() {
        return get10char(this.ngayLap.toString());
    }

}
