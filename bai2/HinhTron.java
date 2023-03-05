/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
public class HinhTron extends HinhHoc{
    private float bkinh;
    
    public HinhTron(){     
        ten = "Hinh tron";
    }
    
    public void nhapBankinh(){
        System.out.println("");
        System.out.print("Nhap ban kinh: ");
        bkinh = nhap.nextFloat();
    }
    
    public void tinhChuvi(){
        chuVi= 2 * Pi * bkinh;
    }
    
    public void tinhDientich(){
        dienTich= bkinh * bkinh * Pi;
    }
}
