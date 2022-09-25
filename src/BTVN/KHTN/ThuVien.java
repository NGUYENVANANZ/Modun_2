package BTVN.KHTN;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuVien {
    static Scanner sc = new Scanner(System.in);
    ArrayList<TheMuon> sinhViens = new ArrayList<>();

    public void themSinhVien() {
        System.out.println("Họ Tên:");
        String name = sc.nextLine();
        System.out.println("Mã Sinh Viên");
        String mSV = sc.nextLine();
        System.out.println("Năm sinh");
        int nam_Sinh = Integer.parseInt(sc.nextLine());
        System.out.println("số Phiếu Mượn");
        int so_Phieu_Muon = Integer.parseInt(sc.nextLine());
        System.out.println("Ngày Mượn");
        int ngay_Muon = Integer.parseInt(sc.nextLine());
        System.out.println("Tháng Mượn");
        int thang_Muon = Integer.parseInt(sc.nextLine());
        System.out.println("Năm Mượn");
        int nam_Muon = Integer.parseInt(sc.nextLine());
        System.out.println("Thời Gian Mượn");
        int han_tra = Integer.parseInt(sc.nextLine());
        System.out.println("Mã Sách");
        String Ma_Sach = sc.nextLine();
        TheMuon theMuon = new TheMuon(name, mSV, nam_Sinh, so_Phieu_Muon, ngay_Muon, thang_Muon, nam_Muon, han_tra, Ma_Sach);
        sinhViens.add(theMuon);
    }

    public void push_And_Show() {
        System.out.println("Nhập Mã Sinh Viên Muốn Tìm");
        String mSV = sc.nextLine();
        for (TheMuon sinhVien : sinhViens)
            if (sinhVien.getmSV().equals(mSV)) {
                System.out.println(sinhVien.toString());
            }
    }

    public String ngay_Tra_Sach(int ngay, int thang, int nam, int x) {
        int ngay_x = ngay + x;
        if (thang == 2) {
            if (ngay_x >= 28) {
                thang++;
                ngay = ngay_x - ngay;
            } else {
                ngay = ngay_x;
            }
        }
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            if (ngay == 30) {
                thang++;
                ngay = ngay_x - ngay;
            } else {
                ngay = ngay_x;
            }
        }
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            if (thang == 12 && ngay == 31) {
                nam++;
                thang = 1;
                ngay = 1;
            } else {
                if (ngay == 31) {
                    thang++;
                    ngay = ngay_x - ngay;
                } else {
                    ngay = ngay_x;
                }
            }

        }


        return ngay + "-" + thang + "-" + nam;
    }

    public void show_xy() {
        String str;
        for (TheMuon sinhVien : sinhViens) {
            str = sinhVien.toString() + " Mượn sách" + sinhVien.getMa_SAch() + "  " + ngay_Tra_Sach(sinhVien.getNgay_Muon(), sinhVien.getThang_Muon(), sinhVien.getNam_Muon(), sinhVien.getSoNgayDuocMuon());
            System.out.println(str);
        }
    }


}
