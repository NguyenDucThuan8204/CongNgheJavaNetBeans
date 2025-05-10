
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
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

public class Sinhvien extends javax.swing.JFrame {
    

    public Sinhvien() {
        initComponents();
    }
    public Sinhvien(int maSV) {
    this(); // gọi constructor mặc định do GUI Builder tạo ra
    hienThiThongTinSinhVien(maSV);
    hienThiBangDiem(maSV);
    hienThiTinChiTichLuy(maSV);  // Cập nhật tín chỉ tích lũy
    hienThiMonHocLai(maSV);      // Cập nhật số môn học lại
    hienThiDiemHocTapThang10(maSV);  // Cập nhật điểm học tập thang 10 và xếp loại học lực
    hienThiDiemHocTapThang4(maSV);  // Cập nhật điểm học tập thang 4 và xếp loại học lực
}
    private void hienThiDiemHocTapThang4(int maSV) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
        String sql = "SELECT AVG(d.DiemTongKet) AS DiemHocTapThang10 " +
                     "FROM Diem d " +
                     "WHERE d.MaSV = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            double diemHocTapThang10 = rs.getDouble("DiemHocTapThang10");
            double diemHocTapThang4 = convertToThang4(diemHocTapThang10); // Chuyển từ thang 10 sang thang 4
            ThangDiem4.setText(String.format("%.2f", diemHocTapThang4));  // Hiển thị điểm thang 4

            // Xếp loại học lực
            String xepLoai = xepLoaiHocLuc(diemHocTapThang4);
            HocLuc.setText(xepLoai);  // Hiển thị xếp loại học lực (Giỏi, Khá, Trung bình, Yếu, Xuất sắc)
        } else {
            ThangDiem4.setText("0");
            HocLuc.setText("Yếu");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tính điểm học tập thang 4!");
    }
}

    private double convertToThang4(double diemThang10) {
    if (diemThang10 >= 9) {
        return 4.0;
    } else if (diemThang10 >= 8) {
        return 3.5;
    } else if (diemThang10 >= 7) {
        return 3.0;
    } else if (diemThang10 >= 6) {
        return 2.5;
    } else if (diemThang10 >= 5) {
        return 2.0;
    } else {
        return 0.0;
    }
}
    
    private String xepLoaiHocLuc(double diemThang4) {
    if (diemThang4 >= 3.6) {
        return "Xuất sắc";
    } else if (diemThang4 >= 3.2) {
        return "Giỏi";
    } else if (diemThang4 >= 2.5) {
        return "Khá";
    } else if (diemThang4 >= 1.5) {
        return "Trung bình";
    } else {
        return "Yếu";
    }
}



    
    private void hienThiDiemHocTapThang10(int maSV) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
        String sql = "SELECT AVG(d.DiemTongKet) AS DiemHocTapThang10 " +
                     "FROM Diem d " +
                     "WHERE d.MaSV = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            double diemHocTapThang10 = rs.getDouble("DiemHocTapThang10");
            TBDiemHT.setText(String.format("%.2f", diemHocTapThang10));  // Hiển thị điểm thang 10

            // Xếp loại học lực
            String xepLoai = xepLoaiHocLucThang10(diemHocTapThang10);
            XeploaiHocTapThangdiem10.setText(xepLoai);  // Hiển thị xếp loại học lực (Giỏi, Khá, Trung bình, Yếu, Xuất sắc)
        } else {
            TBDiemHT.setText("0");
            XeploaiHocTapThangdiem10.setText("Yếu");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tính điểm học tập thang 10!");
    }
}

private String xepLoaiHocLucThang10(double diemThang10) {
    if (diemThang10 >= 9) {
        return "Xuất sắc";
    } else if (diemThang10 >= 8) {
        return "Giỏi";
    } else if (diemThang10 >= 6.5) {
        return "Khá";
    } else if (diemThang10 >= 5) {
        return "Trung bình";
    } else {
        return "Yếu";
    }
}

    
    private void hienThiMonHocLai(int maSV) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
        String sql = "SELECT COUNT(*) AS SoMonHocLai " +
                     "FROM Diem d " +
                     "WHERE d.MaSV = ? AND d.DiemTongKet < 5";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int soMonHocLai = rs.getInt("SoMonHocLai");
            MonHoclai.setText(String.valueOf(soMonHocLai)); // Cập nhật số môn học lại
        } else {
            MonHoclai.setText("0"); // Nếu không có môn học lại
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tính số môn học lại!");
    }
}

    
    private void hienThiTinChiTichLuy(int maSV) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
        String sql = "SELECT SUM(mh.SoTinChi) AS TongTinChi " +
                     "FROM Diem d " +
                     "JOIN MonHoc mh ON d.MaMH = mh.MaMH " +
                     "WHERE d.MaSV = ? AND d.DiemTongKet >= 5";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int tongTinChi = rs.getInt("TongTinChi");
            TinchiTichluy.setText(String.valueOf(tongTinChi));
        } else {
            TinchiTichluy.setText("0");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tính tín chỉ tích lũy!");
    }
}

    
    private void hienThiBangDiem(int maSV) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");

        String sql = "SELECT " +
                "nh.TenNamHoc AS 'Năm học', " +
                "hk.TenHocKy AS 'Học kỳ', " +
                "mh.MaMH AS 'Mã môn', " +
                "mh.TenMH AS 'Tên môn', " +
                "mh.SoTinChi AS 'Số tín chỉ', " +
                "d.DiemChuyenCan AS 'Điểm chuyên cần', " +
                "d.DiemGiuaKy AS 'Điểm giữa kỳ', " +
                "d.DiemCuoiKy AS 'Điểm cuối kỳ', " +
                "d.DiemTongKet AS 'Điểm TB', " +
                "CASE " +
                "   WHEN d.DiemTongKet >= 9 THEN 'A+' " +
                "   WHEN d.DiemTongKet >= 8 THEN 'A' " +
                "   WHEN d.DiemTongKet >= 7 THEN 'B' " +
                "   WHEN d.DiemTongKet >= 6 THEN 'C' " +
                "   WHEN d.DiemTongKet >= 5 THEN 'D' " +
                "   ELSE 'F' " +
                "END AS 'Điểm bằng chữ', " +
                "CASE " +
                "   WHEN d.DiemTongKet >= 9 THEN 4.0 " +
                "   WHEN d.DiemTongKet >= 8 THEN 3.5 " +
                "   WHEN d.DiemTongKet >= 7 THEN 3.0 " +
                "   WHEN d.DiemTongKet >= 6 THEN 2.5 " +
                "   WHEN d.DiemTongKet >= 5 THEN 2.0 " +
                "   ELSE 0.0 " +
                "END AS 'Thang điểm 4.0', " +
                "CASE " +
                "   WHEN d.DiemTongKet < 5 THEN 'Học lại' " +
                "   ELSE 'Không có ghi chú' " +
                "END AS 'Ghi chú' " +
                "FROM Diem d " +
                "JOIN MonHoc mh ON d.MaMH = mh.MaMH " +
                "JOIN HocKy hk ON d.MaHK = hk.MaHK " +
                "JOIN NamHoc nh ON hk.MaNamHoc = nh.MaNamHoc " +
                "WHERE d.MaSV = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, maSV);
        ResultSet rs = stmt.executeQuery();

        // Tạo model cho JTable
        DefaultTableModel model = new DefaultTableModel();
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Thêm tên cột
        for (int i = 1; i <= columnCount; i++) {
            model.addColumn(metaData.getColumnLabel(i));
        }

        // Thêm dòng dữ liệu
        while (rs.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = rs.getObject(i);
            }
            model.addRow(rowData);
        }

        // Gán model cho jTable
        jTable1BangDiem.setModel(model);

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải bảng điểm!");
    }
}

public void hienThiThongTinSinhVien(int maSV) {
    String sql = """
        SELECT sv.*, k.TenKhoa, l.TenLop, cn.TenChuyenNganh
        FROM SinhVien sv
        LEFT JOIN Khoa k ON sv.MaKhoa = k.MaKhoa
        LEFT JOIN Lop l ON sv.MaLop = l.MaLop
        LEFT JOIN ChuyenNganh cn ON sv.MaCN = cn.MaCN
        WHERE sv.MaSV = ?
    """;

    try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, maSV);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                // Hiển thị thông tin văn bản
                Msv.setText(rs.getString("MaSV"));
                Hovaten.setText(rs.getString("HoTen"));
                
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
                Khoa.setText(rs.getString("TenKhoa"));
                Lop.setText(rs.getString("TenLop"));
                ChuyenNganh1.setText(rs.getString("TenChuyenNganh"));

                // Xử lý ảnh sinh viên
                byte[] imgData = rs.getBytes("AnhSinhVien");
                if (imgData != null && imgData.length > 0) {
                    try {
                        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imgData));

                        if (bufferedImage != null) {
                            // Thu nhỏ ảnh để vừa với JLabel mà không bị méo
                            Image scaledImage1 = bufferedImage.getScaledInstance(
                                AnhSinhVien.getWidth(), AnhSinhVien.getHeight(), Image.SCALE_SMOOTH);
                            
                            Image scaledImage2 = bufferedImage.getScaledInstance(
                                Anhsinhvien.getWidth(), Anhsinhvien.getHeight(), Image.SCALE_SMOOTH);

                            // Gán ảnh vào cả hai JLabel
                            AnhSinhVien.setIcon(new ImageIcon(scaledImage1));
                            Anhsinhvien.setIcon(new ImageIcon(scaledImage2));
                        } else {
                            // Nếu ảnh không hợp lệ, xóa icon
                            AnhSinhVien.setIcon(null);
                            Anhsinhvien.setIcon(null);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        // Nếu có lỗi khi tải ảnh, bỏ icon
                        AnhSinhVien.setIcon(null);
                        Anhsinhvien.setIcon(null);
                    }
                } else {
                    // Nếu không có ảnh, xóa icon
                    AnhSinhVien.setIcon(null);
                    Anhsinhvien.setIcon(null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã: " + maSV);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi kết nối cơ sở dữ liệu!");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi không xác định!");
    }
}


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        AnhSinhVien = new javax.swing.JLabel();
        TaiAnhLen = new javax.swing.JButton();
        Luu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Hoten = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ngaysinh = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Noisinh = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Gioitinh = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Quequan = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Quoctich = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Dantoc = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Noithuongtru = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        XaPhuong = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        QuanHuyen = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TinhThanhPho = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        SDT = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        CCCD = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Emai = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        Khoa = new javax.swing.JTextPane();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Lop = new javax.swing.JTextPane();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        ChuyenNganh1 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        MSV = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        ThangDiem4 = new javax.swing.JTextPane();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        HocLuc = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        TinchiTichluy = new javax.swing.JTextPane();
        DiemHocTapThangDiem10 = new javax.swing.JScrollPane();
        TBDiemHT = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        XeploaiHocTapThangdiem10 = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        MonHoclai = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable1BangDiem = new javax.swing.JTable();
        Anhsinhvien = new javax.swing.JLabel();
        Hotensinhvien = new javax.swing.JLabel();
        Masinhvien = new javax.swing.JLabel();
        Thoat = new javax.swing.JButton();
        Hovaten = new javax.swing.JLabel();
        Msv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaiAnhLen.setText("Tải ảnh lên");
        TaiAnhLen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaiAnhLenActionPerformed(evt);
            }
        });

        Luu.setText("lưu");
        Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã sinh viên");

        jLabel6.setText("Họ và tên");

        Hoten.setEditable(false);
        jScrollPane2.setViewportView(Hoten);

        jLabel7.setText("Ngày sinh");

        jScrollPane3.setViewportView(Ngaysinh);

        jLabel8.setText("Nơi sinh");

        jScrollPane4.setViewportView(Noisinh);

        jLabel9.setText("Giới tính");

        jScrollPane5.setViewportView(Gioitinh);

        jLabel10.setText("Quê quán");

        jScrollPane6.setViewportView(Quequan);

        jLabel11.setText("Quốc tịch");

        jScrollPane7.setViewportView(Quoctich);

        jLabel12.setText("Dân tộc");

        jScrollPane8.setViewportView(Dantoc);

        jLabel13.setText("Nơi thường trú");

        jScrollPane9.setViewportView(Noithuongtru);

        jLabel14.setText("Xã/Phường");

        jScrollPane10.setViewportView(XaPhuong);

        jLabel15.setText("Quận/Huyện");

        jScrollPane11.setViewportView(QuanHuyen);

        jLabel16.setText("Tỉnh/Thành phố");

        jScrollPane12.setViewportView(TinhThanhPho);

        jLabel17.setText("Số điện thoại");

        jScrollPane13.setViewportView(SDT);

        jLabel18.setText("Căn cước công dân");

        jScrollPane14.setViewportView(CCCD);

        jLabel19.setText("Email");

        jScrollPane15.setViewportView(Emai);

        jLabel20.setText("Khoa ");

        Khoa.setEditable(false);
        jScrollPane16.setViewportView(Khoa);

        jLabel21.setText("Lớp");

        Lop.setEditable(false);
        jScrollPane17.setViewportView(Lop);

        jLabel22.setText("Chuyên ngành");

        ChuyenNganh1.setEditable(false);
        jScrollPane18.setViewportView(ChuyenNganh1);

        MSV.setEditable(false);
        jScrollPane20.setViewportView(MSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TaiAnhLen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Luu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane20)
                                    .addComponent(jScrollPane4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane10)
                            .addComponent(jScrollPane13)
                            .addComponent(jScrollPane16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14))
                                .addGap(0, 123, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane11)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane14)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane17)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane18)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane12))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(7, 7, 7)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(7, 7, 7)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(TaiAnhLen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Luu))
                                    .addComponent(AnhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin sinh viên", jPanel1);

        ThangDiem4.setEditable(false);
        jScrollPane27.setViewportView(ThangDiem4);

        jLabel23.setText("TBC tích luỹ thang điểm 4:");

        jLabel24.setText("Xếp hạng học lực:");

        jLabel27.setText("Tín chỉ tích lũy");

        jLabel28.setText("TBC học tập thang 10:");

        jLabel29.setText("Xếp loại học tập thang 10:");

        jLabel31.setText("Môn học lại");

        HocLuc.setEditable(false);
        jScrollPane29.setViewportView(HocLuc);

        TinchiTichluy.setEditable(false);
        jScrollPane32.setViewportView(TinchiTichluy);

        TBDiemHT.setEditable(false);
        DiemHocTapThangDiem10.setViewportView(TBDiemHT);

        XeploaiHocTapThangdiem10.setEditable(false);
        jScrollPane34.setViewportView(XeploaiHocTapThangdiem10);

        MonHoclai.setEditable(false);
        jScrollPane36.setViewportView(MonHoclai);

        jTable1BangDiem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane19.setViewportView(jTable1BangDiem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel29))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DiemHocTapThangDiem10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiemHocTapThangDiem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Điểm học tập", jPanel2);

        Anhsinhvien.setText("Hiển thị ảnh");

        Hotensinhvien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Hotensinhvien.setText("Họ tên sinh viên: ");

        Masinhvien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Masinhvien.setText("Mã sinh viên: ");

        Thoat.setText("Thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        Hovaten.setText("Hiện Họ tên sinh viên");

        Msv.setText("Hiện mã sinh viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Anhsinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hotensinhvien)
                    .addComponent(Masinhvien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Msv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hovaten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Thoat)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hotensinhvien)
                            .addComponent(Hovaten))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Thoat)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Masinhvien)
                                .addComponent(Msv))))
                    .addComponent(Anhsinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String duongDanAnhMoi = null; // đường dẫn ảnh đã chọn

    private void TaiAnhLenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaiAnhLenActionPerformed
    JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Chọn ảnh");
fileChooser.setFileFilter(new FileNameExtensionFilter("Hình ảnh", "jpg", "png", "jpeg", "gif"));

int result = fileChooser.showOpenDialog(this);
if (result == JFileChooser.APPROVE_OPTION) {
    File file = fileChooser.getSelectedFile();
    duongDanAnhMoi = file.getAbsolutePath();

    // Hiển thị toàn bộ ảnh, không cắt góc
    try {
        BufferedImage fullImage = ImageIO.read(new File(duongDanAnhMoi)); 

        // Thu nhỏ ảnh để vừa với JLabel
        Image scaledImage = fullImage.getScaledInstance(
            AnhSinhVien.getWidth(), AnhSinhVien.getHeight(), Image.SCALE_SMOOTH);

        AnhSinhVien.setIcon(new ImageIcon(scaledImage)); // Hiển thị ảnh đúng kích thước trên JLabel
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi tải ảnh!");
    }
}
    }//GEN-LAST:event_TaiAnhLenActionPerformed

    private void LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuActionPerformed
                                    
    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/QuanLyDiemSinhVien", "root", "822004");

        byte[] imageBytes = null;

        // Kiểm tra xem có ảnh mới không
        if (duongDanAnhMoi != null && new File(duongDanAnhMoi).exists()) {
            BufferedImage image = ImageIO.read(new File(duongDanAnhMoi));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            baos.flush();
            imageBytes = baos.toByteArray();
            baos.close();
        } else {
            // Nếu không có ảnh mới, lấy lại ảnh cũ từ database
            String sqlGetImage = "SELECT AnhSinhVien FROM SinhVien WHERE MaSV = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sqlGetImage)) {
                stmt.setInt(1, Integer.parseInt(MSV.getText()));
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    imageBytes = rs.getBytes("AnhSinhVien"); // Giữ lại ảnh cũ
                }
            }
        }

        // Cập nhật thông tin sinh viên
        String sqlUpdate = """
            UPDATE SinhVien SET 
            HoTen = ?, GioiTinh = ?, NgaySinh = ?, NoiSinh = ?, 
            QueQuan = ?, QuocTich = ?, DanToc = ?, NoiThuongTru = ?, 
            XaPhuong = ?, HuyenQuan = ?, TinhThanh = ?, SoDienThoai = ?, 
            CCCD = ?, Email = ?, AnhSinhVien = ?
            WHERE MaSV = ?
        """;

        try (PreparedStatement stmt = conn.prepareStatement(sqlUpdate)) {
            stmt.setString(1, Hoten.getText());
            stmt.setString(2, Gioitinh.getText());
            stmt.setString(3, Ngaysinh.getText());
            stmt.setString(4, Noisinh.getText());
            stmt.setString(5, Quequan.getText());
            stmt.setString(6, Quoctich.getText());
            stmt.setString(7, Dantoc.getText());
            stmt.setString(8, Noithuongtru.getText());
            stmt.setString(9, XaPhuong.getText());
            stmt.setString(10, QuanHuyen.getText());
            stmt.setString(11, TinhThanhPho.getText());
            stmt.setString(12, SDT.getText());
            stmt.setString(13, CCCD.getText());
            stmt.setString(14, Emai.getText());
            stmt.setBytes(15, imageBytes); // Giữ lại ảnh cũ nếu không có ảnh mới
            stmt.setInt(16, Integer.parseInt(MSV.getText()));

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin sinh viên thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên với mã số này!");
            }
        }
        conn.close();
    } catch (SQLException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin sinh viên!");
    }
    }//GEN-LAST:event_LuuActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        // TODO add your handling code here:
            // Đóng form hiện tại
    this.dispose();
    
    // Mở lại form đăng nhập
    Dangnhapsinhvien dangNhap = new Dangnhapsinhvien();
    dangNhap.setVisible(true);

    }//GEN-LAST:event_ThoatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnhSinhVien;
    private javax.swing.JLabel Anhsinhvien;
    private javax.swing.JTextPane CCCD;
    private javax.swing.JTextPane ChuyenNganh1;
    private javax.swing.JTextPane Dantoc;
    private javax.swing.JScrollPane DiemHocTapThangDiem10;
    private javax.swing.JTextPane Emai;
    private javax.swing.JTextPane Gioitinh;
    private javax.swing.JTextPane HocLuc;
    private javax.swing.JTextPane Hoten;
    private javax.swing.JLabel Hotensinhvien;
    private javax.swing.JLabel Hovaten;
    private javax.swing.JTextPane Khoa;
    private javax.swing.JTextPane Lop;
    private javax.swing.JButton Luu;
    private javax.swing.JTextPane MSV;
    private javax.swing.JLabel Masinhvien;
    private javax.swing.JTextPane MonHoclai;
    private javax.swing.JLabel Msv;
    private javax.swing.JTextPane Ngaysinh;
    private javax.swing.JTextPane Noisinh;
    private javax.swing.JTextPane Noithuongtru;
    private javax.swing.JTextPane QuanHuyen;
    private javax.swing.JTextPane Quequan;
    private javax.swing.JTextPane Quoctich;
    private javax.swing.JTextPane SDT;
    private javax.swing.JTextPane TBDiemHT;
    private javax.swing.JButton TaiAnhLen;
    private javax.swing.JTextPane ThangDiem4;
    private javax.swing.JButton Thoat;
    private javax.swing.JTextPane TinchiTichluy;
    private javax.swing.JTextPane TinhThanhPho;
    private javax.swing.JTextPane XaPhuong;
    private javax.swing.JTextPane XeploaiHocTapThangdiem10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1BangDiem;
    // End of variables declaration//GEN-END:variables
}
