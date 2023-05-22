/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import business.NhanVienDao;
import java.util.ArrayList;
import java.util.List;
import intity.NhanVien;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QlNhanVien extends javax.swing.JFrame {
    NhanVienDao nhanVienDao = new NhanVienDao();
    NhanVien nhanVienSelected = null;
    DefaultTableModel tableModel = null;
    List<NhanVien> listNhanVien = new ArrayList<>();
    int rowSelected = -1;
    String duongDan = "C:\\Users\\Admin\\Pictures\\Camera Roll\\1.jpg";
    /**
     * Creates new form NhanVien
     */
    public QlNhanVien() {       
        initComponents();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnThemNhanVien = new javax.swing.JButton();
        btnSuaNhanVien = new javax.swing.JButton();
        btnXoaNhanVien = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblAnhNv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        btnThemNhanVien.setText("Thêm");
        btnThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanVienActionPerformed(evt);
            }
        });

        btnSuaNhanVien.setText("Sửa");

        btnXoaNhanVien.setText("Xóa");

        btnThoat.setText("Thoát");

        lblAnhNv.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblAnhNv, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnThemNhanVien)
                        .addGap(34, 34, 34)
                        .addComponent(btnSuaNhanVien)
                        .addGap(43, 43, 43)
                        .addComponent(btnXoaNhanVien)
                        .addGap(42, 42, 42)
                        .addComponent(btnThoat)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblAnhNv, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhanVien)
                    .addComponent(btnSuaNhanVien)
                    .addComponent(btnXoaNhanVien)
                    .addComponent(btnThoat))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemNhanVienActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        rowSelected = tbNhanVien.getSelectedRow();
        lblAnhNv.setIcon(ResizeImage(listNhanVien.get(rowSelected).getAnh()));

    }//GEN-LAST:event_tbNhanVienMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QlNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaNhanVien;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnhNv;
    private javax.swing.JTable tbNhanVien;
    // End of variables declaration//GEN-END:variables

    private void loadDataToTable() {
        tableModel = new DefaultTableModel();
        Object[] columnTitle = {"Mã nhân viên", "Họ Tên","Ngày Sinh","Ngày làm việc", "Đia chỉ", "Điện thoại", "Lương cơ bản"};
        tableModel.setColumnIdentifiers(columnTitle);
        listNhanVien = nhanVienDao.getAll();
        Object[] rowData = null;
        for (NhanVien nhanVien : listNhanVien) {
            rowData = new Object[]{nhanVien.getIdNhanVien(), nhanVien.getHoTen(), nhanVien.getNgaySinh(),
            nhanVien.getNgayLamViec(), nhanVien.getDiaChi(), nhanVien.getDienThoai(), nhanVien.getLuongCoBan()};
            tableModel.addRow(rowData);
        }
        tbNhanVien.setModel(tableModel);
                
    }
    public ImageIcon ResizeImage(String path){ 
        ImageIcon myImg  = new ImageIcon(path);
        Image img = myImg.getImage();
        Image newImg = img.getScaledInstance(lblAnhNv.getWidth(), lblAnhNv.getHeight(), lblAnhNv.getWidth());
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}