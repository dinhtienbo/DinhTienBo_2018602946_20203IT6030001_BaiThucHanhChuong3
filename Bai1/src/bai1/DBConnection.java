/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import com.mysql.cj.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dinht
 */
public class DBConnection {
    static String url = "jdbc:mysql://localhost:3306/ba1";
    static String user = "root";
    static String password = "123456789";
    static Connection con = null;

    static java.sql.Statement state = null;
    static ResultSet rs = null;

    public static Connection getJDBConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    
    public static List<sanpham> getListSanPham() {
        List<sanpham> list = new ArrayList<>();
        con = getJDBConnection();
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "Select * from sanpham";
            rs = state.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("MaSP");
                String tenSP = rs.getString("TenSP");
                String nhaSanXuat = rs.getString("NhaSanXuat");
                int maLoaiSP = rs.getInt("MaLoaiSP");
                
                sanpham sp = new sanpham(id,tenSP,nhaSanXuat,maLoaiSP);

                list.add(sp);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con.close();
            state.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    public static List<loaisanpham> getListLoaiSanPham() {
        List<loaisanpham> list = new ArrayList<>();
        con = getJDBConnection();
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "Select * from loaisanpham";
            rs = state.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("MaLoaiSP");
                String tenSP = rs.getString("TenLoaiSP");
                
                loaisanpham lsp = new loaisanpham(id,tenSP);

                list.add(lsp);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con.close();
            state.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

     public static void executeSQlL(String sql) {
        con = getJDBConnection();
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_SCROLL_SENSITIVE);
            state.executeUpdate(sql);
            System.out.println("SuccessFully!");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
            state.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
