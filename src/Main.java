import trungduc.thuongmaidientu.Controller.DonDatHangController;
import trungduc.thuongmaidientu.view.DonDatHangView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DonDatHangController controller = new DonDatHangController();
        DonDatHangView view = new DonDatHangView(controller);
        Scanner scanner = new Scanner(System.in);
        char luaChon;
        do {
            view.hienThiMenu();
            System.out.println("Nhập lựa chọn của bạn (1-5): ");
            luaChon = scanner.next().charAt(0);
            view.thucThi(luaChon);
        }while (luaChon!='5');
    }
}