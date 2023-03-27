package Models;

public class SinhVienCNTT extends SinhVien {
    private double diemToan;
    private double diemTin;

    public void setSV(String maSv, String tenSv, double diemToan, double diemTin) {
        super.setSV(maSv, tenSv);
        this.diemToan = diemToan;
        this.diemTin = diemTin;
    }
    public void viewSV() {
        super.viewSV();
        System.out.println("diemToan: " + diemToan);
        System.out.println("diemTin: " + diemTin);
    }
    public double tongdiem(){
        return diemTin + diemToan;
    }
}
