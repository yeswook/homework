/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class HinhThoi extends Polygon {

    public int canh;
    public int chieucao;

    public HinhThoi(int canh, int chieucao) {
        this.canh = canh;
        this.chieucao = chieucao;
        this.Name = "Hình Thoi";
    }

    public HinhThoi() {
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
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
        System.out.println("Diện tích Hinh Thoi:" + this.canh * this.chieucao);
    }

    @Override
    public void tinhCV() {
        System.out.println("Chu vi Hinh Thoi:" + this.canh * 4);
    }
}
