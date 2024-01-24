/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuli;


import GUI.QLHopDong_GUI;
import GUI.QLBanHang_GUI;
import GUI.QLHoaDon_GUI;
import GUI.QLKhachHang_GUI;
import GUI.QLNhanVien_GUI;
import GUI.SanPham_GUI;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import others.BienMacDinh;

/**
 *
 * @author acer
 */
public class ChuyenManHinh implements BienMacDinh {

    private JPanel pChinh;
    private String danhMucDangChon = "";
    private List<DanhMucBean> listDanhMucBean = null;

    public ChuyenManHinh(JPanel pChinh) {
        this.pChinh = pChinh;
    }

    public void setManHinhNoiDung(JPanel pDanhMucDangChon, JLabel lblDanhMucDangChon) throws SQLException {
        danhMucDangChon = "SanPham";
        pDanhMucDangChon.setBackground(mauDanhMucDangChon);
        lblDanhMucDangChon.setBackground(mauDanhMucDangChon);
        lblDanhMucDangChon.setForeground(mauTrang);

        //load lại giao diện
        pChinh.removeAll();
        pChinh.setLayout(new BorderLayout());
        pChinh.add(new SanPham_GUI());
        pChinh.validate();
        pChinh.repaint();
    }

    public void setSuKienClickDanhMuc(List<DanhMucBean> listDanhMucBean) {
        this.listDanhMucBean = listDanhMucBean;
        for (DanhMucBean item : listDanhMucBean) {
            item.getLbl().addMouseListener(new customSuKienMouseListener(item.getLoaiDanhMuc(), item.getPanel(), item.getLbl()));
        }
    }

    public class customSuKienMouseListener implements MouseListener {

        // jpnThaoTac dùng để set lại panel thao tác ở bên phải
        private JPanel jpnThaoTac;

        //3 thành phần tạo nên danh mục trong panel menu
        private String loaiDanhMuc;
        private JPanel panel;
        private JLabel lbl;

        public customSuKienMouseListener(String loaiDanhMuc, JPanel panel, JLabel lbl) {
            this.loaiDanhMuc = loaiDanhMuc;
            this.panel = panel;
            this.lbl = lbl;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            danhMucDangChon = loaiDanhMuc;
            switch (loaiDanhMuc) {
                case "SanPham": {
                    try {
                        jpnThaoTac = new SanPham_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QLBanHang": {
                    try {
                        jpnThaoTac = new QLBanHang_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QLHopDong":
                {
                    try {
                        jpnThaoTac = new QLHopDong_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case "QLKhachHang": {
                    try {
                        jpnThaoTac = new QLKhachHang_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case "QLHoaDon":
                {
                    try {
                        jpnThaoTac = new QLHoaDon_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case "QLNhanVien": {
                    try {
                        jpnThaoTac = new QLNhanVien_GUI();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
                default:
                    break;
            }

            pChinh.removeAll();
            pChinh.setLayout(new BorderLayout());
            pChinh.add(jpnThaoTac);
            pChinh.validate();
            pChinh.repaint();
            thayDoiBackGroundKhiClick(loaiDanhMuc);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // set hiệu ứng khi được để chuột vào
            panel.setBackground(mauDanhMucDangChon);
            lbl.setBackground(mauDanhMucDangChon);
            lbl.setForeground(mauTrang);
            lbl.setBorder(null);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //set hiệu ứng khi lia chuột ra chỗ khác
            if (!danhMucDangChon.equalsIgnoreCase(loaiDanhMuc)) {
                panel.setBackground(mauNenMenu);
                lbl.setBackground(mauNenMenu);
                lbl.setForeground(mauDen);
                lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, mauBorderBottomMenu));
            }
        }

        public void thayDoiBackGroundKhiClick(String loaiDangChon) {
            for (DanhMucBean item : listDanhMucBean) {
                if (item.getLoaiDanhMuc().equalsIgnoreCase(loaiDangChon)) {
                    item.getPanel().setBackground(mauDanhMucDangChon);
                    item.getLbl().setBackground(mauDanhMucDangChon);
                    item.getLbl().setForeground(mauTrang);
                    item.getLbl().setBorder(null);
                } else {
                    item.getPanel().setBackground(mauNenMenu);
                    item.getLbl().setBackground(mauNenMenu);
                    item.getLbl().setForeground(mauDen);
                    item.getLbl().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, mauBorderBottomMenu));
                }
            }
        }
    }
}
