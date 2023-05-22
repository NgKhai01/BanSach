/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

/**
 *
 * @author Admin
 */
public class ChiTietDonHang {
    private int soHoaDon;
    private String idSanPham;
    private int giaBan;
    private int soLuong;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(int soHoaDon, String idSanPham, int giaBan, int soLuong) {
        this.soHoaDon = soHoaDon;
        this.idSanPham = idSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietDonHang{" + "soHoaDon=" + soHoaDon + ", idSanPham=" + idSanPham + ", giaBan=" + giaBan + ", soLuong=" + soLuong + '}';
    }
    
}
