/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.BoPhan;
import model.NhanVien;

/**
 *
 * @author ANHBANG PC's
 */
public class QuanLyBoPhan implements GiaoDienQuanLy<BoPhan>{
    
    @Override
    public void themThongTin(BoPhan bp, Connection ketNoi) {
        String sqlBP = "INSERT INTO bophan (maBP, tenBP) VALUES ( ?, ?)";
        try(PreparedStatement ps = ketNoi.prepareStatement(sqlBP)) {
                ps.setInt(1, bp.getMaBoPhan());
                ps.setString(2, bp.getTenBoPhan());
                ps.execute();
        } catch (SQLException se) {
            System.err.println(se.getMessage());
        }
    }

   
}
