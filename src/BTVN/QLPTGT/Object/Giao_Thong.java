package BTVN.QLPTGT.Object;

import java.util.Scanner;

public class Giao_Thong{
    private int iD;
    private String hang_San_Xuat;
    private int nam_San_Xuat;
    private double gia_Ban;
    private String mau_Xe;


    public Giao_Thong() {
    }

    public Giao_Thong(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String mau_Xe) {
        this.iD = iD;
        this.hang_San_Xuat = hang_San_Xuat;
        this.nam_San_Xuat = nam_San_Xuat;
        this.gia_Ban = gia_Ban;
        this.mau_Xe = mau_Xe;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getHang_San_Xuat() {
        return hang_San_Xuat;
    }

    public void setHang_San_Xuat(String hang_San_Xuat) {
        this.hang_San_Xuat = hang_San_Xuat;
    }

    public int getNam_San_Xuat() {
        return nam_San_Xuat;
    }

    public void setNam_San_Xuat(int nam_San_Xuat) {
        this.nam_San_Xuat = nam_San_Xuat;
    }

    public double getGia_Ban() {
        return gia_Ban;
    }

    public void setGia_Ban(double gia_Ban) {
        this.gia_Ban = gia_Ban;
    }

    public String getMau_Xe() {
        return mau_Xe;
    }

    public void setMau_Xe(String mau_Xe) {
        this.mau_Xe = mau_Xe;
    }


    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID");
        this.iD = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Hãng");
        this.hang_San_Xuat = sc.nextLine();
        System.out.println("Nhập Năm Sản Xuất");
        this.nam_San_Xuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Giá Bán");
        this.gia_Ban = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Màu");
        this.mau_Xe = sc.nextLine();

    }

    @Override
    public String toString() {
        return "iD: " + iD +
                ", Hãng Sản Xuất:" + hang_San_Xuat +
                ", Năm Sản Xuất " + nam_San_Xuat +
                ", Giá Bán " + gia_Ban +
                ", Màu Xe " + mau_Xe ;
    }

}
