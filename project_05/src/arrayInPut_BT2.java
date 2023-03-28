import java.util.Scanner;

public class arrayInPut_BT2 {
    public void setInputArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int countArray = scanner.nextInt();

        int numberArray[] = new int[countArray];
        for (int i = 0; i < numberArray.length; i++) {
            int number;
            do {
                System.out.print("Nhập phần tử thứ " + (i+1)+ " là: ");
                number = scanner.nextInt();
            }while (number < 20 || number > 100);
            numberArray[i] = number;
        }
        System.out.print("Array is: ");
        for (int numberItem : numberArray){
            System.out.print( numberItem + " ");
        }
        System.out.println("");
        int number5 = numberDivisible5(numberArray);
        System.out.println(" Có số" + number5+ " chia hết cho 5");
        System.out.println("---------=_=---------");
        int number3and4 = numberDivisible3and4(numberArray);
        System.out.println(" Có số " + number3and4+ " chia hết cho 3 và 4");
    }

    private int numberDivisible5(int[] numberArray){
        int dem = 0;
        for (int numberItem : numberArray){
            if(numberItem % 5 == 0){
                dem++;
            }
        }
        return dem;
    }

    private int numberDivisible3and4(int[] numberArray){
        int dem = 0;
        for (int numberItem : numberArray){
            if(numberItem % 3 == 0 && numberItem % 4 == 0){
                dem++;
            }
        }
        return dem;
    }
}
