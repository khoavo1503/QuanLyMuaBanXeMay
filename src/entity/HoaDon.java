/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;

/**
 *
 * @author acer
 */
public class HoaDon {
    private int maHoaDon;
    private LocalDateTime ngayLap;
    private double tongTien;
    private String nguoiNhan;
    private HopDong hopDong;
    private NhanVien nhanVien;

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDateTime getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDateTime ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public HoaDon(int maHoaDon, LocalDateTime ngayLap, double tongTien, String nguoiNhan, HopDong hopDong, NhanVien nhanVien) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.nguoiNhan = nguoiNhan;
        this.hopDong = hopDong;
        this.nhanVien = nhanVien;
    }

    public HoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public HoaDon() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.maHoaDon;
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
        final HoaDon other = (HoaDon) obj;
        return this.maHoaDon == other.maHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", tongTien=" + tongTien + ", nguoiNhan=" + nguoiNhan + ", hopDong=" + hopDong + ", nhanVien=" + nhanVien + '}';
    }
    
    public String get10char(String s) {
        return s.substring(0, 10);
    }

    public String getNgayLapString() {
        return get10char(this.ngayLap.toString());
    }
    
}
