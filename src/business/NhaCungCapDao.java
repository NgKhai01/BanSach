/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import intity.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.Statement;
import connect.MyConnection;
import intity.KhachHang;
import intity.NhanVien;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhaCungCapDao implements Dao<NhaCungCap>{
    private final String TABLE_NAME = "tbl_nhacungcap";
    MyConnection myConnection = MyConnection.getInstance();
    @Override
    public List<NhaCungCap> getAll() {
        List<NhaCungCap> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;    }

    @Override
    public Optional<NhaCungCap> get(int idNhaCungCap) {
    NhaCungCap nhaCungCap = new NhaCungCap();
    Connection conn = myConnection.getConnection();
    PreparedStatement ps = null;
    String sql = "select * from "+ TABLE_NAME +" where id = ?";
    ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idNhaCungCap);
            rs = ps.executeQuery();
            while (rs.next()) {                
                nhaCungCap = new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.of(nhaCungCap);    }

    @Override
    public Optional<NhaCungCap> get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(NhaCungCap t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (TenNhaCungCap, DiaChi, Email, DienThoai) VALUES(?,?,?,?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTenNhaCungCap());
            ps.setString(2, t.getDiaChi());
            ps.setString(3, t.getEmail());
            ps.setString(4, t.getDienThoai());

            if(ps.executeUpdate() > 0){
                return 1;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;    }

    @Override
    public boolean update(NhaCungCap t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set TenNhaCungCap = ?, DiaChi = ?, DienThoai = ?  where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTenNhaCungCap());
            ps.setString(2,t.getDiaChi());
            ps.setString(3, t.getDienThoai());
            ps.setInt(4, t.getId());
            
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(NhaCungCap t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from "+TABLE_NAME+" where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getId());
            if(ps.executeUpdate() > 0){ 
             return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }
    
    public static void main(String[] args) {
        NhaCungCapDao dao = new NhaCungCapDao();
        System.out.println(dao.get(1));
    }
 
        
    
}
