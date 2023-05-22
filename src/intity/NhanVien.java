/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String idNhanVien;
    private String hoTen;
    private Date ngaySinh;
    private Date ngayLamViec;
    private String diaChi;
    private String dienThoai;
    private int luongCoBan;
    private String anh;

    public NhanVien() {
    }

    public NhanVien(String idNhanVien, String hoTen, Date ngaySinh, Date ngayLamViec, String diaChi, String dienThoai, int luongCoBan, String anh) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayLamViec = ngayLamViec;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.luongCoBan = luongCoBan;
        this.anh = anh;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "idNhanVien=" + idNhanVien + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", ngayLamViec=" + ngayLamViec + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + ", luongCoBan=" + luongCoBan + ", anh=" + anh + '}';
    }

    
    
    
        
}
