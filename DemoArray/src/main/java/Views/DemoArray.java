package Views;

import Services.BookServices;
import java.util.Scanner;

public class DemoArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("1. Nhập sách và xuất");
            System.out.println("2. Xuất sách");
            System.out.println("3. Tìm sách");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            option = sc.nextInt();
            switch (option) {
                case 1 -> BookServices.Nhap();
                case 2 -> BookServices.Xuat();
                case 3 -> BookServices.Tim("");                    
                case 0 -> {
                    System.out.println("Thoát chương trình!");
                }
                default -> System.out.println("Vui lòng nhập lại (0 - 3).");
            }
        }
    }
}
