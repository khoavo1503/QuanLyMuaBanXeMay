/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author acer
 */
public class ChiTietHoaDon {
    private int maCTHoaDon;
    private double donGia;
    private int soLuongMua;
    private String donViTinh;
    private String khuyenMai;
    private double thanhTien;
    private HoaDon hoaDon;

    public int getMaCTHoaDon() {
        return maCTHoaDon;
    }

    public void setMaCTHoaDon(int maCTHoaDon) {
        this.maCTHoaDon = maCTHoaDon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(String khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietHoaDon(int maCTHoaDon, double donGia, int soLuongMua, String donViTinh, String khuyenMai, double thanhTien, HoaDon hoaDon) {
        this.maCTHoaDon = maCTHoaDon;
        this.donGia = donGia;
        this.soLuongMua = soLuongMua;
        this.donViTinh = donViTinh;
        this.khuyenMai = khuyenMai;
        this.thanhTien = thanhTien;
        this.hoaDon = hoaDon;
    }

    public ChiTietHoaDon(int maCTHoaDon) {
        this.maCTHoaDon = maCTHoaDon;
    }

    public ChiTietHoaDon() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.maCTHoaDon;
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
        final ChiTietHoaDon other = (ChiTietHoaDon) obj;
        return this.maCTHoaDon == other.maCTHoaDon;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "maCTHoaDon=" + maCTHoaDon + ", donGia=" + donGia + ", soLuongMua=" + soLuongMua + ", donViTinh=" + donViTinh + ", khuyenMai=" + khuyenMai + ", thanhTien=" + thanhTien + ", hoaDon=" + hoaDon + '}';
    }
    
    
}
