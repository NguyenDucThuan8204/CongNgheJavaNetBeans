
package quanlydiemsinhvien;
import javax.swing.JOptionPane;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Dangnhapsinhvien extends javax.swing.JFrame {

    public Dangnhapsinhvien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NhapTaiKhoanSinhVien = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        NhapMatKhauSinhVien = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SinhVienDangnhap = new javax.swing.JButton();
        QuenMatkhauSinhVien = new javax.swing.JButton();
        Quaylai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(NhapTaiKhoanSinhVien);

        jScrollPane2.setViewportView(NhapMatKhauSinhVien);

        jLabel1.setText("Tài khoản");

        jLabel2.setText("Mật khẩu");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Sinh viên đăng nhập");

        SinhVienDangnhap.setText("Đăng nhập");
        SinhVienDangnhap.setToolTipText("");
        SinhVienDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinhVienDangnhapActionPerformed(evt);
            }
        });

        QuenMatkhauSinhVien.setText("Quên mật khẩu");

        Quaylai.setText("Quay lại");
        Quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Quaylai)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)))
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SinhVienDangnhap)
                .addGap(28, 28, 28)
                .addComponent(QuenMatkhauSinhVien)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Quaylai)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SinhVienDangnhap)
                    .addComponent(QuenMatkhauSinhVien))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuaylaiActionPerformed
        // TODO add your handling code here:
        // Mở lại form đăng nhập
    DangNhap dangNhapForm = new DangNhap();
    dangNhapForm.setVisible(true);

    // Đóng form hiện tại
    this.dispose();
    }//GEN-LAST:event_QuaylaiActionPerformed

    private void SinhVienDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinhVienDangnhapActionPerformed
    String tenDangNhap = NhapTaiKhoanSinhVien.getText();
    String matKhau = NhapMatKhauSinhVien.getText();

try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
    String sql = "SELECT MaSV FROM TaiKhoan WHERE TenDangNhap=? AND MatKhau=? AND VaiTro='SinhVien'";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, tenDangNhap);
    stmt.setString(2, matKhau);
    ResultSet rs = stmt.executeQuery();

    if (rs.next()) {
        int maSV = rs.getInt("MaSV");

        // Gọi form SinhVien (bạn cần tạo constructor có tham số maSV)
        Sinhvien formSV = new Sinhvien(maSV);
        formSV.setVisible(true);

        // Ẩn form đăng nhập
        this.dispose(); // nếu trong class kế thừa JFrame
    } else {
        JOptionPane.showMessageDialog(null, "Sai tài khoản hoặc mật khẩu!");
    }

    rs.close();
    stmt.close();
    conn.close();
} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL!");
}

    }//GEN-LAST:event_SinhVienDangnhapActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dangnhapsinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane NhapMatKhauSinhVien;
    private javax.swing.JTextPane NhapTaiKhoanSinhVien;
    private javax.swing.JButton Quaylai;
    private javax.swing.JButton QuenMatkhauSinhVien;
    private javax.swing.JButton SinhVienDangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
