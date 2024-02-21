package trungduc.thuongmaidientu.model;

import trungduc.thuongmaidientu.lib.InputHelper;

public class ChiTietDonHang {
    private int iD;
    private int maDDH;
    private int maSP;
    private int soLuong;
    //Constructor
    public ChiTietDonHang() {
        this.iD = new InputHelper().readInt("Nhập ID: ","ID là số nguyên! ");
        this.maDDH = new InputHelper().readInt("Nhập mã đơn hàng: ","Mã đơn hàng là số nguyên! ");
        this.maSP = new InputHelper().readInt("Nhập mã sản phẩm: ","Mã đơn hàng là số nguyên! ");
        this.soLuong = new InputHelper().readInt("Nhập số lượng: ", "Mã đơn hàng là số nguyên! ");
    }
    //Getter and Setter

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    //Inthongtin Method
    public void inThongTin(){
        System.out.println("ID sản phẩm: "+iD);
        System.out.println("Mã đơn hàng: "+maDDH);
        System.out.println("Mã sản phẩm: "+maSP);
        System.out.println("Số lượng: "+soLuong);
    }
}
