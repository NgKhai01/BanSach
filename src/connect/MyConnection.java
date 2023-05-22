/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class MyConnection {
    String hostName = "localhost";
    String dbName = "ql_banhang";
    String userName = "root";
    String password = "";
    String url = "jdbc:mysql://" + hostName + ":3306/" +dbName;
    Connection conn = null;
    private static final MyConnection instance  = new MyConnection();

    public MyConnection() {
    }
    public static MyConnection getInstance(){
        return instance;
    }
    public Connection getConnection(){
        if(conn == null)
            return open();
        return conn;
    }
    private Connection open(){ 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        Connection conn = MyConnection.getInstance().getConnection();
          if (conn != null) {
              System.out.println("thanh cong");
          } else {
              System.out.println("ko thanh cong");
          }
    }
}
