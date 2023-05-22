/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

/**
 *
 * @author Admin
 */
public class MatHang {
    private int id;
    private String idSanPham;
    private String tenSanPham;
    private int idNhaCungCap;
    private int idTheLoai;
    private int soLuong;
    private int giaHang;

    public MatHang() {
    }

    public MatHang(int id, String idSanPham, String tenSanPham, int idNhaCungCap, int idTheLoai, int soLuong, int giaHang) {
        this.id = id;
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.idNhaCungCap = idNhaCungCap;
        this.idTheLoai = idTheLoai;
        this.soLuong = soLuong;
        this.giaHang = giaHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public int getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(int idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(int giaHang) {
        this.giaHang = giaHang;
    }

    @Override
    public String toString() {
        return "MatHang{" + "id=" + id + ", idSanPham=" + idSanPham + ", tenSanPham=" + tenSanPham + ", idNhaCungCap=" + idNhaCungCap + ", idTheLoai=" + idTheLoai + ", soLuong=" + soLuong + ", giaHang=" + giaHang + '}';
    }
    
}
