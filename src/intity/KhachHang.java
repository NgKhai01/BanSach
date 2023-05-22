/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String idKhachHang;
    private String hoTen;
    private String diaChi;
    private String email;
    private String dienThoai;

    public KhachHang() {
    }

    public KhachHang(String idKhachHang, String hoTen, String diaChi, String email, String dienThoai) {
        this.idKhachHang = idKhachHang;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.dienThoai = dienThoai;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "idKhachHang=" + idKhachHang + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", email=" + email + ", dienThoai=" + dienThoai + '}';
    }
    
}
