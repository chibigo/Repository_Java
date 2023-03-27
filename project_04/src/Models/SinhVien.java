package Models;

import java.util.Scanner;

public class SinhVien {
    private String maSv;
    private String tenSv;

    //Set and Get

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    //Contractor
    public void setSV(String maSv, String tenSv) {
        this.maSv = maSv;
        this.tenSv = tenSv;
    }
    public void viewSV() {
        System.out.println("maSv: " + maSv);
        System.out.println("tenSv: " + tenSv);
    }
}
