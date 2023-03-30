import java.time.LocalDate;
import java.util.Scanner;

public class ArrayList_BT1 {
    public static void arrayList(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int countArray = scanner.nextInt();

        int numberArray[] = new int[countArray];
        for (int i = 0; i < numberArray.length; i++) {
            int number;
            do {
                System.out.print("Nhập phần tử thứ " + (i+1)+ " là: ");
                number = scanner.nextInt();
            }while (false);
            numberArray[i] = number;
        }
        System.out.print("Array is: ");
        for (int numberItem : numberArray){
            System.out.print( numberItem + " ");
        }
        System.out.println("");
        int sumArray = sumArrayList(numberArray);
        System.out.println("Sum array is: "+ sumArray);
        int sumArrayFirstLast = sumFirstEnd(numberArray);
        System.out.println("Sum first + last is: "+ sumArrayFirstLast);

    }

    private static int sumArrayList(int[] numberArray){
        int sum = 0;
        for (int numberItem : numberArray){
            sum += numberItem;
        }
        return sum;
    }
    private static int sumFirstEnd(int[] numberArray){
        int sum = numberArray[0] + numberArray[numberArray.length -1];
        return sum;
    }
}
