/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
public class HinhTru extends HinhTron{
    public float chieucao;
    
    public HinhTru(){
        ten = "Hinh tru";
    }
    
    public void nhapChieuCao(){
        chieucao = nhap.nextFloat();
    }
    public void tinhTheTich(){
        theTich = chieucao*dienTich;
    }
}
