package Controllers;

import Models.HocVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVienController {
    public void InfoHocVien(){
        Scanner scanner = new Scanner(System.in);
        String maHV, tenHV, lop, soHocVien, diemJava, diemOracle, diemProject ;
        int dem = 1;
        HocVien hocVien;
        List<HocVien> list = new ArrayList<>();
        System.out.print("Nhập số lượng học viên: ");
        soHocVien = scanner.nextLine();

        while (dem <=  Integer.parseInt(soHocVien)){

            System.out.print("Nhap MaHV: ");
            maHV = scanner.nextLine();

            System.out.print("Nhap TenHV: ");
            tenHV = scanner.nextLine();

            System.out.print("Nhap Lop: ");
            lop = scanner.nextLine();

            System.out.print("Nhap Diem Java: ");
            diemJava = scanner.nextLine();

            System.out.print("Nhap Diem Oracle: ");
            diemOracle = scanner.nextLine();

            System.out.print("Nhap Diem Project: ");
            diemProject = scanner.nextLine();

            hocVien = new HocVien(maHV, tenHV, lop, Double.parseDouble(diemJava), Double.parseDouble(diemOracle), Double.parseDouble(diemProject));
            list.add(hocVien);
            dem ++;
            if(dem < Integer.parseInt(soHocVien)){
                System.out.println("---------- Tiếp tục ----------");
            }else{
                System.out.println("---------- Hết ----------");
            }

        }
        printAllHocVienInfo(list);
        double DTBMax_HocVien =  DTBMaxHocVien(list);
        System.out.println("Điểm trung bình lớn nhất là : " + DTBMax_HocVien);

    }
    public void printAllHocVienInfo(List<HocVien> list) {
        if(list.isEmpty()){
            System.out.println("Không có thông tin học viên nào.");
        } else {
            for (HocVien hocVien : list) {
                hocVien.infoHocVien();
                double DTB_HocVien =  DTBHocVien(hocVien.getDiemJava(), hocVien.getDiemOracle(), hocVien.getDiemProject());
                System.out.println("Điểm trung bình là : " + DTB_HocVien);
                System.out.println("---------- =_= ----------");
            }
        }
    }

    // Tính điểm trung bình
    private double DTBHocVien(double diemJava, double diemOracle, double diemProject){
        double DTB = (diemJava + diemOracle + diemProject) / 3.0;
        return DTB;
    }

    // DTB cao nhất(của 3 học viên)
    public double DTBMaxHocVien(List<HocVien> list) {
        double maxDTB = 0;
        for (HocVien hocVien : list) {
            double DTB_HocVien =  DTBHocVien(hocVien.getDiemJava(), hocVien.getDiemOracle(), hocVien.getDiemProject());
            if (DTB_HocVien > maxDTB) {
                maxDTB = DTB_HocVien;
            }
        }
        return maxDTB;
    }

}