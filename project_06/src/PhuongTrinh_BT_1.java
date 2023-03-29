import java.util.Scanner;

public class PhuongTrinh_BT_1 {
    public static void phuongTrinh(){
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, x;

        try {
            System.out.print("Nhập hệ số a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập hệ số b: ");
            b = scanner.nextDouble();
        }catch (java.util.InputMismatchException e){
            System.out.println("Lỗi: Bạn đã nhập sai kiểu dữ liệu!");
            System.exit(0);
        }

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            try {
                x = - b / a;
                System.out.println("Phương trình có nghiệm là: "+ x);
            }catch (ArithmeticException e){
                System.out.println("Lỗi: Không thể chia cho 0!");
            }
        }
    }
}
