import java.util.Scanner;

public class TuDien_BT3 {
    static String[] tuTiengAnh, nghiaTiengViet, phienAm;
    public static void tuDien(){
        Scanner scanner = new Scanner(System.in);
        int chonSo;
        do {
            System.out.println("TỪ ĐIỂN ANH VIỆT - BÀI TẬP VINAENTER EDU");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Xuất dữ liệu");
            System.out.println("3. Dịch từ");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            chonSo = scanner.nextInt();
            switch (chonSo) {
                case 1:
                    nhapDuLieu();
                    break;
                case 2:
                    xuatDuLieu();
                    break;
                case 3:
                    dichTuDien();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!. Hãy chọn lại.");
                    break;
            }
        } while (chonSo != 4);
        scanner.close();
    }
    private static void nhapDuLieu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số từ vựng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        tuTiengAnh = new String[n];
        nghiaTiengViet = new String[n];
        phienAm = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập từ tiếng Anh thứ " + (i+1) + ": ");
            tuTiengAnh[i] = scanner.nextLine();
            System.out.print("Nhập nghĩa tiếng Việt của từ " + tuTiengAnh[i] + ": ");
            nghiaTiengViet[i] = scanner.nextLine();
            System.out.print("Nhập phiên âm của từ " + tuTiengAnh[i] + ": ");
            phienAm[i] = scanner.nextLine();
        }
        System.out.println("Hoàn thành nhập!");
    }
    private static void xuatDuLieu(){
        System.out.println("Dữ liệu từ điển Anh - Việt:");
        if(tuTiengAnh != null){
            for (int i = 0; i < tuTiengAnh.length; i++) {
                System.out.printf("%s: %s (%s)%n", tuTiengAnh[i], nghiaTiengViet[i], phienAm[i]);
            }
        }else{
            System.out.println("Không có thông tin!!!");
        }

    }
    private static void dichTuDien(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập từ tiếng Anh cần tra: ");
        String wordToSearch = scanner.nextLine();
        if(tuTiengAnh != null){
            for (int i = 0; i < tuTiengAnh.length; i++) {
                if (tuTiengAnh[i].equalsIgnoreCase(wordToSearch)) {
                    System.out.printf(" Nghĩa:(%s)%n Phiên âm:(%s)%n", nghiaTiengViet[i], phienAm[i]);
                    break;
                }
            }
        }
        System.out.println("Không tìm thấy từ này trong từ điển.");
    }
}
