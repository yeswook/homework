/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class classCha extends classOngNoi {
    public String Mobile;

    public classCha() {
        super();
        System.out.println("Constructor ông Già");
    }

    public classCha(String Mobile) {
        super();
        this.Mobile = Mobile;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
}
