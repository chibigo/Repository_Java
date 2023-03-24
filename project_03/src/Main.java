import Controllers.HocVienController;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HocVienController hocVienController = new HocVienController();
        System.out.println("-----------=BT_1=-----------");
        tinntoan();
        System.out.println("-----------=BT_2=-----------");
        randomNuber();
        System.out.println("-----------=BT_3=-----------");
        DosSo();
        System.out.println("-----------=BT_4=-----------");
        hocVienController.InfoHocVien();
        System.out.println("-----------=BT_5=-----------");
        ChuNhat();
    }

    //BT_1
    private static void tinntoan(){
        Scanner scanner = new Scanner(System.in);

        int numberInt, count_one = 0, count_two = 0;
        System.out.print("Nhap N: ");
        numberInt = Integer.parseInt(scanner.nextLine());

        if(numberInt < 10 || numberInt > 100){
            System.out.println("Vượt quá giới hạn");
            return;
        }

        for (int i = 10; i <= numberInt; i++) {
            if(i % 3 == 0){
                count_one++;
            }
        }
        for (int i = 10; i <= numberInt; i++) {
            if(i % 5 == 0){
                count_two++;
            }
        }

        System.out.println("có " + count_one +" số chia hết cho 3");
        System.out.println("có " + count_two +" số chia hết cho 5");
    }
    //BT_2
    private static void randomNuber(){
        Scanner scanner = new Scanner(System.in);

        int min = 8;
        int max = 18;
        int randomNumber = getRandomNumber(min, max);
        System.out.println("Random number generated is: " + randomNumber);

        System.out.print("Enter a number to compare with the random number: ");
        int number = scanner.nextInt();

        if (number == randomNumber) {
            System.out.println("Correct !");
        } else if (number > randomNumber) {
            System.out.println("The entered number is greater than the random number.");
        } else {
            System.out.println("The entered number is less than the random number.");
        }
    }
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    //BT_3
    public static void DosSo() {
        String[] soDonvi = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number < 0 || number > 999){
            System.out.println("Invalid number !");
            return;
        }

        if(number < 10) {
            System.out.println(soDonvi[number]);
            return;
        }

        if(number < 100){
            int getHangChuc = number / 10;
            int getHangDonvi = number % 10;
            if (getHangChuc == 1) {
                if (getHangDonvi == 0) {
                    System.out.println("Mười");
                    return;
                }
                System.out.println("Mười " +soDonvi[getHangDonvi]);
                return;
            }
            if(getHangDonvi == 0){
                System.out.println(soDonvi[getHangDonvi] + "mươi");
                return;
            }
            System.out.println(soDonvi[getHangDonvi] + " mươi " +soDonvi[getHangDonvi]);
            return;
        }else{
            int getHangTram = number / 100;
            int getHangChuc = (number / 10) % 10;
            int getHangDonvi = number % 10;

            if(getHangChuc == 0 && getHangDonvi == 0)
            {
                System.out.println(soDonvi[getHangTram] + " trăm");
                return;
            }
            if(getHangChuc == 0){
                System.out.println(soDonvi[getHangTram] + " trăm lẻ " + soDonvi[getHangDonvi]);
                return;
            }
            if(getHangDonvi == 0){
                System.out.println(soDonvi[getHangTram] + " trăm " + soDonvi[getHangChuc] + " mươi");
                return;
            }
            System.out.println(soDonvi[getHangTram] + " trăm " + soDonvi[getHangChuc] + " mươi " + soDonvi[getHangDonvi]);
            return;
        }
    }

    //BT_5
    private static void ChuNhat (){
        Scanner scanner = new Scanner(System.in);

        double chieudai, chieurong;
        System.out.print("Nhập chiều dài: ");
        chieudai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        chieurong = scanner.nextDouble();

        double chuvi =  tinhChuvi(chieudai, chieurong);
        System.out.println("Chu vi chữ nhật là: " + chuvi);
        double dientich = tinhDientich(chieudai, chieurong);
        System.out.println("Chu vi chữ nhật là: " + dientich);
        System.out.println("Hình chữ nhật");
        hinhChuNhat(chieudai, chieurong);

    }
    private static double tinhChuvi(double dai, double rong){
        if( dai < rong && ( dai <= 0 || rong <= 0 ) ) {
            System.out.print("Chiều dài , chiều rộng không hợp lê !");
            return -1;
        }
        double chuvi = (dai + rong) *2;
        return chuvi;
    }
    private static double tinhDientich(double dai, double rong){
        if( dai < rong && ( dai <= 0 || rong <= 0 ) ) {
            System.out.print("Chiều dài , chiều rộng không hợp lê !");
            return -1;
        }
        double dientich = dai * rong;
        return dientich;
    }

    private static void hinhChuNhat(double dai, double rong ){

        if( dai < rong && ( dai <= 0 || rong <= 0 ) ) {
            System.out.print("Chiều dài , chiều rộng không hợp lê !");
            return;
        }
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                if (i == 0 || i == rong - 1 || j == 0 || j == dai - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}