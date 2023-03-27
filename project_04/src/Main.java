import Controllers.HocSinhController;
import Controllers.QuanLyDanSoController;
import Controllers.SinhVienController;

public class Main {
    public static void main(String[] args) {
        //Bai 1
        HocSinhController hocSinhController = new HocSinhController();
        hocSinhController.setInfoHocSinh();
        //Bai 2
        SinhVienController sinhVienController = new SinhVienController();
        sinhVienController.inFoSinhVien();
        //Bai 3
        QuanLyDanSoController quanLyDanSoController = new QuanLyDanSoController();
        quanLyDanSoController.inFoQuanLyDanSo();
    }
}