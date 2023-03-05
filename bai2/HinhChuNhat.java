/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }
    
    public void nhapChieuDai(){
        System.out.println("");
        System.out.print("Nhap dai: ");
        dai = nhap.nextFloat();
    }
    
     public void nhapChieuRong(){
        System.out.print("Nhap rong: ");
        rong = nhap.nextFloat();
    }
     
     public void tinhChuVi(){
         chuVi= (dai+rong)*2;
    }
     
      public void tinhDienTich(){
         dienTich = dai*rong;
      }
}
