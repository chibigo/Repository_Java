import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input numberInt:");
        int numberInt = scanner.nextInt();
        int sum = sumInt(numberInt);
        System.out.println("Sum Number " + sum);

        System.out.println("----------------------------------");
        checkDayOfMonth();

        System.out.println("----------------------------------");
        System.out.print("Input size array: ");
        int size= scanner.nextInt();
        int minNumber = checkMIn(size);
        System.out.println("Min Number " + minNumber);

        System.out.println("----------------------------------");
        sumPoint();

        System.out.println("----------------------------------");
        System.out.print("Input setHeight: ");
        int setHeight = scanner.nextInt();
        star(setHeight);
    }

    //BT_1
    private static int sumInt(int numberInt) {
        int sumNumber = 0;
        for (int i = 1; i <= numberInt; i++) {
            sumNumber += i;
        }
        return sumNumber;
    }

    //BT_3
    private static void checkDayOfMonth() {
        int getMonth;
        int getdays;
        int getyear;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng:");
        getMonth =  scanner.nextInt();
        if(getMonth < 0 && getMonth > 12){
            System.out.print("Nhập tháng không hợp lệ");
            return;
        }
        // Những năm chia hết cho 4 là năm nhuận, ngoại trừ những năm chia hết cho 100 mà không chia hết cho 400
        switch (getMonth) {
            case 2:
                System.out.print("Nhập vào năm: ");
                getyear = scanner.nextInt();
                if ((getyear % 4 == 0 && getyear % 100 != 0) || getyear % 400 == 0) {
                    getdays = 29;
                } else {
                    getdays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                getdays = 30;
                break;
            default:
                getdays = 31;
                break;
        }
        System.out.println("Tháng " + getMonth + " có " + getdays + " ngày.");
    }

    //BT_4

    private static int checkMIn(int size){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //BT_5
    private static void sumPoint(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sumPoint = 0;
        int sumGuess = 0;
        int correctGuess = 0;
        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            int getNumber = Integer.parseInt(input);
            int randomNumber = random.nextInt(6);
            sumGuess ++;
            if(getNumber == randomNumber){
                System.out.println("Correct !");
                sumPoint +=2;
                correctGuess ++;

            }else{
                System.out.println("Incorrect !, random is: "+ randomNumber);
            }
        }
        double pointTB = (double) sumPoint / sumGuess;
        System.out.println("Số lần đoán (sumGuess) :" + sumPoint);
        System.out.println("Tổng số điểm (sumPoint) :" + sumPoint);
        System.out.println("Số lần đoán đúng (correctGuess) :" + correctGuess);
        System.out.println("Điểm trung bình (pointTB): "+ pointTB);
    }

    // BT_6
    private static void star(int getHeight){
        for (int i = 1; i <= getHeight; i++) {
            for (int j = 1; j <= getHeight-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}