/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.poly;

import Models.HinhChuNhat;
import Models.HinhTron;
import Models.Polygon;

/**
 *
 * @author Dell
 */
public class Poly {

    public static void main(String[] args) {
        Polygon.inThongTin(Polygon.tongSo);
        Polygon polygon = new Polygon("Lớp Hình");
        Polygon.inThongTin(Polygon.tongSo);
//        System.out.println(polygon.Name);
//        polygon.tinhCV();
//        polygon.tinhDT();
        System.out.println("=======");
        HinhTron ht = new HinhTron(5, "Hình tròn");
        Polygon.inThongTin(Polygon.tongSo);
//        System.out.println(ht.Name);
//        ht.tinhCV();
//        ht.tinhDT();
        System.out.println("=======");
        HinhChuNhat hcn = new HinhChuNhat(7, 9);
        hcn.tinhCV();
        hcn.tinhDT();
        HinhChuNhat.tinhDienTich(hcn.dai, hcn.rong);
        
    }
}
