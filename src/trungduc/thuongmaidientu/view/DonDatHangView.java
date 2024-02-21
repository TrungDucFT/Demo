package trungduc.thuongmaidientu.view;

import trungduc.thuongmaidientu.Controller.DonDatHangController;
import trungduc.thuongmaidientu.lib.InputHelper;
import trungduc.thuongmaidientu.model.ChiTietDonHang;
import trungduc.thuongmaidientu.model.DonDatHang;
import trungduc.thuongmaidientu.model.SanPham;

import java.util.Scanner;

public class DonDatHangView {
    private DonDatHangController controller;
    public DonDatHangView(DonDatHangController controller){
        this.controller = controller;
    }
    public void hienThiMenu(){
        System.out.println("Menu");
        System.out.println("1.Thêm đơn hàng");
        System.out.println("2.Thêm sản phẩm");
        System.out.println("3.Thêm chi tiết đơn hàng");
        System.out.println("4.Hiển thị thông tin đơn hàng");
        System.out.println("5.Thoát");
    }
    public void thucThi(char luaChon)
    {
        switch (luaChon){
            case '1':
                DonDatHang donDatHang = new DonDatHang();
                controller.themDonDatHang(donDatHang);
                break;
            case '2':
                SanPham sanPham = new SanPham();
                controller.themSanPham(sanPham);
                break;
            case '3':
                ChiTietDonHang chiTietDonHang = new ChiTietDonHang();
                controller.themChiTietDonHang(chiTietDonHang);
                break;
            case '4':
                int maDDH = new InputHelper().readInt("Nhâp mã đơn hàng: ","Mã đơn hàng là số nguyên! ");
                controller.hienThiDon(maDDH);
                break;
            case '5':
                System.out.println("Thoát chương trình");
                break;
            default:
                System.out.println("Không hợp lệ. Vui lòng nhập lại từ 1 đến 5.");
        }
    }
}
