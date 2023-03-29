import java.util.Scanner;

public class Character_BT5 {
    public static void Character(){
        Scanner scanner = new Scanner(System.in);
        String str, reverseStr = "";

        System.out.print("Nhập vào chuỗi ký tự: ");
        str = scanner.nextLine();

        String replacedStr = str.replace("e", "3").replace('g', '9');
        System.out.println("Chuỗi mới là: "+ replacedStr);

        String[] words = replacedStr.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverseStr += words[i] + " ";
        }
        System.out.println("Chuỗi đảo ngược: " + reverseStr);
    }

}
