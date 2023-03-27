package Models;

public abstract class HocSinh {
    private String hoten;
    private String lop;
    private double diemToan;
    private double diemLy;
    private double diemHoa;


    //Get and Set
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
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

    public HocSinh(String hoten, String lop, double diemToan, double diemLy, double diemHoa) {
        this.hoten = hoten;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void getInfoHocSinh() {
        System.out.println("hoten: " + hoten);
        System.out.println("lop: " + lop);
        System.out.println("diem Toan: " + diemToan);
        System.out.println("diem Ly: " + diemLy);
        System.out.println("diem Hoa: " + diemHoa);
    }

    public double dtbHocSinh(){
        double DTB = (getDiemToan() + getDiemLy() + getDiemHoa()) / 3.0;
        return DTB;
    }

    public abstract double myDtbHocSinh();
}
