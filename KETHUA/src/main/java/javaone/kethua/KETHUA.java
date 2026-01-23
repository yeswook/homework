package javaone.kethua;

import Models.classCha;
import Models.classCon;
import Models.classOngCo;
import Models.classOngNoi;

import java.util.Scanner;

/**
 * Menu đơn giản cho module KETHUA.
 *
 * 1 -> tạo classOngCo 2 -> tạo classOngNoi 3 -> tạo classCha 4 -> tạo classCon
 *
 * Sau khi tạo sẽ in tất cả thuộc tính ra màn hình.
 */
public class KETHUA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tổng thành viên: " + classOngCo.TongThanhVien);
        classOngCo ongCo = null;
        classOngNoi ongNoi = null;
        classCha cha = null;
        classCon con = null;

        while (true) {
            System.out.println("\n==== MENU KETHUA ====");
            System.out.println("1. Tạo ông Cố (classOngCo)");
            System.out.println("2. Tạo ông Nội (classOngNoi)");
            System.out.println("3. Tạo cha (classCha)");
            System.out.println("4. Tạo con (classCon)");
            System.out.println("0. Thoát");
            System.out.print("Chọn (0-4): ");

            String line = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập 0-4.");
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    break;

                case 1:
                    System.out.print("Nhập CCCD: ");
                    String cccd = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    String namSinh = sc.nextLine();

                    ongCo = new classOngCo(cccd, hoTen, namSinh);
                    System.out.println("\nĐã tạo ông Cố:");
                    System.out.println(formatOngCo(ongCo));
                    break;

                case 2:
                    System.out.print("Nhập CCCD (ông nội): ");
                    String cccdOn = sc.nextLine();
                    System.out.print("Nhập họ tên (ông nội): ");
                    String hoTenOn = sc.nextLine();
                    System.out.print("Nhập năm sinh (ông nội): ");
                    String namSinhOn = sc.nextLine();
                    System.out.print("Nhập BankCard (ông nội): ");
                    String bankCard = sc.nextLine();

                    ongNoi = new classOngNoi(bankCard);
                    // set thông tin ông cố (thừa kế)
                    ongNoi.setCCCD(cccdOn);
                    ongNoi.setHoTen(hoTenOn);
                    ongNoi.setNamSinh(namSinhOn);

                    System.out.println("\nĐã tạo ông Nội:");
                    System.out.println(formatOngNoi(ongNoi));
                    break;

                case 3:
                    System.out.print("Nhập CCCD (cha): ");
                    String cccdCha = sc.nextLine();
                    System.out.print("Nhập họ tên (cha): ");
                    String hoTenCha = sc.nextLine();
                    System.out.print("Nhập năm sinh (cha): ");
                    String namSinhCha = sc.nextLine();
                    System.out.print("Nhập BankCard (cha): ");
                    String bankCardCha = sc.nextLine();
                    System.out.print("Nhập Mobile (cha): ");
                    String mobile = sc.nextLine();

                    cha = new classCha();
                    // set lớp ông cố / ông nội
                    cha.setCCCD(cccdCha);
                    cha.setHoTen(hoTenCha);
                    cha.setNamSinh(namSinhCha);
                    cha.setBankCard(bankCardCha);
                    cha.setMobile(mobile);

                    System.out.println("\nĐã tạo cha:");
                    System.out.println(formatCha(cha));
                    break;

                case 4:
                    System.out.print("Nhập CCCD (con): ");
                    String cccdCon = sc.nextLine();
                    System.out.print("Nhập họ tên (con): ");
                    String hoTenCon = sc.nextLine();
                    System.out.print("Nhập năm sinh (con): ");
                    String namSinhCon = sc.nextLine();
                    System.out.print("Nhập BankCard (con): ");
                    String bankCardCon = sc.nextLine();
                    System.out.print("Nhập Mobile (con): ");
                    String mobileCon = sc.nextLine();
                    System.out.print("Nhập MSSV (con): ");
                    String mssv = sc.nextLine();

                    con = new classCon();
                    con.setCCCD(cccdCon);
                    con.setHoTen(hoTenCon);
                    con.setNamSinh(namSinhCon);
                    con.setBankCard(bankCardCon);
                    con.setMobile(mobileCon);
                    con.setMSSV(mssv);

                    System.out.println("\nĐã tạo con:");
                    System.out.println(formatCon(con));
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 0-4.");
            }
            if(choice == 0)
                break;
        }
        System.out.println("Tổng thành viên: " + classOngCo.TongThanhVien);
    }

    private static String formatOngCo(classOngCo o) {
        if (o == null) {
            return "null";
        }
        return "CCCD: " + safe(o.getCCCD()) + "\n"
                + "Họ tên: " + safe(o.getHoTen()) + "\n"
                + "Năm sinh: " + safe(o.getNamSinh());
    }

    private static String formatOngNoi(classOngNoi o) {
        if (o == null) {
            return "null";
        }
        return formatOngCo(o) + "\n"
                + "BankCard: " + safe(o.getBankCard());
    }

    private static String formatCha(classCha c) {
        if (c == null) {
            return "null";
        }
        return formatOngNoi(c) + "\n"
                + "Mobile: " + safe(c.getMobile());
    }

    private static String formatCon(classCon c) {
        if (c == null) {
            return "null";
        }
        return formatCha(c) + "\n"
                + "MSSV: " + safe(c.getMSSV());
    }

    private static String safe(String s) {
        return s == null ? "(null)" : s;
    }
}
