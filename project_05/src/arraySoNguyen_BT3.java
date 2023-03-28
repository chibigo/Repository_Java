import java.util.Scanner;

public class arraySoNguyen_BT3 {
    public void arSoNguyen(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int countArray = scanner.nextInt();

        int numberArray[] = new int[countArray];
        for (int i = 0; i < numberArray.length; i++) {
            int number;
            do {
                System.out.print("Nhập phần tử thứ " + (i+1)+ " là: ");
                number = scanner.nextInt();
            }while (number < -100);
            numberArray[i] = number;
        }
        System.out.print("Array is: ");
        for (int numberItem : numberArray){
            System.out.print( numberItem + " ");
        }
        System.out.println("");
        int sumArray = sumArray(numberArray);
        System.out.println(" Sum array is: " + sumArray);
        System.out.println("---------=_=---------");
        tinhTongDuong(numberArray);
        System.out.println("---------=_=---------");
        tinhTongAm(numberArray);
        System.out.println("---------=_=---------");
        int number50 =  demSoLonHon50(numberArray);
        System.out.println(" Có " + number50+ " số lớn hơn 50");
    }

    private int sumArray(int[] numberArray){
        int sumAll = 0;
        for (int numberItem: numberArray){
            sumAll += numberItem;
        }
        return sumAll;
    }

    private void tinhTongDuong(int[] numberArray){
        int dem = 0;
        int sum = 0;
        for (int numberItem: numberArray){
            if(numberItem >  0){
                sum += numberItem;
                dem++;
            }
        }
        for (int numberItem: numberArray){
            if(numberItem > 0 ){
                System.out.println(" Số hạng dương đầu tiên của mảng "+ numberItem);
                break;
            }
        }
        if(dem > 0 ){
            int tbDuong = sum / dem;
            System.out.println(" Trung bình cộng số dương "+ tbDuong);
        }
        System.out.println(" Có " + dem+ " phần tử dương và tổng là: "+ sum);

    }
    private void tinhTongAm(int[] numberArray){
        int dem = 0;
        int sum = 0;
        for (int numberItem: numberArray){
            if(numberItem <  0){
                sum += numberItem;
                dem++;
            }
        }
        for (int numberItem: numberArray){
            if(numberItem < 0 ){
                System.out.println(" Số hạng âm đầu tiên của mảng "+ numberItem);
                break;
            }
        }
        if(dem > 0 ){
            int tbAm = sum / dem;
            System.out.println(" Trung bình cộng số âm "+ tbAm);
        }
        System.out.println(" Có " + dem+ " phần tử âm và tổng là: "+ sum);
    }

    private int demSoLonHon50(int[] numberArray){
        int dem = 0;
        for (int numberItem : numberArray){
            if(numberItem > 50){
                dem++;
            }
        }
        return dem;
    }

}
