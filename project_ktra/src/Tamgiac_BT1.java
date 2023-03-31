import java.util.Scanner;

public class Tamgiac_BT1 {
    public static void tamgiac(){
        Scanner scanner = new Scanner(System.in);
        int numberHeight, numberColumn;
        System.out.print("Nhập chiều cao: ");
         numberHeight = scanner.nextInt();
        if (numberHeight % 2 == 0){
            numberColumn = (numberHeight /2) + 1;
        }else{
            numberColumn = numberHeight + 1;
        }
        for (int i = 1; i <= numberHeight; i++) {
            if (numberHeight % 2 != 0){
                numberColumn = (numberHeight /2) + 1;
                for (int j = 1; j <= numberColumn ; j++) {
                    if (j == 1 || i == j || i + j == numberHeight + 1 || (i + j == numberHeight && i == numberColumn)){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }else{
                numberColumn = (numberHeight / 2);
                for (int j = 1; j <= numberColumn ; j++) {
                    if (j == 1 || i == j || i + j == numberHeight + 1){
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
