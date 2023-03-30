package Controllers;

import Models.ThiSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThiSinhController {
    public  void thiSinh(){
        Scanner scanner = new Scanner(System.in);
        ThiSinh thiSinh;
        List<ThiSinh> danhSach = new ArrayList<>();

        int dem = 0;

        System.out.print("Nhập số lượng học sinh: ");
        int soHocSinh = scanner.nextInt();

        for (int i = 0; i < soHocSinh; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i+1) + ":");
            scanner.nextLine(); // bo qua ki tu enter o dong truoc
            System.out.print("Ten thi sinh: ");
            String ten = scanner.nextLine();
            System.out.print("Diem toan: ");
            double diemToan = scanner.nextDouble();
            System.out.print("Diem ly: ");
            double diemLy = scanner.nextDouble();
            System.out.print("Diem hoa: ");
            double diemHoa = scanner.nextDouble();
            thiSinh = new ThiSinh(ten, diemToan, diemLy, diemHoa);
            danhSach.add(thiSinh);
            if(dem < soHocSinh){
                System.out.println("---------- Tiếp tục ----------");
            }else{
                System.out.println("---------- Hết ----------");
            }
        }
        printAllThiSinh(danhSach);
        printThiSinhTT(danhSach);
        sapXepThiSinhTT(danhSach);
    }

    private void printAllThiSinh(List<ThiSinh> listTs) {
        if(listTs.isEmpty()){
            System.out.println("Không có thông tin thí sinh nào.");
        } else {
            System.out.println("---------- Danh sách ----------");
            for (ThiSinh thiSinh : listTs) {
                thiSinh.inThongTin();
                System.out.println("---------- =_= ----------");
            }
        }
    }
    private void printThiSinhTT(List<ThiSinh> listTs) {
        if(listTs.isEmpty()){
            System.out.println("Không có thông tin thí sinh nào.");
        } else {
            System.out.println("---------- Danh sách trúng tuyển ----------");
            for (ThiSinh thiSinh : listTs) {
                if(thiSinh.tinhTongDiem() >= 17){
                    thiSinh.inThongTin();
                }
                System.out.println("---------- =_= ----------");
            }
        }
    }

    private void sapXepThiSinhTT(List<ThiSinh> listTs) {
        if(listTs.isEmpty()){
            System.out.println("Không có thông tin thí sinh nào.");
        } else {
            Collections.sort(listTs, (a, b) -> Double.compare(b.tinhTongDiem(), a.tinhTongDiem()));
            System.out.println("---------- Danh sách trúng tuyển giảm dần ----------");
            for (ThiSinh thiSinh : listTs) {
                if(thiSinh.tinhTongDiem() >= 17){
                    thiSinh.inThongTin();
                }
                System.out.println("---------- =_= ----------");
            }
        }
    }
}
