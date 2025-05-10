
package quanlydiemsinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCSDL {
    // Thông tin kết nối MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/QuanLyDiemSinhVien";
    private static final String USER = "root"; // Thay đổi nếu cần
    private static final String PASSWORD = "822004"; // Thay đổi nếu có mật khẩu

    // Phương thức kết nối đến MySQL
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Kết nối MySQL thành công!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Không tìm thấy Driver!");
        } catch (SQLException e) {
            System.out.println("❌ Lỗi kết nối: " + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        connect(); // Kiểm tra kết nối
    }
}

