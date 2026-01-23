/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Polygon {
    
    public String Name;
    
    public static int tongSo = 0;
    
    public static void inThongTin(int infor){
        System.out.println(infor);
    }

    public Polygon(String Name) {
        this.Name = Name;
        this.tongSo = this.tongSo + 1;
    }

    public Polygon() {
        this.tongSo = this.tongSo + 1;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void tinhCV(){
        System.out.println("Tính chu vi hình " + this.Name);
    }
    public void tinhDT(){
        System.out.println("Tính diện tích hình " + this.Name);
    }    
}
