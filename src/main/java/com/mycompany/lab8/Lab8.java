/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author dang
 */
import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================== BÀI 1 ==================
        System.out.println("=== LAB 8 - BÀI 1 ===");
        System.out.print("Nhập họ tên sinh viên: ");
        String name = sc.nextLine();

        String trimmedName = name.trim();
        String upperName = trimmedName.toUpperCase();
        int length = trimmedName.length();

        System.out.println("Họ tên sau khi xử lý: " + upperName);
        System.out.println("Số ký tự: " + length);

        // ================== BÀI 2 ==================
        System.out.println("\n=== LAB 8 - BÀI 2 ===");

        String id, fullName, phone, email;

        while (true) {
            System.out.print("Nhập mã SV (TVxxx): ");
            id = sc.nextLine();
            if (id.matches("^TV\\d{3}$")) {
                break;
            }
            System.out.println("❌ Mã SV không hợp lệ!");
        }

        while (true) {
            System.out.print("Nhập họ tên: ");
            fullName = sc.nextLine();
            if (fullName.matches("^[a-zA-Z\\s]+$")) {
                break;
            }
            System.out.println("❌ Họ tên không hợp lệ!");
        }

        while (true) {
            System.out.print("Nhập số điện thoại: ");
            phone = sc.nextLine();
            if (phone.matches("^0\\d{9}$")) {
                break;
            }
            System.out.println("❌ Số điện thoại không hợp lệ!");
        }

        while (true) {
            System.out.print("Nhập email: ");
            email = sc.nextLine();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                break;
            }
            System.out.println("❌ Email không hợp lệ!");
        }

        System.out.println("\nThông tin sinh viên hợp lệ:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);

        // ================== BÀI 3 ==================
        System.out.println("\n=== LAB 8 - BÀI 3 ===");

        int age = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Nhập tuổi: ");
            try {
                String inputAge = sc.nextLine();
                age = Integer.parseInt(inputAge);
                
                if (age > 0 && age < 120) {
                    valid = true;
                } else {
                    System.out.println("❌ Tuổi phải > 0 và < 120");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Tuổi phải là số nguyên!");
            }
        }
        
        System.out.println("Tuổi đã nhập: " + age);
        sc.close();
    }
}
