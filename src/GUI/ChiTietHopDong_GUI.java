/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entity.ChiTietHopDong;
import entity.HopDong;
import java.awt.Toolkit;
import xuli.ChiTietHopDongController;

/**
 *
 * @author acer
 */
public class ChiTietHopDong_GUI extends javax.swing.JFrame {
    
    /**
     * Creates new form ChiTietHopDong
     */
    public ChiTietHopDong_GUI(ChiTietHopDong chiTietHopDong) {
        icon();
        initComponents();
        
        
        ChiTietHopDongController loadDLLenForm = new ChiTietHopDongController(txtMaHopDong, txtNgayLap, txtMaKH, txtHoTenKH, txtSoDT, 
                txtSoCCCD, txtDiaChi, txtMaXe, txtSoLuongMua, txtHinhThucMuaHang, txtSoTienPhaiTT, txtSoTienDaTT, 
                txtSoTienConLai, txtSoLanGop, txtTenNVLapHopDong);
        loadDLLenForm.setView(chiTietHopDong);
    }
    public void icon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo_XeMay.png")));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMaHopDong = new javax.swing.JLabel();
        txtMaHopDong = new javax.swing.JTextField();
        txtNgayLap = new javax.swing.JTextField();
        lblNgayLap = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblHoTenKH = new javax.swing.JLabel();
        txtHoTenKH = new javax.swing.JTextField();
        lblSoDT = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        lblSoCCCD = new javax.swing.JLabel();
        txtSoCCCD = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblMaXe = new javax.swing.JLabel();
        txtMaXe = new javax.swing.JTextField();
        lblSoLuongMua = new javax.swing.JLabel();
        txtSoLuongMua = new javax.swing.JTextField();
        lblHinhThucMuaHang = new javax.swing.JLabel();
        txtHinhThucMuaHang = new javax.swing.JTextField();
        lblSoTienPhaiTT = new javax.swing.JLabel();
        txtSoTienPhaiTT = new javax.swing.JTextField();
        lblSoTienDaTT = new javax.swing.JLabel();
        txtSoTienDaTT = new javax.swing.JTextField();
        lblSoTienConLai = new javax.swing.JLabel();
        txtSoTienConLai = new javax.swing.JTextField();
        lblSoLanGop = new javax.swing.JLabel();
        txtSoLanGop = new javax.swing.JTextField();
        lblTenNVLapHopDong = new javax.swing.JLabel();
        txtTenNVLapHopDong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT HỢP ĐỒNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblMaHopDong.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblMaHopDong.setText("Mã hợp đồng:");

        txtMaHopDong.setEditable(false);
        txtMaHopDong.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtMaHopDong.setForeground(new java.awt.Color(0, 102, 204));
        txtMaHopDong.setBorder(null);

        txtNgayLap.setEditable(false);
        txtNgayLap.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtNgayLap.setForeground(new java.awt.Color(0, 102, 204));
        txtNgayLap.setAutoscrolls(false);
        txtNgayLap.setBorder(null);

        lblNgayLap.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblNgayLap.setText("Ngày lập:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN KHÁCH HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 17))); // NOI18N

        lblHoTenKH.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblHoTenKH.setText("Họ tên:");

        txtHoTenKH.setEditable(false);
        txtHoTenKH.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtHoTenKH.setForeground(new java.awt.Color(0, 102, 204));
        txtHoTenKH.setBorder(null);

        lblSoDT.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoDT.setText("Số điện thoại:");

        txtSoDT.setEditable(false);
        txtSoDT.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoDT.setForeground(new java.awt.Color(0, 102, 204));
        txtSoDT.setBorder(null);

        lblSoCCCD.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoCCCD.setText("Số CCCD:");

        txtSoCCCD.setEditable(false);
        txtSoCCCD.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoCCCD.setForeground(new java.awt.Color(0, 102, 204));
        txtSoCCCD.setBorder(null);

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblDiaChi.setText("Địa chỉ:");

        txtDiaChi.setEditable(false);
        txtDiaChi.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(0, 102, 204));
        txtDiaChi.setBorder(null);

        lblMaKH.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblMaKH.setText("Mã khách hàng:");

        txtMaKH.setEditable(false);
        txtMaKH.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(0, 102, 204));
        txtMaKH.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoCCCD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSoDT)
                            .addComponent(txtDiaChi)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKH)
                            .addComponent(lblHoTenKH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTenKH)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH)
                    .addComponent(txtMaKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTenKH)
                    .addComponent(txtHoTenKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDT)
                    .addComponent(txtSoDT))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoCCCD)
                    .addComponent(txtSoCCCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN XE MUA VÀ HÌNH THỨC MUA HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 17))); // NOI18N

        lblMaXe.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblMaXe.setText("Mã xe:");

        txtMaXe.setEditable(false);
        txtMaXe.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtMaXe.setForeground(new java.awt.Color(0, 102, 204));
        txtMaXe.setBorder(null);

        lblSoLuongMua.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoLuongMua.setText("Số lượng mua:");

        txtSoLuongMua.setEditable(false);
        txtSoLuongMua.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoLuongMua.setForeground(new java.awt.Color(0, 102, 204));
        txtSoLuongMua.setBorder(null);

        lblHinhThucMuaHang.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblHinhThucMuaHang.setText("Hình thức mua hàng:");

        txtHinhThucMuaHang.setEditable(false);
        txtHinhThucMuaHang.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtHinhThucMuaHang.setForeground(new java.awt.Color(0, 102, 204));
        txtHinhThucMuaHang.setBorder(null);

        lblSoTienPhaiTT.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoTienPhaiTT.setText("Số tiền phải thanh toán:");

        txtSoTienPhaiTT.setEditable(false);
        txtSoTienPhaiTT.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoTienPhaiTT.setForeground(new java.awt.Color(0, 102, 204));
        txtSoTienPhaiTT.setBorder(null);

        lblSoTienDaTT.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoTienDaTT.setText("Số tiền đã thanh toán:");

        txtSoTienDaTT.setEditable(false);
        txtSoTienDaTT.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoTienDaTT.setForeground(new java.awt.Color(0, 102, 204));
        txtSoTienDaTT.setBorder(null);

        lblSoTienConLai.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoTienConLai.setText("Số tiền còn lại:");

        txtSoTienConLai.setEditable(false);
        txtSoTienConLai.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoTienConLai.setForeground(new java.awt.Color(0, 102, 204));
        txtSoTienConLai.setBorder(null);

        lblSoLanGop.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSoLanGop.setText("Số lần thanh toán còn lại:");

        txtSoLanGop.setEditable(false);
        txtSoLanGop.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtSoLanGop.setForeground(new java.awt.Color(0, 102, 204));
        txtSoLanGop.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblSoLanGop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLanGop, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoTienDaTT)
                            .addComponent(lblSoTienConLai)
                            .addComponent(lblSoTienPhaiTT)
                            .addComponent(lblHinhThucMuaHang)
                            .addComponent(lblSoLuongMua)
                            .addComponent(lblMaXe))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaXe)
                            .addComponent(txtSoLuongMua)
                            .addComponent(txtHinhThucMuaHang)
                            .addComponent(txtSoTienPhaiTT)
                            .addComponent(txtSoTienConLai)
                            .addComponent(txtSoTienDaTT))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaXe)
                    .addComponent(txtMaXe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLuongMua)
                    .addComponent(txtSoLuongMua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHinhThucMuaHang)
                    .addComponent(txtHinhThucMuaHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoTienPhaiTT)
                    .addComponent(txtSoTienPhaiTT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoTienDaTT)
                    .addComponent(txtSoTienDaTT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoTienConLai)
                    .addComponent(txtSoTienConLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoLanGop)
                    .addComponent(txtSoLanGop)))
        );

        lblTenNVLapHopDong.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblTenNVLapHopDong.setText("Nhân viên lập hợp đồng:");

        txtTenNVLapHopDong.setEditable(false);
        txtTenNVLapHopDong.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtTenNVLapHopDong.setForeground(new java.awt.Color(0, 102, 204));
        txtTenNVLapHopDong.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTenNVLapHopDong)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenNVLapHopDong))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMaHopDong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNgayLap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTenNVLapHopDong)
                    .addComponent(txtTenNVLapHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ChiTietHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChiTietHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChiTietHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChiTietHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChiTietHopDong_GUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblHinhThucMuaHang;
    private javax.swing.JLabel lblHoTenKH;
    private javax.swing.JLabel lblMaHopDong;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaXe;
    private javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblSoCCCD;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSoLanGop;
    private javax.swing.JLabel lblSoLuongMua;
    private javax.swing.JLabel lblSoTienConLai;
    private javax.swing.JLabel lblSoTienDaTT;
    private javax.swing.JLabel lblSoTienPhaiTT;
    private javax.swing.JLabel lblTenNVLapHopDong;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHinhThucMuaHang;
    private javax.swing.JTextField txtHoTenKH;
    private javax.swing.JTextField txtMaHopDong;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaXe;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtSoCCCD;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSoLanGop;
    private javax.swing.JTextField txtSoLuongMua;
    private javax.swing.JTextField txtSoTienConLai;
    private javax.swing.JTextField txtSoTienDaTT;
    private javax.swing.JTextField txtSoTienPhaiTT;
    private javax.swing.JTextField txtTenNVLapHopDong;
    // End of variables declaration//GEN-END:variables
}
