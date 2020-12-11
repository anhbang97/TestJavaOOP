/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ANHBANG PC's
 */
public abstract class NhanVien implements NhapXuat{
   
    private int maNV;
    private String hoTenNV;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private BoPhan nvCuaBP;
    public NhanVien(){
    }
   
    public NhanVien(int manv, String hotennv, Date ngaysinh, String gioitinh, String diachi , BoPhan nvcuabp ){
            this.maNV = manv;
            this.hoTenNV = hotennv;
            this.ngaySinh = ngaysinh; 
            this.gioiTinh = gioitinh;
            this.diaChi = diachi;
            this.nvCuaBP = nvcuabp;
    }
    
    
//----------------Phương thức getter - setter -----------------------

//        *Mã nhân viên*
    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
    //     *Họ tên nhân viên*
    public String getHoTenNV(){
         return hoTenNV;
    }
    
    public void setHoTenNV(String hoTenNV){
        this.hoTenNV = hoTenNV;
    }
    
    //     *Ngày tháng năm sinh*
    public Date getNgaySinh(){
        return  ngaySinh;
    }
    
    
    public void setNgaySinh(Date ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    
    //     *Giới tính*
    public String getGioiTinh(){
        return gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh; 
    }
    
    //  *Đia chỉ *
    public String getDiaChi(){
        return diaChi;
    }
    
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
     //  *Khóa ngoại: Nhân viên thuộc bộ phận *
    
    public BoPhan getNhanVienCuaBP(){
        return nvCuaBP;
    }
    
    public void setNhanVienCuaBP(BoPhan nvCuaBP){
        this.nvCuaBP = nvCuaBP;
    }
    
    
    // ----------------------------------------------------------
   
 
   
    @Override
    public void nhapThongTin(Scanner sc){
        
        
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("============");
            System.out.println("Ma nhan vien: ");
            this.setMaNV(sc.nextInt());
            System.out.println("Ho ten nhan vien: ");
            sc.nextLine();
            this.setHoTenNV(sc.nextLine());
            System.out.println("Ngay sinh: ");
            try {
                this.setNgaySinh(sdf.parse(sc.nextLine()));
            } catch (ParseException ex) {
                Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Gioi Tinh: ");
            this.setGioiTinh(sc.nextLine());
            System.out.println("Dia chi: ");
            this.setDiaChi(sc.nextLine());
            
    }
   
    public void hienThiThongTin(Scanner sc) throws ParseException {
            System.out.println("Ma nhan vien:" + this.getMaNV());
            System.out.println("Ho ten nhan vien: " + this.getHoTenNV());
            System.out.println("Ngay sinh: " + this.getNgaySinh());
            System.out.println("Gioi Tinh: " + this.getGioiTinh());
            System.out.println("Dia chi: "+this.getDiaChi());
            System.out.println("Bo phan: " +this.nvCuaBP);
    }
    
    
}
