/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ANHBANG PC's
 */
public abstract class BoPhan implements NhapXuat{
    private int maBP;
    private String tenBP;
    private  List<NhanVien> nhanVien;
    public BoPhan(){
    }
    
    public BoPhan(int mabp, String tenbp, List<NhanVien> nv ){
        this.maBP = mabp;
        this.tenBP = tenbp;
        this.nhanVien = nv;
    }
    
    //----------------Phương thức getter - setter -----------------------

    //        *Mã bộ phận*
    public int getMaBoPhan(){
        return maBP;
    }
    
    public void setMaBoPhan(int maBP){
        this.maBP = maBP;
    }
    
      //        *Tên bộ phận*
    public String getTenBoPhan(){
        return tenBP;
    }
    
    public void setTenBoPhan(String tenBP){
        this.tenBP = tenBP;
    }
    
    
    @Override
    public String toString(){
        return String.format("%d,%s", this.getMaBoPhan(),this.getTenBoPhan());
    }
 
       @Override
    public abstract void hienThiThongTin();
    @Override
    public abstract void nhapThongTin(Scanner sc);

    /**
     * @return the nhanVien
     */
    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    /**
     * @param nhanVien the nhanVien to set
     */
    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }

   
 
}
