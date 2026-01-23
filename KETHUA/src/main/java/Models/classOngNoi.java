/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

public class classOngNoi extends classOngCo {
    public String BankCard;

    public classOngNoi() {
        super();
        System.out.println("Constructor ông Nội");
    }

    public classOngNoi(String BankCard) {
        super();
        this.BankCard = BankCard;
    }

    public String getBankCard() {
        return BankCard;
    }

    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }
    
}
