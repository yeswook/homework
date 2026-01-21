/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class HinhChuNhat extends TuGiac {

    public int dai, rong;

    public HinhChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
        this.Name = "Hình Chữ Nhật";
    }

    public HinhChuNhat() {
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void tinhDT() {
        System.out.println("Diện tích HCN:" + this.dai * this.rong);
    }

    @Override
    public void tinhCV() {
        System.out.println("Chu vi HCN:" + (this.dai + this.rong) * 2);
    }

}
