package Models;

import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Giới tính: ");
        gioiTinh = scanner.nextLine();
    }

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
}
