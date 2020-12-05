/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ANHBANG PC's
 */
public class BoPhan {
    private int maBP;
    private String tenBP;
    
    public BoPhan(){
    }
    
    public BoPhan(int mabp, String tenbp ){
        this.maBP = mabp;
        this.tenBP = tenbp;
    
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
    
}
