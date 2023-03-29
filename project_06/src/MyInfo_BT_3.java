import com.sun.tools.attach.AgentInitializationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyInfo_BT_3 {
    public static void myInfo(){
        Scanner scanner = new Scanner(System.in);

        String name;
        LocalDate parsedDate;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true){
            try {
                System.out.print("Nhập tên: ");
                name = scanner.nextLine();
                System.out.print("Nhập ngày/tháng/năm sinh: ");
                String inputBirthDay = scanner.nextLine();

                parsedDate = LocalDate.parse(inputBirthDay, formatter);

                System.out.println("parsedDate: " + parsedDate);
                System.out.println("check age: " + LocalDate.now().minusYears(13));

                if (parsedDate.isAfter(LocalDate.now().minusYears(13))) {
                    throw new AgeException("Bạn chưa đủ tuổi! Tuổi đạt yêu cầu 13 trở lên");
                }
                break;
            }catch (AgeException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println("Thông tin nhập không hợp lệ. Vui lòng thử lại!");
            }
        }
        System.out.println("-----------------= Thông tin =-----------------");
        System.out.println("Tên: " + name);
        System.out.println("Ngày/tháng/năm sinh: " + parsedDate.format(formatter));
    }
}
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
