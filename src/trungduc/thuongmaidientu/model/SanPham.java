package trungduc.thuongmaidientu.model;

import trungduc.thuongmaidientu.lib.InputHelper;

public class SanPham {
    private int maSP;
    private String tenSP;
    private float giaBan;
    private String ghiChu;
    //Constructor
    public SanPham() {
        this.maSP = new InputHelper().readInt("Nhập mã sản phẩm: ","Mã sản phẩm là số nguyên! ");
        this.tenSP = new InputHelper().readString("Nhập tên sản phẩm! ");
        this.giaBan = new InputHelper().readFloat("Nhập giá bán! ");
        this.ghiChu = new InputHelper().readString("Nhập ghi chú! ");
    }
    //Getter and Setter

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    //inThongTin Method
    public void inThongTin(){
        System.out.println("Mã sản phẩm: "+maSP);
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Giá bán: "+giaBan);
        System.out.println("Ghi chú: "+ghiChu);
    }
}
