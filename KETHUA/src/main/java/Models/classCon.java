/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class classCon extends classCha {
    public String MSSV;

    public classCon() {
        super();
        System.out.println("Constructor Thằng Con");
    }

    public classCon(String MSSV) {
        super();
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    
}
