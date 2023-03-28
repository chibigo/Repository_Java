import java.util.Random;

public class sumArray_BT1 {
    public void initArray(){
        int numberArray[] = new int[20];
        Random random = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(100);
        }
        for (int numberItem: numberArray){
            System.out.print(numberItem + " ");
        }
        System.out.println("");
        int sumOfArray = sumArray(numberArray);
        System.out.println(" Sum of array is: " + sumOfArray);
        System.out.println("---------=_=---------");
        int sumEvenNumber = sumEvenInArray(numberArray);
        System.out.println(" Sum even in array is: " + sumEvenNumber);
        System.out.println("---------=_=---------");
        int numbermaxInArray = numberMax(numberArray);
        System.out.println(" Number max is: " + numbermaxInArray);
    }

    private int sumArray(int[] numberArray){
        int sumAll = 0;
        for (int numberItem: numberArray){
            sumAll += numberItem;
        }
        return sumAll;
    }

    private int sumEvenInArray(int[] numberArray){
        int sumEven = 0;
        for (int numberItem: numberArray){
            if(numberItem % 2 == 0){
                sumEven += numberItem;
            }
        }
        return sumEven;
    }

    private int sumAverageOddNumbers(int[] numberArray){
        int sumAverage = 0;
        int dem = 0;
        for (int numberItem: numberArray){
            if(numberItem % 2 != 0){
                sumAverage += numberItem;
                dem++;
            }
        }
        return sumAverage / dem;
    }
    private int numberMax(int[] numberArray){
        int maxItem = 0;
        for (int numberItem: numberArray){
            if(maxItem < numberItem){
                maxItem = numberItem;
            }
        }
        return maxItem;
    }
}
