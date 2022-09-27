package BTVN.QLPTGT.Object;

import java.util.Scanner;

public class Xe_May extends Giao_Thong {
    private int cong_Xuat;

    public Xe_May() {
    }

    public Xe_May(int cong_Xuat) {
        this.cong_Xuat = cong_Xuat;
    }

    public Xe_May(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String mau_Xe, int cong_Xuat) {
        super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, mau_Xe);
        this.cong_Xuat = cong_Xuat;
    }

    public int getCong_Xuat() {
        return cong_Xuat;
    }

    public void setCong_Xuat(int cong_Xuat) {
        this.cong_Xuat = cong_Xuat;
    }
    public void Nhap(){
        Scanner sc =new Scanner(System.in);
        super.Nhap();
        System.out.println("Số Công Xuất");
        this.cong_Xuat = Integer.parseInt(sc.nextLine());

    }

    @Override
    public String toString() {
        return  super.toString()+
                "Xe Máy "+
                " Công Suất" + cong_Xuat ;
    }
}
