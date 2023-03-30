import Controllers.ThiSinhController;

public class Main {
    public static void main(String[] args) {
        ThiSinhController thiSinhController = new ThiSinhController();

        System.out.println("---------=BT 1=---------");
        ArrayList_BT1.arrayList();
        System.out.println("---------=BT 2=---------");
        thiSinhController.thiSinh();
        System.out.println("---------=BT 3=---------");
        TuDien_BT3.tuDien();
    }
}