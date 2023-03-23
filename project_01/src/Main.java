import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        totalMoneyFlower();
        System.out.println("----------------------------------");
        score();
        System.out.println("----------------------------------");
        checkNumber();
    }
    // BT_2
    private static void totalMoneyFlower() {
        String Name = "Hoa mau don";
        float price = 12000f;
        int quantity = 4;
        float totalMoney = price * quantity;
        System.out.println("Name:" + Name);
        System.out.println("price:" + price);
        System.out.println("quantity:" + quantity);
        System.out.println("total:" + totalMoney);
    }

    //BT_3
    private static void score(){
        int sum = 57;
        int quantity = 10 ;
        int soTrangIncrease = (int)Math.ceil((double) sum / quantity);
        int soTrangReduce = (int)Math.floor((double) sum / quantity) ;
        System.out.println("soTrang increase:" + soTrangIncrease);
        System.out.println("soTrang reduce:" + soTrangReduce);
    }

    //BT_4
    private static void checkNumber(){

        int max;
        int min;
        int randomNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max: ");
        max = Integer.parseInt(scanner.nextLine());
        System.out.println("Min: ");
        min = Integer.parseInt(scanner.nextLine());
        randomNumber = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("randomNumber: " + randomNumber);
        System.out.println(randomNumber % 3 == 0 ? "randomNumber chia het cho 3" : "randomNumber không chia het cho 3");
        System.out.println((15 <= randomNumber && randomNumber <= 90) ? "randomNumber thuoc khoang (15, 90)" : "randomNumber khong thuoc khoang (15, 90)");

    }
}

