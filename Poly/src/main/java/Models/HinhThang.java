/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ADMIN
 */
public class HinhThang extends Polygon {

    public int a;
    public int b;
    public int h;
    public int c1;
    public int c2;

    public HinhThang(int a, int b, int h, int c1, int c2) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.c1 = c1;
        this.c2 = c2;
        this.Name = "Hình Thang";
    }

    public HinhThang(String Name) {
        super(Name);
    }

    public HinhThang() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    public void tinhDT() {
        double dienTich = ((double) (a + a) * h) / 2;
        System.out.println("Diện tích hình thang: " + dienTich);
    }

    public void tinhCV() {
        int chuVi = a + b + c1 + c2;
        System.out.println("Chu vi hình thang: " + chuVi);
    }

    public static void main(String[] args) {
        HinhThang ht = new HinhThang(10, 6, 5, 5, 5);

        System.out.println("Hình: " + ht.getName());
        ht.tinhDT();
        ht.tinhCV();
    }
}
