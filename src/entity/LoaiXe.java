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
public class LoaiXe {
    private String maLoaiXe;
    private String tenLoaiXe;

    public String getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(String maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public String getTenLoaiXe() {
        return tenLoaiXe;
    }

    public void setTenLoaiXe(String tenLoaiXe) {
        this.tenLoaiXe = tenLoaiXe;
    }

    public LoaiXe(String maLoaiXe, String tenLoaiXe) {
        this.maLoaiXe = maLoaiXe;
        this.tenLoaiXe = tenLoaiXe;
    }

    public LoaiXe(String maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public LoaiXe() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.maLoaiXe);
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
        final LoaiXe other = (LoaiXe) obj;
        return Objects.equals(this.maLoaiXe, other.maLoaiXe);
    }

    @Override
    public String toString() {
        return "LoaiXe{" + "maLoaiXe=" + maLoaiXe + ", tenLoaiXe=" + tenLoaiXe + '}';
    }
    
    
}
