package Models;

public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan(String hoTen, String lop, double diemToan, double diemLy, double diemHoa) {
        super(hoTen, lop, diemToan, diemLy, diemHoa);
    }

    @Override
    public double myDtbHocSinh() {
        double DTB = (getDiemToan() * 2 + getDiemLy() + getDiemHoa()) / 4.0;
        return DTB;
    }

}
