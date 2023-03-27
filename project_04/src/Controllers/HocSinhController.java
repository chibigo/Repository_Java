package Controllers;

import Models.HocSinh;
import Models.HocSinhChuyenToan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinhController {
    public void setInfoHocSinh(){
        Scanner scanner = new Scanner(System.in);
        HocSinh hocSinh;

        List<HocSinh> list = new ArrayList<>();
        String hoten, lop, soHocSinh, diemToan, diemLy, diemHoa ;
        int dem = 1;

        System.out.print("Nhập số lượng học sinh: ");
        soHocSinh = scanner.nextLine();

        while (dem <=  Integer.parseInt(soHocSinh)){
            System.out.print("Nhap hoten: ");
            hoten = scanner.nextLine();

            System.out.print("Nhap Lop: ");
            lop = scanner.nextLine();

            System.out.print("Nhap Diem Toan: ");
            diemToan = scanner.nextLine();

            System.out.print("Nhap Diem Ly: ");
            diemLy = scanner.nextLine();

            System.out.print("Nhap Diem Hoa: ");
            diemHoa = scanner.nextLine();

            hocSinh = new HocSinhChuyenToan(hoten, lop, Double.parseDouble(diemToan), Double.parseDouble(diemLy), Double.parseDouble(diemHoa));
            list.add(hocSinh);
            dem ++;
            if(dem < Integer.parseInt(soHocSinh)){
                System.out.println("---------- Tiếp tục ----------");
            }else{
                System.out.println("---------- Hết ----------");
            }
        }
        printAllHocSinhInfo(list);
    }
    private void printAllHocSinhInfo(List<HocSinh> listHs) {
        if(listHs.isEmpty()){
            System.out.println("Không có thông tin học sinh nào.");
        } else {
            for (HocSinh hocSinh : listHs) {
                hocSinh.getInfoHocSinh();
                double dtbHocVien =  hocSinh.dtbHocSinh();
                double myDtbHocVien =  hocSinh.myDtbHocSinh();
                System.out.println("Điểm trung bình chuyên toán là : " + dtbHocVien);
                System.out.println("Điểm trung bình là : " + myDtbHocVien);
                System.out.println("---------- =_= ----------");
            }
        }
    }

}
