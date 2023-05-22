/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.sql.PreparedStatement;
import java.sql.Statement;
import connect.MyConnection;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import intity.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class KhachHangDao implements Dao<KhachHang>{
    private final String TABLE_NAME = "tbl_khachhang";
    MyConnection myConnection = MyConnection.getInstance();
    @Override
    public List getAll() {
        List<KhachHang> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new KhachHang(rs.getString("idKhachHang"), rs.getString("hoTen"), rs.getString("diaChi"),rs.getString("email"),rs.getString("dienThoai")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;       
    }
    
    @Override
    public int insert(KhachHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (idKhachHang, hoTen, diaChi, email, dienThoai) VALUES(?,?,?,?,?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdKhachHang());
            ps.setString(2, t.getHoTen());
            ps.setString(3, t.getDiaChi());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getDienThoai());
            if(ps.executeUpdate() > 0){
                return 1;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Optional get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional get(String idKhachHang) { 
    KhachHang khachHang = new KhachHang();
    Connection conn = myConnection.getConnection();
    PreparedStatement ps = null;
    String sql = "select * from "+ TABLE_NAME +" where idKhachHang = ?";
    ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, idKhachHang);
            rs = ps.executeQuery();
            while (rs.next()) {                
                khachHang = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.of(khachHang);
    }
    
    @Override
    public boolean update(KhachHang t) { 
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set hoTen = ?, diaChi = ?, email = ?, dienThoai = ? where idKhachHang = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getHoTen());
            ps.setString(2,t.getDiaChi());
            ps.setString(3, t.getEmail());
            ps.setString(4, t.getDienThoai());
            ps.setString(5, t.getIdKhachHang());
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean delete(KhachHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from "+TABLE_NAME+" where idKhachHang = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdKhachHang());
            if(ps.executeUpdate() > 0){ 
             return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
     public static void main(String[] args) {
        KhachHangDao dao = new KhachHangDao();
        System.out.println(dao.update(new KhachHang("kh05", "Pham Hoa", "hungyen", "hoa@gmail.com", "09873232")));
    }

    
    

    
    

   
    
    
  
}
