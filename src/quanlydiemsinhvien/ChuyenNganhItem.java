/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlydiemsinhvien;

/**
 *
 * @author thuan
 */
public class ChuyenNganhItem {
    private String maCN;
    private String tenChuyenNganh;

    public ChuyenNganhItem(String maCN, String tenChuyenNganh) {
        this.maCN = maCN;
        this.tenChuyenNganh = tenChuyenNganh;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getTenChuyenNganh() {
        return tenChuyenNganh;
    }

    public void setTenChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }

    @Override
    public String toString() {
        return tenChuyenNganh;  // Đảm bảo ComboBox chỉ hiển thị TenChuyenNganh
    }
}

