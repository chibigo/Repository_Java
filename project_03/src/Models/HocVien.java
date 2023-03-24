package Models;

public class HocVien {
    private String maHV;
    private String tenHV;
    private String lop;
    private double diemJava;
    private double diemOracle;
    private double diemProject;

    //Get and Set
    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemOracle() {
        return diemOracle;
    }

    public void setDiemOracle(double diemOracle) {
        this.diemOracle = diemOracle;
    }

    public double getDiemProject() {
        return diemProject;
    }

    public void setDiemProject(double diemProject) {
        this.diemProject = diemProject;
    }

    // Controller

    public HocVien(String maHV, String tenHV, String lop, double diemJava, double diemOracle, double diemProject) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.lop = lop;
        this.diemJava = diemJava;
        this.diemOracle = diemOracle;
        this.diemProject = diemProject;
    }

    public void infoHocVien() {
        System.out.println("MaHV: " + maHV);
        System.out.println("TenHV: " + tenHV);
        System.out.println("Lop: " + lop);
        System.out.println("Diem Java: " + diemJava);
        System.out.println("Diem Oracle: " + diemOracle);
        System.out.println("Diem Project: " + diemProject);
    }
}
