import java.util.Scanner;

public class Character_BT4 {
    public static void character(){
        Scanner scanner = new Scanner(System.in);
        String str, reverseStr = "";
        int dem = 0;

        System.out.print("Nhập vào chuỗi ký tự: ");
        str = scanner.nextLine();

        String[] words = str.split(" ");
        System.out.println("Các từ trong chuỗi:");
        for (String word : words) {
            System.out.println(word);
            dem++;
        }
        System.out.println("Số từ có trong chuỗi đã cho là: "+ dem);
        for (int i = words.length - 1; i >= 0; i--) {
            reverseStr += words[i] + " ";
        }
        System.out.println("Chuỗi đảo ngược: " + reverseStr);
    }
}
