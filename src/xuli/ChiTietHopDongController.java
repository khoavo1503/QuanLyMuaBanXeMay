/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuli;

import entity.ChiTietHopDong;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class ChiTietHopDongController {
    private JTextField txtMaHopDong;
    private JTextField txtNgayLap;
    private JTextField txtMaKH;
    private JTextField txtHoTenKH;
    private JTextField txtSoDT;
    private JTextField txtSoCCCD;
    private JTextField txtDiaChi;
    private JTextField txtMaXe;
    private JTextField txtSoLuongMua;
    private JTextField txtHinhThucMuaHang;
    private JTextField txtSoTienPhaiTT;
    private JTextField txtSoTienDaTT;
    private JTextField txtSoTienConLai;
    private JTextField txtSoLanGop;
    private JTextField txtTenNVLapHopDong;

    public ChiTietHopDongController(JTextField txtMaHopDong, JTextField txtNgayLap, JTextField txtMaKH, JTextField txtHoTenKH, JTextField txtSoDT, JTextField txtSoCCCD, JTextField txtDiaChi, JTextField txtMaXe, JTextField txtSoLuongMua, JTextField txtHinhThucMuaHang, JTextField txtSoTienPhaiTT, JTextField txtSoTienDaTT, JTextField txtSoTienConLai, JTextField txtSoLanGop, JTextField txtTenNVLapHopDong) {
        this.txtMaHopDong = txtMaHopDong;
        this.txtNgayLap = txtNgayLap;
        this.txtMaKH = txtMaKH;
        this.txtHoTenKH = txtHoTenKH;
        this.txtSoDT = txtSoDT;
        this.txtSoCCCD = txtSoCCCD;
        this.txtDiaChi = txtDiaChi;
        this.txtMaXe = txtMaXe;
        this.txtSoLuongMua = txtSoLuongMua;
        this.txtHinhThucMuaHang = txtHinhThucMuaHang;
        this.txtSoTienPhaiTT = txtSoTienPhaiTT;
        this.txtSoTienDaTT = txtSoTienDaTT;
        this.txtSoTienConLai = txtSoTienConLai;
        this.txtSoLanGop = txtSoLanGop;
        this.txtTenNVLapHopDong = txtTenNVLapHopDong;
    }
    
     public void setView(ChiTietHopDong chiTietHopDong) {
         txtMaHopDong.setText(chiTietHopDong.getMaHopDong());
         txtNgayLap.setText(chiTietHopDong.getNgayLap());
         txtMaKH.setText(chiTietHopDong.getMaKH() + "");
         txtHoTenKH.setText(chiTietHopDong.getHoTenKH());
         txtSoDT.setText(chiTietHopDong.getSoDT());
         txtSoCCCD.setText(chiTietHopDong.getSoCCCD());
         txtDiaChi.setText(chiTietHopDong.getDiaChi());
         txtMaXe.setText(chiTietHopDong.getMaXe());
         txtSoLuongMua.setText(chiTietHopDong.getSoLuongMua() + "");
         txtHinhThucMuaHang.setText(chiTietHopDong.getHinhThucMuaHang());
         txtSoTienPhaiTT.setText(chiTietHopDong.getSoTienPhaiTT());
         txtSoTienDaTT.setText(chiTietHopDong.getSoTienDaTT());
         txtSoTienConLai.setText(chiTietHopDong.getSoTienTTConLai());
         txtSoLanGop.setText(chiTietHopDong.getSoLanTT());
         txtTenNVLapHopDong.setText(chiTietHopDong.getTenNVLapHopDong());
     }
    
}
