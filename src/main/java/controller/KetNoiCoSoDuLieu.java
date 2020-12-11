/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
/**
 *
 * @author ANHBANG PC's
 */
public class KetNoiCoSoDuLieu {
    
      
      public static final String tenMayChu ="localhost";
      public static final String tenCoSoDuLieu ="dbquanlycoffee";
      public static final String tenNguoiDung ="root";
      public  static final String matKhau ="123456";
      
      // Cấu trúc liên kết kết nối:    jdbc:mysql://localhost:3306/dbquanlycoffee?zeroDateTimeBehavior=CONVERT_TO_NULL     
      public static final String duongDanKetNoi = "jdbc:mysql://"+tenMayChu+":3306/"+tenCoSoDuLieu;
      
      @SuppressWarnings("FieldMayBeFinal")
      private static  KetNoiCoSoDuLieu instance = new KetNoiCoSoDuLieu();
       private KetNoiCoSoDuLieu() {
       }

    public static KetNoiCoSoDuLieu getInstance() {
        return instance;
    }

    
      public Connection getKetNoi(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbquanlycoffee?"+unicode, "root", "123456");
        }catch(ClassNotFoundException | SQLException ex){
        System.out.println(ex.getMessage());
        System.out.println("Khong the ket noi!");
        throw new RuntimeException(ex);
        }
}
    
    
      

        
        
        
     
      
      
}







/*
        public Connection getKetNoi() throws ClassNotFoundException, SQLException {
              Connection ketNoi = null;
        Statement thucThi = null;
           try {
            Class.forName("com.mysql.jdbc.Driver");
        
        
        System.out.println("\nKet noi den co so du lieu da chon ...");
        
        // Đối tượng gọi kết nối cơ sơ dữ liệu
        ketNoi = DriverManager.getConnection(duongDanKetNoi,tenNguoiDung,matKhau);
         
        System.out.println("\nKet noi thanh cong !");
      
     
        System.out.println("\nTao bang trong co so du lieu da chon ...");
        // Đối tượng gọi thực thi các câu lệnh truy vấn dữ liệu
         thucThi = ketNoi.createStatement();
        
        String sqlBangNhanVien = "CREATE TABLE nhanvien " +
                                                "(maNV INTEGER NOT NULL, " +
                                                "hoTenNV VARCHAR(50), " +
                                                "ngaySinh DATE, " + 
                                                "gioiTinh VARCHAR(50), " +
                                                "diaChi VARCHAR(255), " + 
                                                "maBP INTEGER, " +
                                                "PRIMARY KEY  ( maNV ), "+
                                                "CONSTRAINT fk_bophan "+
                                                "FOREIGN KEY (maBP) REFERENCES bophan(maBP) )";
         
         
                                               
                                              
   
        String sqlBangBoPhan = "CREATE TABLE bophan" +
                                               "(maBP INTEGER NOT NULL, " +
                                                "tenBP VARCHAR(50), " +
                                                "PRIMARY KEY  ( maBP ))";      
        
        
      thucThi.executeUpdate(sqlBangBoPhan);
     thucThi.executeUpdate(sqlBangNhanVien);
     
        System.out.println("\nDa tao bang thanh cong !");
      
        
        
      
       
       } catch (SQLException sqle) {
               sqle.printStackTrace();
        }catch(Exception ex){
                  ex.printStackTrace();
        }finally{
                try{
                        if(thucThi!=null){
                              ketNoi.close();
                        }   
                     }catch(SQLException se){                         
                     }
                 try{
                        if(ketNoi!=null)
                              ketNoi.close();
                     }catch(SQLException se){
                            se.printStackTrace();
                     }
        }
        
                return ketNoi;
       }



*/