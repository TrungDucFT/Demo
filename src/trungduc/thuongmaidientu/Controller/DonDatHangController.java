package trungduc.thuongmaidientu.Controller;

import trungduc.thuongmaidientu.model.ChiTietDonHang;
import trungduc.thuongmaidientu.model.DonDatHang;
import trungduc.thuongmaidientu.model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonDatHangController {
    private List<DonDatHang> danhSachDonDatHang;
    private List<SanPham> danhSachSanPham;
    private List<ChiTietDonHang> danhSachChiTietDonHang;
    public DonDatHangController(){
        danhSachDonDatHang = new ArrayList<>();
        danhSachSanPham = new ArrayList<>();
        danhSachChiTietDonHang = new ArrayList<>();
    }
    public void themSanPham(SanPham sanPham){
        danhSachSanPham.add(sanPham);
        System.out.println("Thêm sản phẩm thành công!");
    }
    public void themDonDatHang(DonDatHang donDatHang){
        danhSachDonDatHang.add(donDatHang);
        System.out.println("Thêm đơn đặt hàng thành công!");
    }
    public void themChiTietDonHang(ChiTietDonHang chiTietDonHang){
        int maSP = chiTietDonHang.getMaSP();
        int maDDH = chiTietDonHang.getMaDDH();
        //Kiểm tra sản phẩm tồn tại
        boolean sanPhamTonTai = false;
        for (SanPham sanPham : danhSachSanPham){
            if (sanPham.getMaSP() == maSP){
                sanPhamTonTai = true;
                break;
            }
        }
        if (!sanPhamTonTai){
            //Sản phẩm không tồn tại, thông báo & hỏi người dùng
            System.out.println("Sản phẩm không tồn tại trong danh sách.");
            System.out.println("Bạn có muốn thêm sản phẩm mới không? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            char luaChonThemSanPham = scanner.next().charAt(0);
            if (luaChonThemSanPham == 'Y'||luaChonThemSanPham == 'y')
            {
                SanPham sanPhamMoi = new SanPham();
                themSanPham(sanPhamMoi);
            }else {
                System.out.println("Không thêm sản phẩm mới!");
                return;
            }
        }
        danhSachChiTietDonHang.add(chiTietDonHang);
        System.out.println("Thêm chi tiết đơn hàng thành công!");
    }
    public void hienThiDon(int maDDH){
        for (DonDatHang donDatHang:danhSachDonDatHang){
            if (donDatHang.getMaDDH()==maDDH){
                donDatHang.inThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy đơn hàng có mã"+maDDH);
    }
}
