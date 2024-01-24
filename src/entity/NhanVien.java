/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author QuanAB
 */
public class NhanVien {
    private String maNV;
    private String hoTenNV;
    private String soDT;
    private String soCCCD;
    private String diaChi;
    private boolean gioiTinh;
    private String chucVu;
    private LoaiNhanVien loaiNhanVien;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public LoaiNhanVien getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(LoaiNhanVien loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public NhanVien(String maNV, String hoTenNV, String soDT, String soCCCD, String diaChi, boolean gioiTinh, String chucVu, LoaiNhanVien loaiNhanVien) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.soDT = soDT;
        this.soCCCD = soCCCD;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.loaiNhanVien = loaiNhanVien;
    }

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public NhanVien() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.maNV);
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
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTenNV=" + hoTenNV + ", soDT=" + soDT + ", soCCCD=" + soCCCD + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", chucVu=" + chucVu + ", loaiNhanVien=" + loaiNhanVien + '}';
    }
    
    
}
