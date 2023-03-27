package Controllers;

import Models.HocSinh;
import Models.HocSinhChuyenToan;
import Models.SinhVien;
import Models.SinhVienCNTT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienController {
    public void inFoSinhVien(){


        Scanner scanner = new Scanner(System.in);
        SinhVienCNTT sinhVien = new SinhVienCNTT();

        List<SinhVien> listSinhVien = new ArrayList<>();
        String maSv, tenSv, diemToan, diemTin, soSinhVien;
        int dem = 1;

        System.out.print("Nhập số lượng sinh viên: ");
        soSinhVien = scanner.nextLine();

        while (dem <=  Integer.parseInt(soSinhVien)){
            System.out.print("Nhap maSv: ");
            maSv = scanner.nextLine();

            System.out.print("Nhap tenSv: ");
            tenSv = scanner.nextLine();

            System.out.print("Nhap diem Toan: ");
            diemToan = scanner.nextLine();

            System.out.print("Nhap diem tin: ");
            diemTin = scanner.nextLine();


            sinhVien.setSV(maSv, tenSv, Double.parseDouble(diemToan), Double.parseDouble(diemTin));
            listSinhVien.add(sinhVien);
            dem ++;
            if(dem < Integer.parseInt(soSinhVien)){
                System.out.println("---------- Tiếp tục ----------");
            }else{
                System.out.println("---------- Hết ----------");
            }
        }
        sinhVien.viewSV();
        System.out.println("Tổng điểm: " + sinhVien.tongdiem());
    }
}
