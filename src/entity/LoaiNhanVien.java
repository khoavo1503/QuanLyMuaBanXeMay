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
public class LoaiNhanVien {
    private String maLoaiNV;
    private String tenLoaiNV;

    public String getMaLoaiNV() {
        return maLoaiNV;
    }

    public void setMaLoaiNV(String maLoaiNV) {
        this.maLoaiNV = maLoaiNV;
    }

    public String getTenLoaiNV() {
        return tenLoaiNV;
    }

    public void setTenLoaiNV(String tenLoaiNV) {
        this.tenLoaiNV = tenLoaiNV;
    }

    public LoaiNhanVien(String maLoaiNV, String tenLoaiNV) {
        this.maLoaiNV = maLoaiNV;
        this.tenLoaiNV = tenLoaiNV;
    }

    public LoaiNhanVien(String maLoaiNV) {
        this.maLoaiNV = maLoaiNV;
    }

    public LoaiNhanVien() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.maLoaiNV);
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
        final LoaiNhanVien other = (LoaiNhanVien) obj;
        return Objects.equals(this.maLoaiNV, other.maLoaiNV);
    }

    @Override
    public String toString() {
        return "LoaiNhanVien{" + "maLoaiNV=" + maLoaiNV + ", tenLoaiNV=" + tenLoaiNV + '}';
    }
    
    
}
