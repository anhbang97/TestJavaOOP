/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import model.NhanVien;


/**
 *
 * @author ANHBANG PC's
 */
public class QuanLyNhanVien  implements GiaoDienQuanLy<NhanVien> {
 
 
  @Override
    public void themThongTin(NhanVien nv, Connection ketNoi) {
        java.util.Date utilStartDate = nv.getNgaySinh(); 
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        
        String sqlNV = "INSERT INTO nhanvien (maNV, hoTenNV, ngaySinh,gioiTinh,diaChi,maBP) VALUES ( ?, ?, ?, ?,?,?)";
        try(PreparedStatement ps = ketNoi.prepareStatement(sqlNV)) {
                ps.setInt(1, nv.getMaNV());
                ps.setString(2, nv.getHoTenNV());
                ps.setDate(3, sqlStartDate);
                ps.setString(4, nv.getGioiTinh());
                ps.setString(5, nv.getDiaChi());
                ps.setInt(6, nv.getNhanVienCuaBP().getMaBoPhan());
                ps.execute();
        } catch (SQLException se) {
            System.err.println(se.getMessage());
        }
    }
            
}
