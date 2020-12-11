/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ANHBANG PC's
 */
public class DinhDangNgayThangNam {
        public static Date nhapNgay(String date){
        Date ngayS;
        SimpleDateFormat ngay = new SimpleDateFormat("dd-MM-yyyy");
        while(true){
                try {
                    ngayS = ngay.parse(date);
                } catch (ParseException ex) {
                    System.err.println(ex.getMessage());
                    System.out.println("Nhap lai");
                    continue;
                }
                return ngayS;
            }
    }
}
