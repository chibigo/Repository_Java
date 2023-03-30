package Models;

public class ThiSinh {
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public ThiSinh(String ten, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void inThongTin() {
        System.out.println("Ten thi sinh: " + ten);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem ly: " + diemLy);
        System.out.println("Diem hoa: " + diemHoa);
        System.out.println("Tong diem: " + tinhTongDiem());
    }
    public double tinhTongDiem() {
        return diemToan + diemLy + diemHoa;
    }
}
