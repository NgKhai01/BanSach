/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intity;

/**
 *
 * @author Admin
 */
public class DonDatHang {
    private int soHoaDon;
    private String idKhachHang;
    private String idNhanVien;
    private String ngayDatHang;
    private String ngayGiaoHang;
    private String noiGaioHang;

    public DonDatHang() {
    }

    public DonDatHang(int soHoaDon, String idKhachHang, String idNhanVien, String ngayDatHang, String ngayGiaoHang, String noiGaioHang) {
        this.soHoaDon = soHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.ngayDatHang = ngayDatHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.noiGaioHang = noiGaioHang;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(String ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(String ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getNoiGaioHang() {
        return noiGaioHang;
    }

    public void setNoiGaioHang(String noiGaioHang) {
        this.noiGaioHang = noiGaioHang;
    }

    @Override
    public String toString() {
        return "DonDatHang{" + "soHoaDon=" + soHoaDon + ", idKhachHang=" + idKhachHang + ", idNhanVien=" + idNhanVien + ", ngayDatHang=" + ngayDatHang + ", ngayGiaoHang=" + ngayGiaoHang + ", noiGaioHang=" + noiGaioHang + '}';
    }
    
}
