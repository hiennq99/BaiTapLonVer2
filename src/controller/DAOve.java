/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ThongKe;
import Dao.Users;
import Dao.Ve;
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
public class DAOve extends DAO {

    public DAOve() {
        super();
    }
    private String table = "VE";

    
    public boolean addItem(Ve item) {
        String sql = "INSERT INTO " + table + "(IDve,IDuser,MaTour,TenVe) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getIDve());
            ps.setString(2, item.getIDuser());
            ps.setString(3, item.getMaTour());
            ps.setString(4, item.getTenVe());

            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DAOve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
}
