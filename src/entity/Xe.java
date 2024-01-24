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
public class Xe {
    private String maXe;
    private String tenXe;
    private String mauXe;
    private String nuocSanXuat;
    private String hangXe;
    private double giaXe;
    private String soKhung;
    private String phanKhoi;
    private int soLuong;
    private LoaiXe loaiXe;

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(String phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public LoaiXe getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(LoaiXe loaiXe) {
        this.loaiXe = loaiXe;
    }

    public Xe(String maXe, String tenXe, String mauXe, String nuocSanXuat, String hangXe, double giaXe, String soKhung, String phanKhoi, int soLuong, LoaiXe loaiXe) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.mauXe = mauXe;
        this.nuocSanXuat = nuocSanXuat;
        this.hangXe = hangXe;
        this.giaXe = giaXe;
        this.soKhung = soKhung;
        this.phanKhoi = phanKhoi;
        this.soLuong = soLuong;
        this.loaiXe = loaiXe;
    }

    public Xe(String maXe) {
        this.maXe = maXe;
    }

    public Xe() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maXe);
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
        final Xe other = (Xe) obj;
        return Objects.equals(this.maXe, other.maXe);
    }

    @Override
    public String toString() {
        return "Xe{" + "maXe=" + maXe + ", tenXe=" + tenXe + ", mauXe=" + mauXe + ", nuocSanXuat=" + nuocSanXuat + ", hangXe=" + hangXe + ", giaXe=" + giaXe + ", soKhung=" + soKhung + ", phanKhoi=" + phanKhoi + ", soLuong=" + soLuong + ", loaiXe=" + loaiXe + '}';
    }
    
    
}
