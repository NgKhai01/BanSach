/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import intity.ChiTietDonHang;
import java.sql.PreparedStatement;
import java.sql.Statement;
import connect.MyConnection;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class ChiTietHoaDonDao implements Dao<ChiTietDonHang>{
    private final String TABLE_NAME = "tbl_chitietdonhang";
    MyConnection myConnection = MyConnection.getInstance();
    
    @Override
    public List<ChiTietDonHang> getAll() {
        List<ChiTietDonHang> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new ChiTietDonHang(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;
    }

    @Override
    public Optional<ChiTietDonHang> get(int soHoaDon) {
        ChiTietDonHang chiTiet = new ChiTietDonHang();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+ TABLE_NAME +" where soHoaDon = ?";
        ResultSet rs = null;
        try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, soHoaDon);
                rs = ps.executeQuery();
                while (rs.next()) {                
                    chiTiet = new ChiTietDonHang(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        return Optional.of(chiTiet);    
    }

    @Override
    public Optional<ChiTietDonHang> get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(ChiTietDonHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (idSanPham,giaBan,soLuong) VALUES(?,?,?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdSanPham()); 
            ps.setInt(2, t.getGiaBan());
            ps.setInt(3, t.getSoLuong());      
            if(ps.executeUpdate() > 0){
                return 1;
            }     
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;

    }

    @Override
    public boolean update(ChiTietDonHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set idSanPham = ?, set giaBan = ?, set soLuong = ? where soHoaDon = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdSanPham());
            ps.setInt(2, t.getGiaBan());
            ps.setInt(3, t.getSoLuong());
            ps.setInt(4, t.getSoHoaDon());                      
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(ChiTietDonHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from "+TABLE_NAME+" where soHoaDon = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getSoHoaDon());
            if(ps.executeUpdate() > 0){ 
             return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
