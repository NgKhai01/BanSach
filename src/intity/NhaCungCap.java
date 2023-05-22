/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

/**
 *
 * @author Admin
 */
public class NhaCungCap {
    private int id;
    private String tenNhaCungCap;
    private String diaChi;
    private String email;
    private String dienThoai;

    public NhaCungCap() {
    }

    public NhaCungCap(int id, String tenNhaCungCap, String diaChi, String email, String dienThoai) {
        this.id = id;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.email = email;
        this.dienThoai = dienThoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
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
        return "NhaCungCap{" + "id=" + id + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChi=" + diaChi + ", email=" + email + ", dienThoai=" + dienThoai + '}';
    }
    
}
