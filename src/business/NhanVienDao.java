/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import intity.NhanVien;
import java.sql.PreparedStatement;
import java.sql.Statement;
import connect.MyConnection;
import intity.KhachHang;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVienDao implements Dao<NhanVien>{
    private final String TABLE_NAME = "tbl_nhanvien";
    MyConnection myConnection = MyConnection.getInstance();
    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getDate(3),rs.getDate(4),
                        rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;       
    }

    @Override
    public Optional<NhanVien> get(int id) {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 
    }

    @Override
    public Optional<NhanVien> get(String idNhanVien) {
    NhanVien nhanVien = new NhanVien();
    Connection conn = myConnection.getConnection();
    PreparedStatement ps = null;
    String sql = "select * from "+ TABLE_NAME +" where idNhanVien = ?";
    ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, idNhanVien);
            rs = ps.executeQuery();
            while (rs.next()) {                
                nhanVien = new NhanVien(rs.getString(1), rs.getString(2), rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.of(nhanVien);    
    }

    @Override
    public int insert(NhanVien t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (idNhanVien, hoTen, ngaySinh, ngayLamViec, diaChi, dienThoai, luongCoBan,anh) VALUES(?,?,?,?,?,?,?,?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdNhanVien());
            ps.setString(2, t.getHoTen());
            ps.setDate(3, (Date) t.getNgaySinh());
            ps.setDate(4, (Date) t.getNgayLamViec());
            ps.setString(5, t.getDiaChi());
            ps.setString(6, t.getDienThoai());
            ps.setInt(7, t.getLuongCoBan());
            ps.setString(8, t.getAnh());
            if(ps.executeUpdate() > 0){
                return 1;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;    }

    @Override
    public boolean update(NhanVien t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set hoTen = ?, ngaySinh = ?, ngayLamViec = ?, diaChi = ?, dienThoai = ?, luongCoBan = ?, anh = ? where idNhanVien = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getHoTen());
            ps.setDate(2, (Date) t.getNgaySinh());
            ps.setDate(3, (Date) t.getNgayLamViec());
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getDienThoai());
            ps.setInt(6, t.getLuongCoBan());
            ps.setString(7, t.getAnh());
            ps.setString(8, t.getIdNhanVien());
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }

    @Override
    public boolean delete(NhanVien t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from "+TABLE_NAME+" where idNhanVien = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdNhanVien());
            if(ps.executeUpdate() > 0){ 
             return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }
    public static void main(String[] args) {
        NhanVienDao dao = new NhanVienDao();
        System.out.println(dao.getAll());
    }
    
}
