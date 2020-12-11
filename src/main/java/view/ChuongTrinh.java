/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.KetNoiCoSoDuLieu;
import controller.QuanLyBoPhan;
import controller.QuanLyNhanVien;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import model.BoPhan;
import model.NhanVien;



/**
 *
 * @author ANHBANG PC's
 */
public class ChuongTrinh {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
    
         Connection ketnoi = KetNoiCoSoDuLieu.getInstance().getKetNoi();
         Scanner sn = new Scanner(System.in);
         quanLyNhanVien(sn, ketnoi);
         quanLyBoPhan(sn, ketnoi);
      
    }

    
    public static void quanLyNhanVien(Scanner sn, Connection ketNoi) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
         NhanVien nv = new NhanVien() {
            @Override
            public void hienThiThongTin() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
         
         nv.nhapThongTin(sn);
         qlnv.themThongTin(nv,ketNoi);
         
    }
    
    
    
    public static void quanLyBoPhan(Scanner sn, Connection ketNoi){
            QuanLyBoPhan qlbp = new QuanLyBoPhan();
            BoPhan bp = new BoPhan() {
                @Override
                public void hienThiThongTin() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void nhapThongTin(Scanner sc) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            
            bp.nhapThongTin(sn);
            qlbp.themThongTin(bp, ketNoi);
    }
    
    
    

}