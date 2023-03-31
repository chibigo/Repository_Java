package Controllers;

import Models.TheCD;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheCDController {
    static ArrayList<TheCD> cdList = new ArrayList<>();
    public static void infoTheCD(){
        Scanner scanner = new Scanner(System.in);

        int chonSo;
        do {
            System.out.println("-----------------Thông tin TheCD--------------");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Xuất dữ liệu");
            System.out.println("3. Hiển thị bài hát có bài hát > 5");
            System.out.println("4. Tổng tiền của tất cả theCD");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-5): ");
            chonSo = scanner.nextInt();
            switch (chonSo) {
                case 1:
                    nhapDuLieu();
                    break;
                case 2:
                    xuatDuLieu(cdList);
                    break;
                case 3:
                    theCDMin5(cdList);
                    break;
                case 4:
                    sumTheCD(cdList);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!. Hãy chọn lại.");
                    break;
            }
        } while (chonSo != 5);
        scanner.close();
    }
    private static void nhapDuLieu(){
        Scanner scanner = new Scanner(System.in);
        int n, id;
        String name, date_create, price, number;
        System.out.print("Nhập số lượng TheCD: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin CD thứ " + (i + 1));
            try {
                System.out.print("Nhập ID: ");
                id = scanner.nextInt();
                System.out.print("Nhập tên CD: ");
                name = scanner.next();
                date_create = LocalDateTime.now().toString();
                System.out.print("Nhập giá mỗi bài hát: ");
                price = scanner.next();
                System.out.print("Nhập số lượng bài hát: ");
                number = scanner.next();
                TheCD cd = new TheCD(id, name, date_create, Float.parseFloat(price), Float.parseFloat(number));
                cdList.add(cd);
            }catch (java.util.InputMismatchException e){
                System.out.println("Lỗi: Bạn đã nhập sai kiểu dữ liệu!");
                System.exit(0);
            }
        }
        System.out.println("Hoàn thành nhập!");
    }
    private static void xuatDuLieu(List<TheCD> cdList){
        System.out.println("----------------- Danh sách TheCD --------------");
        for (TheCD thecd : cdList) {
            thecd.infoThongtin();
            System.out.println("-----------------=_=--------------");
        }
    }
    private static void theCDMin5(List<TheCD> cdList){
        System.out.println("-----------------TheCD có số lượng lớn hơn 5 bài hát--------------");
        for (TheCD thecd : cdList) {
            if(thecd.getNumber() > 5){
                thecd.infoThongtin();
                System.out.println("-----------------=_=--------------");
            }
        }
    }
    private static void sumTheCD(List<TheCD> cdList){
        System.out.println("-----------------Tổng tiền của danh sách TheCD --------------");
        float sum = 0;
        for (TheCD thecd : cdList) {
            sum += thecd.getPrice() * thecd.getNumber();
        }
        System.out.println("Sum: " + sum);
    }
}
