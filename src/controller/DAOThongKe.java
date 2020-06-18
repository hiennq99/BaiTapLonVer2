/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ThongKe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class DAOThongKe extends DAO{
    public DAOThongKe()
    {
        super();
    }
    public ArrayList<ThongKe> getListVe() {
        ArrayList<ThongKe> items = new ArrayList<>();
        String sql = "select * from ThongKe ";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe v = new ThongKe();
                v.setMaTour(rs.getString("MaTour"));
                v.setIDUSER(rs.getString("IDUSER"));
                v.setNgayKH(rs.getString("NgayKH"));
                v.setThoiLuong(rs.getString("THOILUONG"));
                v.setGia(rs.getString("GIA"));
                v.setSoNguoi(rs.getString("SONGUOI"));
                v.setKhuyenmai(rs.getString("GIATRIKM"));
                items.add(v);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    public ArrayList<ThongKe> getList(String field) {
        ArrayList<ThongKe> items = new ArrayList<>();
        String sql = "select * from ThongKe where MATOUR = '" + field+"'";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe v = new ThongKe();
                v.setMaTour(rs.getString("MaTour"));
                v.setIDUSER(rs.getString("IDUSER"));
                v.setNgayKH(rs.getString("NgayKH"));
                v.setThoiLuong(rs.getString("THOILUONG"));
                v.setGia(rs.getString("GIA"));
                v.setSoNguoi(rs.getString("SONGUOI"));
                v.setKhuyenmai(rs.getString("GIATRIKM"));
                items.add(v);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
}
