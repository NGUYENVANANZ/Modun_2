package BTVN.QLPTGT.Object;

import java.util.Scanner;

public class Xe_Tai extends Giao_Thong {
    private int trong_Tai;

    public Xe_Tai() {
    }

    public Xe_Tai(int trong_Tai) {
        this.trong_Tai = trong_Tai;
    }

    public Xe_Tai(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String mau_Xe, int trong_Tai) {
        super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, mau_Xe);
        this.trong_Tai = trong_Tai;
    }

    public int getTrong_Tai() {
        return trong_Tai;
    }

    public void setTrong_Tai(int trong_Tai) {
        this.trong_Tai = trong_Tai;
    }


    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Số Chỗ Ngồi");
        this.trong_Tai = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Xe Tải " +
                " Trọng Tải" + trong_Tai;
    }
}
