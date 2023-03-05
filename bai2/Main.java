/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron moi = new HinhTron();
        moi.xuatTen();
        moi.nhapBankinh();
        moi.tinhChuvi();
        moi.inChuVi();
        moi.tinhDientich();
        moi.inDienTich();
        
        HinhVuong moi1 = new HinhVuong();
        moi1.xuatTen();
        moi1.nhapChieuDai();
        moi1.nhapChieuRong();
        moi1.tinhChuVi();
        moi1.inChuVi();
        moi1.tinhDienTich();
        moi1.inDienTich();
    }
    
}
