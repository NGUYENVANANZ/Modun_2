package BTVN.QLPTGT.Object;

import java.util.Scanner;

public class Oto extends Giao_Thong {
    private int so_Cho_Ngoi;
    private String kieu_Dong_Co;

    public Oto() {
    }

    public Oto(int so_Cho_Ngoi, String kieu_Dong_Co) {
        this.so_Cho_Ngoi = so_Cho_Ngoi;
        this.kieu_Dong_Co = kieu_Dong_Co;
    }

    public Oto(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String mau_Xe, int so_Cho_Ngoi, String kieu_Dong_Co) {
        super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, mau_Xe);
        this.so_Cho_Ngoi = so_Cho_Ngoi;
        this.kieu_Dong_Co = kieu_Dong_Co;
    }

    public int getSo_Cho_Ngoi() {
        return so_Cho_Ngoi;
    }

    public void setSo_Cho_Ngoi(int so_Cho_Ngoi) {
        this.so_Cho_Ngoi = so_Cho_Ngoi;
    }

    public String getKieu_Dong_Co() {
        return kieu_Dong_Co;
    }

    public void setKieu_Dong_Co(String kieu_Dong_Co) {
        this.kieu_Dong_Co = kieu_Dong_Co;
    }

    public void Nhap(){
        Scanner sc =new Scanner(System.in);
        super.Nhap();
        System.out.println("Số Chỗ Ngồi");
        this.so_Cho_Ngoi = Integer.parseInt(sc.nextLine());
        System.out.println("Kiểu Động Cơ");
        this.kieu_Dong_Co = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+
                "Oto"+
                " Số Chỗ Ngồi" + so_Cho_Ngoi +
                ",Kiểu Động Cơ" + kieu_Dong_Co ;
    }
}
