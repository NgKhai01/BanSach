/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import intity.MatHang;
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
public class MatHangDao implements Dao<MatHang>{
    private final String TABLE_NAME = "tbl_mathang";
    MyConnection myConnection = MyConnection.getInstance();
    
    @Override
    public List<MatHang> getAll() {
        List<MatHang> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new MatHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;    
    }

    @Override
    public Optional<MatHang> get(int id) {
        MatHang matHang = new MatHang();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+ TABLE_NAME +" where id = ?";
        ResultSet rs = null;
        try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {                
                    matHang = new MatHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        return Optional.of(matHang);            
    }

    @Override
    public Optional<MatHang> get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(MatHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (idSanPham,tenSanPham,idNhaCungCap,idTheLoai,soLuong,giaHang) VALUES(?,?,?,?,?,?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdSanPham());
            ps.setString(2, t.getTenSanPham());
            ps.setInt(3, t.getIdNhaCungCap());
            ps.setInt(4, t.getIdTheLoai());
            ps.setInt(5, t.getSoLuong());
            ps.setInt(6, t.getGiaHang());
            
            if(ps.executeUpdate() > 0){
                return 1;
            }     
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;  
    }

    @Override
    public boolean update(MatHang t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set idSanPham = ?, set tenSanPham = ?, set idNhaCungCap = ?, set idTheLoai = ?, set soLuong = ?, set giaHang = ? where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getIdSanPham());
            ps.setString(2, t.getTenSanPham());
            ps.setInt(3, t.getIdNhaCungCap());
            ps.setInt(4, t.getIdTheLoai());
            ps.setInt(5, t.getSoLuong());
            ps.setInt(6, t.getGiaHang());            
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(MatHang t) {
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
        MatHangDao dao = new MatHangDao();
        System.out.println(dao.get(3));
    }
    
}
