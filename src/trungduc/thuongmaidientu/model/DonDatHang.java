package trungduc.thuongmaidientu.model;

import trungduc.thuongmaidientu.lib.InputHelper;

import java.time.LocalDate;

public class DonDatHang {
    private int maDDH;
    private String soHieuDon;
    private LocalDate ngayTao;
    //Constructor
    public DonDatHang() {
        this.maDDH = new InputHelper().readInt("Nhập mã Đơn hàng: ","Mã đơn hàng là số nguyên! ");
        this.soHieuDon = new InputHelper().readString("Nhập số hiệu đơn: ");
        this.ngayTao = LocalDate.now();
    }
    //Getter and Setter
    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public String getSoHieuDon() {
        return soHieuDon;
    }

    public void setSoHieuDon(String soHieuDon) {
        this.soHieuDon = soHieuDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }
    //In thong tin
    public void inThongTin(){
        System.out.println("Ma don hang : "+maDDH);
        System.out.println("So hieu don: "+soHieuDon);
        System.out.println("Ngay tao: "+ngayTao);
    }
}
