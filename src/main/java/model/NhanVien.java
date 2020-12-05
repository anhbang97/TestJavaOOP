/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;



/**
 *
 * @author ANHBANG PC's
 */
public class NhanVien {
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
    
    
    
    
    
}
