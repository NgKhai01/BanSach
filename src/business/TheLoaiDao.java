/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import intity.TheLoai;
import java.sql.PreparedStatement;
import java.sql.Statement;
import connect.MyConnection;
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
public class TheLoaiDao implements Dao<TheLoai>{
    private final String TABLE_NAME = "tbl_theloai";
    MyConnection myConnection = MyConnection.getInstance();

    @Override
    public List<TheLoai> getAll() {
        List<TheLoai> list = new ArrayList<>();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+TABLE_NAME;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new TheLoai(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return list;    }

    @Override
    public Optional<TheLoai> get(int id) {
        TheLoai theLoai = new TheLoai();
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "select * from "+ TABLE_NAME +" where idTheLoai = ?";
        ResultSet rs = null;
            try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {                
                    theLoai = new TheLoai(rs.getInt(1), rs.getString(2));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return Optional.of(theLoai);
    }

    @Override
    public Optional<TheLoai> get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(TheLoai t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into "+ TABLE_NAME + " (tenTheLoai) VALUES(?)";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTenTheLoai());
            if(ps.executeUpdate() > 0){
                return 1;
            }     
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public boolean update(TheLoai t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "update "+ TABLE_NAME + " set TenNhaCungCap = ? where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getTenTheLoai());
            ps.setInt(4, t.getIdTheLoai());            
            if(ps.executeUpdate() > 0){ 
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }

    @Override
    public boolean delete(TheLoai t) {
        Connection conn = myConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "delete from "+TABLE_NAME+" where id = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, t.getIdTheLoai());
            if(ps.executeUpdate() > 0){ 
             return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        TheLoaiDao dao = new TheLoaiDao();
        System.out.println(dao.get(1));
    }
    
}
