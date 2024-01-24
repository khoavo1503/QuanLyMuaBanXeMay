/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author acer
 */
public class KhachHang {
    private int maKH;
    private String hoTenKH;
    private String soDT;
    private String diaChi;
    private String SoCCCD;
    private boolean gioiTinh;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCCCD() {
        return SoCCCD;
    }

    public void setSoCCCD(String SoCCCD) {
        this.SoCCCD = SoCCCD;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public KhachHang(int maKH, String hoTenKH, String soDT, String diaChi, String SoCCCD, boolean gioiTinh) {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.SoCCCD = SoCCCD;
        this.gioiTinh = gioiTinh;
    }

    public KhachHang(int maKH) {
        this.maKH = maKH;
    }

    public KhachHang() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.maKH;
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
        final KhachHang other = (KhachHang) obj;
        return this.maKH == other.maKH;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTenKH=" + hoTenKH + ", soDT=" + soDT + ", diaChi=" + diaChi + ", SoCCCD=" + SoCCCD + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
