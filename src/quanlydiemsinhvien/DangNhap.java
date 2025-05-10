
package quanlydiemsinhvien;

public class DangNhap extends javax.swing.JFrame {

    public DangNhap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dangnhapgiangvien = new javax.swing.JButton();
        Dangnhapsinhvien = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dangnhapgiangvien.setText("Giảng Viên");
        Dangnhapgiangvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangnhapgiangvienActionPerformed(evt);
            }
        });

        Dangnhapsinhvien.setText("Sinh viên");
        Dangnhapsinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangnhapsinhvienActionPerformed(evt);
            }
        });

        Thoat.setText("thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Dangnhapgiangvien)
                .addGap(67, 67, 67)
                .addComponent(Dangnhapsinhvien)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Thoat)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Thoat)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dangnhapgiangvien)
                    .addComponent(Dangnhapsinhvien))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        // TODO add your handling code here:
        // Mở lại form TruongDaiHocCongNgheDongA
    TruongDaiHocCongNgheDongA form = new TruongDaiHocCongNgheDongA();
    form.setVisible(true);
    
    // Đóng form hiện tại (form DangNhap chẳng hạn)
    this.dispose();
    }//GEN-LAST:event_ThoatActionPerformed

    private void DangnhapsinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangnhapsinhvienActionPerformed
        // TODO add your handling code here:
        // Mở form đăng nhập sinh viên
    Dangnhapsinhvien form = new Dangnhapsinhvien();
    form.setVisible(true);

    // Đóng form hiện tại (nếu muốn)
    this.dispose();
    }//GEN-LAST:event_DangnhapsinhvienActionPerformed

    private void DangnhapgiangvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangnhapgiangvienActionPerformed
        // TODO add your handling code here:
         // Mở form đăng nhập giảng viên
    Dangnhapgiangvien form = new Dangnhapgiangvien();
    form.setVisible(true);

    // Đóng form hiện tại nếu cần
    this.dispose();
    }//GEN-LAST:event_DangnhapgiangvienActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dangnhapgiangvien;
    private javax.swing.JButton Dangnhapsinhvien;
    private javax.swing.JButton Thoat;
    // End of variables declaration//GEN-END:variables
}
