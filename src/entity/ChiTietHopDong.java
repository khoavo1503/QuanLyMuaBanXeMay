/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author acer
 */
public class ChiTietHopDong {
    private String maHopDong;
    private String ngayLap;
    private int maKH;
    private String hoTenKH;
    private String soDT;
    private String soCCCD;
    private String diaChi;
    private String maXe;
    private int soLuongMua;
    private String hinhThucMuaHang;
    private String soTienPhaiTT;
    private String soTienDaTT;
    private String soLanTT;
    private String soTienTTConLai;
    private String tenNVLapHopDong;

    public String getMaHopDong() {
        return maHopDong;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public int getMaKH() {
        return maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMaXe() {
        return maXe;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public String getHinhThucMuaHang() {
        return hinhThucMuaHang;
    }

    public String getSoTienPhaiTT() {
        return soTienPhaiTT;
    }

    public String getSoTienDaTT() {
        return soTienDaTT;
    }

    public String getSoLanTT() {
        return soLanTT;
    }

    public String getSoTienTTConLai() {
        return soTienTTConLai;
    }

    public String getTenNVLapHopDong() {
        return tenNVLapHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public void setHinhThucMuaHang(String hinhThucMuaHang) {
        this.hinhThucMuaHang = hinhThucMuaHang;
    }

    public void setSoTienPhaiTT(String soTienPhaiTT) {
        this.soTienPhaiTT = soTienPhaiTT;
    }

    public void setSoTienDaTT(String soTienDaTT) {
        this.soTienDaTT = soTienDaTT;
    }

    public void setSoLanTT(String soLanTT) {
        this.soLanTT = soLanTT;
    }

    public void setSoTienTTConLai(String soTienTTConLai) {
        this.soTienTTConLai = soTienTTConLai;
    }

    public void setTenNVLapHopDong(String tenNVLapHopDong) {
        this.tenNVLapHopDong = tenNVLapHopDong;
    }

    public ChiTietHopDong(String maHopDong, String ngayLap, int maKH, String hoTenKH, String soDT, String soCCCD, String diaChi, String maXe, int soLuongMua, String hinhThucMuaHang, String soTienPhaiTT, String soTienDaTT, String soLanTT, String soTienTTConLai, String tenNVLapHopDong) {
        this.maHopDong = maHopDong;
        this.ngayLap = ngayLap;
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.soDT = soDT;
        this.soCCCD = soCCCD;
        this.diaChi = diaChi;
        this.maXe = maXe;
        this.soLuongMua = soLuongMua;
        this.hinhThucMuaHang = hinhThucMuaHang;
        this.soTienPhaiTT = soTienPhaiTT;
        this.soTienDaTT = soTienDaTT;
        this.soLanTT = soLanTT;
        this.soTienTTConLai = soTienTTConLai;
        this.tenNVLapHopDong = tenNVLapHopDong;
    }

    public ChiTietHopDong() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.maHopDong);
        return hash;
    }

    public ChiTietHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
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
        final ChiTietHopDong other = (ChiTietHopDong) obj;
        return Objects.equals(this.maHopDong, other.maHopDong);
    }

    @Override
    public String toString() {
        return "ChiTietHopDong{" + "maHopDong=" + maHopDong + ", ngayLap=" + ngayLap + ", maKH=" + maKH + ", hoTenKH=" + hoTenKH + 
                ", soDT=" + soDT + ", soCCCD=" + soCCCD + ", diaChi=" + diaChi + ", maXe=" + maXe + ", soLuongMua=" + soLuongMua + ", hinhThucMuaHang="
                + hinhThucMuaHang + ", soTienPhaiTT=" + soTienPhaiTT + ", soTienDaTT=" + soTienDaTT + ", soLanTT=" + soLanTT + ", soTienTTConLai=" + soTienTTConLai 
                + ", tenNVLapHopDong=" + tenNVLapHopDong + '}';
    }
    
    
    
}
