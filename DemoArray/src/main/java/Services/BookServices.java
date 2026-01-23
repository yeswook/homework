/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BookServices {

    public static ArrayList<Book> ds_book = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public BookServices() {
        ds_book = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public static void Nhap() {
        Book book = new Book();
        System.out.print("Vui lòng nhập ID: ");
        book.ID = scan.nextLine();
        System.out.print("Vui lòng nhập Name: ");
        book.Name = scan.nextLine();
        System.out.print("Vui lòng nhập Author: ");
        book.Author = scan.nextLine();
        System.out.print("Vui lòng nhập Year: ");
        book.Year = Integer.parseInt(scan.nextLine());
        BookServices.ds_book.add(book);
    }
    public static void Xuat(){
        for(Book book : BookServices.ds_book )
            book.inThongTinSach();
    }
    public static void Tim(String ID){
        System.out.println("Chức năng tìm đang phát triển");
    }
    public static void Xoa(String ID){
        System.out.println("Xoá thông tin sách");
    }    
}
