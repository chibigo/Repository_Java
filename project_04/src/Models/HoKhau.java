package Models;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
    String diaChiHienNay;
    String noiCongTac;

    public void nhapThongTin() {
        super.nhapThongTin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Địa chỉ hiện nay: ");
        diaChiHienNay = scanner.nextLine();
        System.out.print("Nơi công tác: ");
        noiCongTac = scanner.nextLine();
    }

    public void inThongTin() {
        super.inThongTin();

        System.out.println("Địa chỉ hiện nay: " + diaChiHienNay);
        System.out.println("Nơi công tác: " + noiCongTac);
    }
}
