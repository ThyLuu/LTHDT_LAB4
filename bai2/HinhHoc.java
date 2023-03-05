/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HinhHoc {
   public final float Pi=3.14f;
   public String ten;
   public float chuVi;
   public float dienTich;
   public float theTich;
   Scanner nhap = new Scanner(System.in);
    
    public HinhHoc(){
    }
    
    public void xuatTen(){
        System.out.print(ten);
    }
    
    public void inChuVi(){
        System.out.print("Chu vi: " +chuVi);
        System.out.println("");
    }
    
    public void inDienTich(){
        System.out.print("Dien tich: " +dienTich);
        System.out.println("");
    }
    
    public void inTheTich(){
        System.out.print("The tich: " +theTich);
        System.out.println("");
    }
}
