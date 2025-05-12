
package quanlydiemsinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class AdminKhoa extends javax.swing.JFrame {

    public AdminKhoa() {
        initComponents();
        loadKhoa();
        loadChuyenNganh();
        loadLop();
        loadMonHoc();
        loadComboBoxKhoa();         // ← Thêm dòng này
        loadComboBoxChuyenNganh();  // ← Và dòng này
        loadDanhSachSinhVien(); // Hiển thị danh sách sinh viên
        loadComboBoxLop();          // ← Cả dòng này
        loadDanhSachGiangVien();
        

    }
    private Map<String, Integer> khoaMap = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelQuanLyThongTinGV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1QuanLyGiangVien = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextPane3MaGV = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextPane4HoTenGV = new javax.swing.JTextPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextPane14 = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextPane15 = new javax.swing.JTextPane();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextPane16 = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextPane17 = new javax.swing.JTextPane();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextPane22 = new javax.swing.JTextPane();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanelQuanLyThongTinSV = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSinhVien = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MSV = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Hoten = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Ngaysinh = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Noisinh = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        Gioitinh = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Quequan = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        Quoctich = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Dantoc = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Noithuongtru = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        XaPhuong = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        QuanHuyen = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TinhThanhPho = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        SDT = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        CCCD = new javax.swing.JTextPane();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Emai = new javax.swing.JTextPane();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ThemSinhVien = new javax.swing.JButton();
        SuaSinhVien = new javax.swing.JButton();
        XoaSinhVien = new javax.swing.JButton();
        jComboBox1TimKiemChuyenNganhKhoa = new javax.swing.JComboBox<>();
        jComboBox2TimKiemKhoa = new javax.swing.JComboBox<>();
        jComboBox2TimKiemLopCNKhoa = new javax.swing.JComboBox<>();
        TaiAnhlen = new javax.swing.JButton();
        TImKiem = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AnhSinhVien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox4Khoa = new javax.swing.JComboBox<>();
        jComboBox5Lop = new javax.swing.JComboBox<>();
        jComboBox5ChuyenNganh = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane55 = new javax.swing.JScrollPane();
        Khoahoc = new javax.swing.JTextPane();
        jPanelQuanLyKhoa = new javax.swing.JPanel();
        jComboBox7Khoa = new javax.swing.JComboBox<>();
        jComboBox8ChuyenNganh = new javax.swing.JComboBox<>();
        jComboBox9Lop = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        Khoa = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        Chuyennganh = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        Lop = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        Sotinchi = new javax.swing.JTextPane();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jScrollPane42 = new javax.swing.JScrollPane();
        MonHoc = new javax.swing.JTextPane();
        jLabel54 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTable1BangKhoa = new javax.swing.JTable();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTable2BangChuyenNganh = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTable3BangLop = new javax.swing.JTable();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable5MonHoc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTable1QuanLySinhVien2 = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextPane23 = new javax.swing.JTextPane();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextPane24 = new javax.swing.JTextPane();
        jLabel62 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jButton20 = new javax.swing.JButton();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextPane18 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextPane19 = new javax.swing.JTextPane();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1QuanLyGiangVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Giảng Viên", "Họ và Tên", "Ngày Sinh", "Giới Tính", "Chuyên Ngành", "Học Vị", "Email", "Số Điện Thoại", "Số Căn Cước", "Xã/Phường", "Quận/Huyện", "Tỉnh/Thành Phố", "Nơi thường trú", "Tên Khoa", "Hình Ảnh", "Tài Khoản", "Mật Khẩu"
            }
        ));
        jScrollPane1.setViewportView(jTable1QuanLyGiangVien);

        jScrollPane24.setViewportView(jTextPane3MaGV);

        jScrollPane25.setViewportView(jTextPane4HoTenGV);

        jScrollPane26.setViewportView(jTextPane5);

        jScrollPane27.setViewportView(jTextPane6);

        jScrollPane28.setViewportView(jTextPane7);

        jScrollPane30.setViewportView(jTextPane9);

        jScrollPane31.setViewportView(jTextPane10);

        jLabel30.setText("Mã Giảng Viên");

        jLabel31.setText("Họ và Tên");

        jLabel32.setText("Ngày Sinh");

        jLabel33.setText("Giới tính");

        jLabel34.setText("Chuyền ngành");

        jLabel35.setText("Học vị");

        jLabel36.setText("Số Điện Thoại");

        jLabel37.setText("Email");

        jLabel38.setText("Khoa");

        jScrollPane33.setViewportView(jTextPane12);

        jScrollPane34.setViewportView(jTextPane13);

        jScrollPane35.setViewportView(jTextPane14);

        jScrollPane36.setViewportView(jTextPane15);

        jScrollPane37.setViewportView(jTextPane16);

        jScrollPane38.setViewportView(jTextPane17);

        jLabel39.setText("Căn cước công dân");

        jLabel40.setText("Quê Quán");

        jLabel41.setText("Xã/Phường");

        jLabel42.setText("Quận/Huyện");

        jLabel43.setText("Tỉnh/Thành phố");

        jLabel44.setText("Thường trú");

        jLabel45.setText("jLabel45");

        jButton1.setText("Chọn ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lưu");

        jButton3.setText("Thêm");

        jButton4.setText("Xóa");

        jButton5.setText("Reset");
        jButton5.setToolTipText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("Tìm Kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane18.setViewportView(jTextPane11);

        jScrollPane19.setViewportView(jTextPane22);

        jLabel55.setText("Tài khoản");

        jLabel56.setText("Mật khẩu");

        javax.swing.GroupLayout jPanelQuanLyThongTinGVLayout = new javax.swing.GroupLayout(jPanelQuanLyThongTinGV);
        jPanelQuanLyThongTinGV.setLayout(jPanelQuanLyThongTinGVLayout);
        jPanelQuanLyThongTinGVLayout.setHorizontalGroup(
            jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jLabel31)
                                .addComponent(jScrollPane19))
                            .addComponent(jLabel55)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane18)
                                .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jLabel32))
                            .addComponent(jLabel56))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelQuanLyThongTinGVLayout.setVerticalGroup(
            jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                            .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel44))
                                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel42))
                                .addComponent(jLabel41)
                                .addComponent(jLabel40))
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanelQuanLyThongTinGVLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelQuanLyThongTinGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý thông giảng viên", jPanelQuanLyThongTinGV);

        tableSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Giới tính", "Ngày sinh", "Nơi sinh", "Quê Quán", "Quốc Tịch", "Dân Tộc", "Nơi Thường trú", "Xã/Phường", "Quận/Huyện", "Tỉnh/Thành Phố", "Số Điện Thoại", "Số Căn Cước", "Email", "Khoa", "Chuyên ngành", "Lớp", "Tài khoản", "Mật khẩu"
            }
        ));
        jScrollPane2.setViewportView(tableSinhVien);

        jLabel7.setText("Mã sinh viên");

        jScrollPane3.setViewportView(MSV);

        jLabel8.setText("Họ và tên");

        jScrollPane4.setViewportView(Hoten);

        jLabel9.setText("Ngày sinh");

        jScrollPane5.setViewportView(Ngaysinh);

        jLabel10.setText("Nơi sinh");

        jScrollPane6.setViewportView(Noisinh);

        jScrollPane7.setViewportView(Gioitinh);

        jLabel11.setText("Giới tính");

        jLabel12.setText("Quê quán");

        jScrollPane8.setViewportView(Quequan);

        jScrollPane9.setViewportView(Quoctich);

        jLabel13.setText("Quốc tịch");

        jLabel14.setText("Dân tộc");

        jScrollPane10.setViewportView(Dantoc);

        jLabel15.setText("Nơi thường trú");

        jScrollPane11.setViewportView(Noithuongtru);

        jLabel16.setText("Xã/Phường");

        jScrollPane12.setViewportView(XaPhuong);

        jLabel17.setText("Quận/Huyện");

        jScrollPane13.setViewportView(QuanHuyen);

        jLabel18.setText("Tỉnh/Thành phố");

        jScrollPane14.setViewportView(TinhThanhPho);

        jLabel19.setText("Số điện thoại");

        jScrollPane15.setViewportView(SDT);

        jLabel20.setText("Căn cước công dân");

        jScrollPane16.setViewportView(CCCD);

        jLabel21.setText("Email");

        jScrollPane17.setViewportView(Emai);

        jLabel22.setText("Khoa ");

        jLabel23.setText("Lớp");

        jLabel24.setText("Chuyên ngành");

        ThemSinhVien.setText("Thêm sinh viên");

        SuaSinhVien.setText("Sửa sinh viên");

        XoaSinhVien.setText("Xóa Sinh Viên");

        jComboBox1TimKiemChuyenNganhKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1TimKiemChuyenNganhKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1TimKiemChuyenNganhKhoaActionPerformed(evt);
            }
        });

        jComboBox2TimKiemKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2TimKiemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2TimKiemKhoaActionPerformed(evt);
            }
        });

        jComboBox2TimKiemLopCNKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2TimKiemLopCNKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2TimKiemLopCNKhoaActionPerformed(evt);
            }
        });

        TaiAnhlen.setText("Chọn ảnh");

        TImKiem.setText("Tìm Kiếm");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jScrollPane22.setViewportView(jTextPane1);

        jScrollPane23.setViewportView(jTextPane2);

        jLabel25.setText("Tài khoản");

        jLabel26.setText("Mật khẩu");

        AnhSinhVien.setText("Ảnh");

        jLabel4.setText("Chọn Khoa");

        jLabel28.setText("Chọn chuyên ngành");

        jLabel29.setText("Chọn Lớp");

        jComboBox4Khoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5Lop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5ChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel69.setText("Khóa");

        jScrollPane55.setViewportView(Khoahoc);

        javax.swing.GroupLayout jPanelQuanLyThongTinSVLayout = new javax.swing.GroupLayout(jPanelQuanLyThongTinSV);
        jPanelQuanLyThongTinSV.setLayout(jPanelQuanLyThongTinSVLayout);
        jPanelQuanLyThongTinSVLayout.setHorizontalGroup(
            jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                    .addComponent(jLabel20)))
                                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel25))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel21)
                                            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(jComboBox2TimKiemKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))))
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1TimKiemChuyenNganhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                    .addComponent(jComboBox2TimKiemLopCNKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(TImKiem)
                                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(AnhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TaiAnhlen, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(XoaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ThemSinhVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SuaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox4Khoa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14)
                                        .addComponent(jScrollPane10)
                                        .addComponent(jComboBox5Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jComboBox5ChuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel15))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(14, 14, 14))))
        );
        jPanelQuanLyThongTinSVLayout.setVerticalGroup(
            jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(7, 7, 7)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(7, 7, 7)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox4Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(35, 35, 35))))
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox5Lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox5ChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(29, 29, 29)))))
                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel4))
                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TaiAnhlen)
                                        .addComponent(ThemSinhVien)
                                        .addComponent(SuaSinhVien)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reset)
                                            .addComponent(XoaSinhVien)))
                                    .addGroup(jPanelQuanLyThongTinSVLayout.createSequentialGroup()
                                        .addComponent(jLabel69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(AnhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addGroup(jPanelQuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1TimKiemChuyenNganhKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2TimKiemKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2TimKiemLopCNKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TImKiem)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý thông tin sinh viên", jPanelQuanLyThongTinSV);

        jComboBox7Khoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox8ChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox9Lop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel46.setText("Khoa");

        jLabel47.setText("Chuyên ngành");

        jLabel48.setText("Lớp");

        jButton7.setText("Reset");

        jLabel50.setText("Khoa");

        jLabel51.setText("Chuyên ngành");

        jLabel52.setText("Lớp");

        jLabel53.setText("Môn học");

        jScrollPane29.setViewportView(Khoa);

        jScrollPane39.setViewportView(Chuyennganh);

        jScrollPane40.setViewportView(Lop);

        jScrollPane41.setViewportView(Sotinchi);

        jButton8.setText("Thêm Khoa");

        jButton9.setText("Sửa");
        jButton9.setToolTipText("");

        jButton10.setText("Xóa");

        jButton11.setText("Thêm chuyên ngành");

        jButton12.setText("Sửa");

        jButton13.setText("Xóa");

        jButton14.setText("Thêm lớp học");

        jButton15.setText("Sửa");

        jButton16.setText("Xóa");

        jButton17.setText("Thêm môn học");

        jButton18.setText("Sửa");

        jButton19.setText("Xóa");
        jButton19.setToolTipText("");

        jScrollPane42.setViewportView(MonHoc);

        jLabel54.setText("Số Tín chỉ");

        jLabel63.setText("Bảng Khoa");

        jTable1BangKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Khoa", "Tên Khoa"
            }
        ));
        jScrollPane44.setViewportView(jTable1BangKhoa);

        jTable2BangChuyenNganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Khoa", "Mã Chuyên Ngành", "Tên Chuyên Ngành"
            }
        ));
        jScrollPane45.setViewportView(jTable2BangChuyenNganh);

        jLabel64.setText("Bảng Chuyên ngành");

        jTable3BangLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Khoa", "Tên Chuyên Ngành", "Mã Lớp", "Tên Lớp"
            }
        ));
        jScrollPane46.setViewportView(jTable3BangLop);

        jLabel65.setText("Bảng Lớp");

        jLabel66.setText("Bảng môn học");

        jTable5MonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã môn học", "Tên môn học", "Số Tín Chỉ"
            }
        ));
        jScrollPane21.setViewportView(jTable5MonHoc);

        javax.swing.GroupLayout jPanelQuanLyKhoaLayout = new javax.swing.GroupLayout(jPanelQuanLyKhoa);
        jPanelQuanLyKhoa.setLayout(jPanelQuanLyKhoaLayout);
        jPanelQuanLyKhoaLayout.setHorizontalGroup(
            jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10)
                                    .addComponent(jScrollPane29, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jComboBox7Khoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel51)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12)
                                    .addComponent(jScrollPane39)
                                    .addComponent(jComboBox8ChuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton13))
                                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox9Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton14)
                                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton15)
                                            .addComponent(jButton16)))))
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel63)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel64)))
                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel54)
                                    .addComponent(jButton17)
                                    .addComponent(jButton18)
                                    .addComponent(jButton19)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane42, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jScrollPane41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel65)))
                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel66)
                        .addGap(217, 217, 217))
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))))
        );
        jPanelQuanLyKhoaLayout.setVerticalGroup(
            jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel48)
                            .addComponent(jLabel53))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox7Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox8ChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox9Lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51))
                                .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton11)
                            .addComponent(jButton14)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton12)
                            .addComponent(jButton15)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton13)
                            .addComponent(jButton16)
                            .addComponent(jButton19))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelQuanLyKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelQuanLyKhoaLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane21))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Quản lý Khoa", jPanelQuanLyKhoa);

        jTable1QuanLySinhVien2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane32.setViewportView(jTable1QuanLySinhVien2);

        jLabel57.setText("Khoa");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel58.setText("Chuyên ngành");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel59.setText("Lớp");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel60.setText("Môn học");

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane20.setViewportView(jTextPane23);

        jLabel61.setText("Mã sinh viên");

        jScrollPane43.setViewportView(jTextPane24);

        jLabel62.setText("Họ và tên");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 1421, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel58)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel61)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản lý Điểm", jPanel4);

        jLabel27.setText("Năm học");

        jScrollPane47.setViewportView(jTextPane3);

        jButton20.setText("Thêm năm học");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane48.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane49.setViewportView(jTable2);

        jTextPane4.setEditable(false);
        jScrollPane50.setViewportView(jTextPane4);

        jTextPane8.setEditable(false);
        jScrollPane51.setViewportView(jTextPane8);

        jTextPane18.setEditable(false);
        jScrollPane52.setViewportView(jTextPane18);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jScrollPane50))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane51))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 430, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                            .addComponent(jScrollPane48)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý lịch dạy", jPanel5);

        jLabel49.setText("Khóa học");

        jScrollPane53.setViewportView(jTextPane19);

        jLabel67.setText("Khoa");

        jLabel68.setText("Chuyên ngành");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton21.setText("Thêm Khóa học");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane54.setViewportView(jTable3);

        jLabel70.setText("Khóa học");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton22.setText("Sửa");

        jButton23.setText("Xóa");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBox5, 0, 112, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(269, 269, 269))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane53, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton22)
                                    .addComponent(jButton23))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(758, 758, 758))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton23))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý Khoa đào tạo", jPanel1);

        jLabel1.setText("Ảnh");

        jLabel2.setText("Họ và Tên: ");

        jLabel3.setText("Mã Giảng Viên:");

        jLabel5.setText("Hiển thị MGV");

        jLabel6.setText("Hiển thị tên");

        Thoat.setText("Thoát");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1007, 1007, 1007)
                                .addComponent(Thoat)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Thoat)
                        .addGap(4, 4, 4)))
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableSinhVien.getModel();
        model.setRowCount(0); // Xóa toàn bộ dữ liệu hiện tại

        // Gọi lại hàm loadDanhSachSinhVien để tải lại dữ liệu từ database
        loadDanhSachSinhVien();
    }//GEN-LAST:event_resetActionPerformed

    private void jComboBox2TimKiemLopCNKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2TimKiemLopCNKhoaActionPerformed

    }//GEN-LAST:event_jComboBox2TimKiemLopCNKhoaActionPerformed

    private void jComboBox2TimKiemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2TimKiemKhoaActionPerformed
        String khoa = (String) jComboBox2TimKiemKhoa.getSelectedItem();

        if (khoa != null && !khoa.isEmpty()) {
            loadDanhSachSinhVienTheoKhoa(khoa);  // Hiển thị SV thuộc khoa

            jComboBox2TimKiemLopCNKhoa.removeAllItems(); // Xóa lớp cũ nếu có
        }
    }//GEN-LAST:event_jComboBox2TimKiemKhoaActionPerformed

    private void jComboBox1TimKiemChuyenNganhKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1TimKiemChuyenNganhKhoaActionPerformed

    }//GEN-LAST:event_jComboBox1TimKiemChuyenNganhKhoaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed


public void loadDanhSachSinhVienTheoKhoa(String tenKhoa) {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT sv.MaSV, sv.HoTen, sv.GioiTinh, sv.NgaySinh, sv.NoiSinh, sv.QueQuan, sv.QuocTich, " +
                     "       sv.DanToc, sv.NoiThuongTru, sv.XaPhuong, sv.HuyenQuan, sv.TinhThanh, sv.SoDienThoai, sv.CCCD, " +
                     "       sv.Email, sv.MaKhoa, sv.MaLop, sv.MaCN, sv.AnhSinhVien, tk.TenDangNhap, tk.MatKhau, " +
                     "       k.TenKhoa, cn.TenChuyenNganh, l.TenLop " +
                     "FROM SinhVien sv " +
                     "LEFT JOIN TaiKhoan tk ON sv.MaSV = tk.MaSV " +
                     "LEFT JOIN Khoa k ON sv.MaKhoa = k.MaKhoa " +
                     "LEFT JOIN ChuyenNganh cn ON sv.MaCN = cn.MaCN " +
                     "LEFT JOIN Lop l ON sv.MaLop = l.MaLop " +
                     "WHERE k.TenKhoa = ?";  // Truy vấn thông tin sinh viên theo tên khoa

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tenKhoa);  // Gán giá trị tên khoa vào truy vấn
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tableSinhVien.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("MaSV"),
                rs.getString("HoTen"),
                rs.getString("GioiTinh"),
                rs.getDate("NgaySinh"),
                rs.getString("NoiSinh"),
                rs.getString("QueQuan"),
                rs.getString("QuocTich"),
                rs.getString("DanToc"),
                rs.getString("NoiThuongTru"),
                rs.getString("XaPhuong"),
                rs.getString("HuyenQuan"),
                rs.getString("TinhThanh"),
                rs.getString("SoDienThoai"),
                rs.getString("CCCD"),
                rs.getString("Email"),
                rs.getString("TenKhoa"),
                rs.getString("TenChuyenNganh"),
                rs.getString("TenLop"),
                rs.getString("TenDangNhap"),
                rs.getString("MatKhau")
            });
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách sinh viên!");
    }
}

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminKhoa().setVisible(true);
            }
        });
    }
    
    
    public void loadDanhSachGiangVien() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT gv.MaGV, gv.HoTen, gv.NgaySinh, gv.GioiTinh, gv.ChuyenNganh, gv.HocVi, " +
                     "       gv.Email, gv.SDT, gv.CCCD, gv.XaPhuong, gv.HuyenQuan, gv.TinhThanh, " +
                     "       gv.NoiThuongTru, gv.AnhGiangVien, k.TenKhoa, tk.TenDangNhap, tk.MatKhau " +
                     "FROM GiangVien gv " +
                     "LEFT JOIN Khoa k ON gv.MaKhoa = k.MaKhoa " +
                     "LEFT JOIN TaiKhoan tk ON gv.MaGV = tk.MaGV";

        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1QuanLyGiangVien.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("MaGV"),
                rs.getString("HoTen"),
                rs.getDate("NgaySinh"),
                rs.getString("GioiTinh"),
                rs.getString("ChuyenNganh"),
                rs.getString("HocVi"),
                rs.getString("Email"),
                rs.getString("SDT"),
                rs.getString("CCCD"),
                rs.getString("XaPhuong"),
                rs.getString("HuyenQuan"),
                rs.getString("TinhThanh"),
                rs.getString("NoiThuongTru"),
                rs.getString("TenKhoa"),
                rs.getString("AnhGiangVien"),
                rs.getString("TenDangNhap"),
                rs.getString("MatKhau")
            });
        }

        rs.close();
        stmt.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách giảng viên!");
    }
}


    
    public void loadDanhSachSinhVien() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT sv.MaSV, sv.HoTen, sv.GioiTinh, sv.NgaySinh, sv.NoiSinh, sv.QueQuan, sv.QuocTich, sv.DanToc, " +
                     "       sv.NoiThuongTru, sv.XaPhuong, sv.HuyenQuan, sv.TinhThanh, sv.SoDienThoai, sv.CCCD, sv.Email, " +
                     "       sv.MaKhoa, sv.MaLop, sv.MaCN, sv.AnhSinhVien, tk.TenDangNhap, tk.MatKhau, " +
                     "       k.TenKhoa, cn.TenChuyenNganh, l.TenLop " +
                     "FROM SinhVien sv " +
                     "LEFT JOIN TaiKhoan tk ON sv.MaSV = tk.MaSV " +
                     "LEFT JOIN Khoa k ON sv.MaKhoa = k.MaKhoa " +
                     "LEFT JOIN ChuyenNganh cn ON sv.MaCN = cn.MaCN " +
                     "LEFT JOIN Lop l ON sv.MaLop = l.MaLop";

        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tableSinhVien.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("MaSV"),
                rs.getString("HoTen"),
                rs.getString("GioiTinh"),
                rs.getDate("NgaySinh"),
                rs.getString("NoiSinh"),
                rs.getString("QueQuan"),
                rs.getString("QuocTich"),
                rs.getString("DanToc"),
                rs.getString("NoiThuongTru"),
                rs.getString("XaPhuong"),
                rs.getString("HuyenQuan"),
                rs.getString("TinhThanh"),
                rs.getString("SoDienThoai"),
                rs.getString("CCCD"),
                rs.getString("Email"),
                rs.getString("TenKhoa"),
                rs.getString("TenChuyenNganh"),
                rs.getString("TenLop"),
                rs.getString("TenDangNhap"),
                rs.getString("MatKhau")
            });
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách sinh viên!");
    }
}
   
    
    

    
    // Load Khoa vào ComboBox
    public void loadComboBoxKhoa() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT MaKhoa, TenKhoa FROM Khoa";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            jComboBox4Khoa.addItem(rs.getString("TenKhoa"));
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách Khoa!");
    }
}

    // Load Chuyên Ngành vào ComboBox
public void loadComboBoxChuyenNganh() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT MaCN, TenChuyenNganh FROM ChuyenNganh";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            jComboBox5ChuyenNganh.addItem(rs.getString("TenChuyenNganh"));
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách Chuyên Ngành!");
    }
}

// Load Lớp vào ComboBox
public void loadComboBoxLop() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT MaLop, TenLop FROM Lop";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            jComboBox5Lop.addItem(rs.getString("TenLop"));
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách Lớp!");
    }
}

    private void hienThiThongTinSinhVien(int maSV) {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT * FROM SinhVien WHERE MaSV=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Hiển thị các thông tin văn bản
            MSV.setText(rs.getString("MaSV"));
            Hoten.setText(rs.getString("HoTen"));
            Gioitinh.setText(rs.getString("GioiTinh"));
            Ngaysinh.setText(rs.getString("NgaySinh"));
            Noisinh.setText(rs.getString("NoiSinh"));
            Quequan.setText(rs.getString("QueQuan"));
            Quoctich.setText(rs.getString("QuocTich"));
            Dantoc.setText(rs.getString("DanToc"));
            Noithuongtru.setText(rs.getString("NoiThuongTru"));
            XaPhuong.setText(rs.getString("XaPhuong"));
            QuanHuyen.setText(rs.getString("HuyenQuan"));
            TinhThanhPho.setText(rs.getString("TinhThanh"));
            SDT.setText(rs.getString("SoDienThoai"));
            CCCD.setText(rs.getString("CCCD"));
            Emai.setText(rs.getString("Email"));

            // Hiển thị ảnh
            byte[] imgData = rs.getBytes("AnhSinhVien");
            if (imgData != null) {
                InputStream is = new ByteArrayInputStream(imgData);
                BufferedImage bufferedImage = ImageIO.read(is);
                ImageIcon icon = new ImageIcon(bufferedImage.getScaledInstance(150, 200, Image.SCALE_SMOOTH));
                AnhSinhVien.setIcon(icon);
            } else {
                AnhSinhVien.setIcon(null);
            }

            // Hiển thị Khoa vào jComboBox4Khoa
            int maKhoa = rs.getInt("MaKhoa");
            PreparedStatement stmtKhoa = conn.prepareStatement("SELECT TenKhoa FROM Khoa WHERE MaKhoa=?");
            stmtKhoa.setInt(1, maKhoa);
            ResultSet rsKhoa = stmtKhoa.executeQuery();
            if (rsKhoa.next()) {
                jComboBox4Khoa.setSelectedItem(rsKhoa.getString("TenKhoa"));
            }

            // Hiển thị Lớp vào jComboBox5Lop
            int maLop = rs.getInt("MaLop");
            PreparedStatement stmtLop = conn.prepareStatement("SELECT TenLop FROM Lop WHERE MaLop=?");
            stmtLop.setInt(1, maLop);
            ResultSet rsLop = stmtLop.executeQuery();
            if (rsLop.next()) {
                jComboBox5Lop.setSelectedItem(rsLop.getString("TenLop"));
            }

            // Hiển thị Chuyên ngành vào jComboBox5ChuyenNganh
            int maCN = rs.getInt("MaCN");
            PreparedStatement stmtCN = conn.prepareStatement("SELECT TenChuyenNganh FROM ChuyenNganh WHERE MaCN=?");
            stmtCN.setInt(1, maCN);
            ResultSet rsCN = stmtCN.executeQuery();
            if (rsCN.next()) {
                jComboBox5ChuyenNganh.setSelectedItem(rsCN.getString("TenChuyenNganh"));
            }

            // Đóng ResultSet
            rsKhoa.close();
            rsLop.close();
            rsCN.close();
            stmtKhoa.close();
            stmtLop.close();
            stmtCN.close();
        }

        rs.close();
        stmt.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Lỗi khi hiển thị thông tin sinh viên: " + e.getMessage());
    }
}

    public void loadKhoa() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT MaKhoa, TenKhoa FROM Khoa";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1BangKhoa.getModel();
        model.setRowCount(0); // Xoá dữ liệu cũ

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("MaKhoa"),
                rs.getString("TenKhoa")
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void loadChuyenNganh() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT k.TenKhoa, cn.MaCN, cn.TenChuyenNganh " +
                     "FROM ChuyenNganh cn " +
                     "JOIN Khoa_ChuyenNganh kc ON cn.MaCN = kc.MaCN " +
                     "JOIN Khoa k ON kc.MaKhoa = k.MaKhoa";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable2BangChuyenNganh.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("TenKhoa"),
                rs.getInt("MaCN"),
                rs.getString("TenChuyenNganh")
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void loadLop() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT k.TenKhoa, cn.TenChuyenNganh, l.MaLop, l.TenLop " +
                     "FROM Lop l " +
                     "JOIN Khoa k ON l.MaKhoa = k.MaKhoa " +
                     "JOIN Khoa_ChuyenNganh kc ON k.MaKhoa = kc.MaKhoa " +
                     "JOIN ChuyenNganh cn ON kc.MaCN = cn.MaCN";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable3BangLop.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("TenKhoa"),
                rs.getString("TenChuyenNganh"),
                rs.getInt("MaLop"),
                rs.getString("TenLop")
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void loadMonHoc() {
    try (Connection conn = KetNoiCSDL.connect()) {
        String sql = "SELECT MaMH, TenMH, SoTinChi FROM MonHoc";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable5MonHoc.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("MaMH"),
                rs.getString("TenMH"),
                rs.getInt("SoTinChi")
            });
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnhSinhVien;
    private javax.swing.JTextPane CCCD;
    private javax.swing.JTextPane Chuyennganh;
    private javax.swing.JTextPane Dantoc;
    private javax.swing.JTextPane Emai;
    private javax.swing.JTextPane Gioitinh;
    private javax.swing.JTextPane Hoten;
    private javax.swing.JTextPane Khoa;
    private javax.swing.JTextPane Khoahoc;
    private javax.swing.JTextPane Lop;
    private javax.swing.JTextPane MSV;
    private javax.swing.JTextPane MonHoc;
    private javax.swing.JTextPane Ngaysinh;
    private javax.swing.JTextPane Noisinh;
    private javax.swing.JTextPane Noithuongtru;
    private javax.swing.JTextPane QuanHuyen;
    private javax.swing.JTextPane Quequan;
    private javax.swing.JTextPane Quoctich;
    private javax.swing.JTextPane SDT;
    private javax.swing.JTextPane Sotinchi;
    private javax.swing.JButton SuaSinhVien;
    private javax.swing.JButton TImKiem;
    private javax.swing.JButton TaiAnhlen;
    private javax.swing.JButton ThemSinhVien;
    private javax.swing.JButton Thoat;
    private javax.swing.JTextPane TinhThanhPho;
    private javax.swing.JTextPane XaPhuong;
    private javax.swing.JButton XoaSinhVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox1TimKiemChuyenNganhKhoa;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox2TimKiemKhoa;
    private javax.swing.JComboBox<String> jComboBox2TimKiemLopCNKhoa;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox4Khoa;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox5ChuyenNganh;
    private javax.swing.JComboBox<String> jComboBox5Lop;
    private javax.swing.JComboBox<String> jComboBox7Khoa;
    private javax.swing.JComboBox<String> jComboBox8ChuyenNganh;
    private javax.swing.JComboBox<String> jComboBox9Lop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelQuanLyKhoa;
    private javax.swing.JPanel jPanelQuanLyThongTinGV;
    private javax.swing.JPanel jPanelQuanLyThongTinSV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable1BangKhoa;
    private javax.swing.JTable jTable1QuanLyGiangVien;
    private javax.swing.JTable jTable1QuanLySinhVien2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable2BangChuyenNganh;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable3BangLop;
    private javax.swing.JTable jTable5MonHoc;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane14;
    private javax.swing.JTextPane jTextPane15;
    private javax.swing.JTextPane jTextPane16;
    private javax.swing.JTextPane jTextPane17;
    private javax.swing.JTextPane jTextPane18;
    private javax.swing.JTextPane jTextPane19;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane22;
    private javax.swing.JTextPane jTextPane23;
    private javax.swing.JTextPane jTextPane24;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane3MaGV;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane4HoTenGV;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JButton reset;
    private javax.swing.JTable tableSinhVien;
    // End of variables declaration//GEN-END:variables

    private void loadChuyenNganhTheoKhoa(int maKhoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadSinhVienTheoKhoa(int maKhoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadLopTheoChuyenNganh(int maCN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadSinhVienTheoChuyenNganh(int maCN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadSinhVienTheoLop(int maLop) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
