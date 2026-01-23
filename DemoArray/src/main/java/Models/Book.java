/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Book {
    public String ID;
    public String Name;
    public String Author;
    public int Year;

    public Book() {
    }

    public Book(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public Book(String ID) {
        this.ID = ID;
    }
    

    public Book(String ID, String Name, String Author, int Year) {
        this.ID = ID;
        this.Name = Name;
        this.Author = Author;
        this.Year = Year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void inThongTinSach(){
        System.out.println("================");
        System.out.println("MÃ SÁCH: " + this.ID);
        System.out.println("TÊN SÁCH: " + this.Name);
        System.out.println("TÁC GIẢ: " + this.Author);
        System.out.println("NĂM XUẤT BẢN: " + this.Year);
        System.out.println("================");
    }
            
}
