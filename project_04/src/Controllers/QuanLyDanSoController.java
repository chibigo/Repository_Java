package Controllers;

import Models.HoKhau;
import Models.NhanKhau;

public class QuanLyDanSoController {
    public void inFoQuanLyDanSo(){
        System.out.println("---------- =Nhan Khau= ----------");
        NhanKhau nhanKhau = new NhanKhau();
        nhanKhau.nhapThongTin();
        nhanKhau.inThongTin();
        
        System.out.println("---------- =Ho Khau= ----------");
        HoKhau hoKhau = new HoKhau();
        hoKhau.nhapThongTin();
        hoKhau.nhapThongTin();

    }
}
