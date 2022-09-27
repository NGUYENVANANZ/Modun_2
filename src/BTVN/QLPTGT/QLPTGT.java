package BTVN.QLPTGT;

import BTVN.QLPTGT.Object.Giao_Thong;
import BTVN.QLPTGT.Object.Oto;
import BTVN.QLPTGT.Object.Xe_May;
import BTVN.QLPTGT.Object.Xe_Tai;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT {
    ArrayList<Giao_Thong> giao_thongs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Them_Oto() {
        Oto oto = new Oto();
        oto.Nhap();
        giao_thongs.add(oto);
    }

    public void Them_Xe_May() {
        Xe_May xe_may = new Xe_May();
        xe_may.Nhap();
        giao_thongs.add(xe_may);
    }

    public void Them_Xe_Tai() {
        Xe_Tai xe_tai = new Xe_Tai();
        xe_tai.Nhap();
        giao_thongs.add(xe_tai);
    }

    public void Them_Phuong_Tien() {
        System.out.println("Bạn muốn xe gì ?");
        System.out.println("1. Oto");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe Tải");
        System.out.println("----------------------------");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> Them_Oto();
            case 2 -> Them_Xe_May();
            case 3 -> Them_Xe_Tai();
        }
    }

    public void Sua_Phuong_Tien() {
        System.out.println("Bạn muốn sửa xe nào ???");
        int iD = Integer.parseInt(sc.nextLine());
        for (Giao_Thong giao_thong : giao_thongs) {
            if (giao_thong.getiD() == iD) {
                giao_thong.Nhap();
            }
        }
        Hien_Thi();
    }

    public void Xoa_Phuong_Tien() {
        System.out.println("Bạn muốn xóa xe nào ???");
        int iD = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < giao_thongs.size(); i++) {
            if (giao_thongs.get(i).getiD() == iD) {
                index = i;
            }
        }
        giao_thongs.remove(index);
        Hien_Thi();
    }

    public void Tim_Theo_Hang() {
        System.out.println("Bạn muốn tìm xe nào ???");
        String hang_Xe = sc.nextLine();
        for (Giao_Thong giao_thong : giao_thongs) {
            if (giao_thong.getHang_San_Xuat().equals(hang_Xe)) {
                System.out.println(giao_thong);
            }
        }
    }

    public void Tim_Theo_Mau() {
        System.out.println("Bạn muốn tìm xe nào ???");
        String mau_Xe = sc.nextLine();
        for (Giao_Thong giao_thong : giao_thongs) {
            if (giao_thong.getMau_Xe().equals(mau_Xe)) {
                System.out.println(giao_thong);
            }
        }
    }


    public void Tim_Phuong_Tien() {
        System.out.println("Bạn muốn tìm xe gì ?");
        System.out.println("1. Theo Hãng");
        System.out.println("2. Theo Màu");
        System.out.println("----------------------------");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> Tim_Theo_Hang();
            case 2 -> Tim_Theo_Mau();
        }
    }

    public void Sap_Xep() {
        boolean needNextPass = true;

        for (int k = 1; k < giao_thongs.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < giao_thongs.size() - k; i++) {
                if (giao_thongs.get(i).getiD() > giao_thongs.get(i + 1).getiD()) {
                    Giao_Thong temp = giao_thongs.get(i);
                    giao_thongs.set(i, giao_thongs.get(i + 1));
                    giao_thongs.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }
        Hien_Thi();
    }

    public void Hien_Thi() {
        for (Giao_Thong x : giao_thongs) {
            System.out.println(x.toString());
        }

    }

    public void Menu() {
        while (true) {
            System.out.println("Bạn muốn làm gì ?");
            System.out.println("1. Thêm xe");
            System.out.println("2. Sửa ");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm Phương Tiện");
            System.out.println("5. Sắp Xếp");
            System.out.println("6. Hiện Thị");
            System.out.println(". Thoát");
            System.out.println("----------------------------");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> Them_Phuong_Tien();
                case 2 -> Sua_Phuong_Tien();
                case 3 -> Xoa_Phuong_Tien();
                case 4 -> Tim_Phuong_Tien();
                case 5 -> Sap_Xep();
                case 6 -> Hien_Thi();
                default -> System.exit(0);
            }
        }

    }
}
