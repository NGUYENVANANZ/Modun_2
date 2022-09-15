package Ngay_6;

import java.util.Scanner;

public class Quanly {
    public void show(Nhanvien[] nhanvien) {
        for (int i = 0; i < nhanvien.length; i++) {
            System.out.println(nhanvien[i].toString());
        }
    }

    public Nhanvien[] push(Nhanvien[] nhanvien) {
        Scanner sc = new Scanner(System.in);
        Nhanvien[] nhanviens = new Nhanvien[nhanvien.length + 1];
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        String add = sc.nextLine();
        System.out.println("Bạn muốn làm full hay part");
        System.out.println("full nhấn 1 và part nhấn 2");
        int xx = sc.nextInt();

        switch (xx) {
            case 1:
                System.out.println("nhập lương mong muốn");
                int luong = sc.nextInt();
                for (int i = 0; i < nhanvien.length; i++) {
                    nhanviens[i] = nhanvien[i];
                }
                nhanviens[nhanvien.length] = new Fulltime(id, name, age, add, luong);
                nhanvien = nhanviens;
                break;
            case 2:
                System.out.println("nhập số ngày làm");
                int soNgay = sc.nextInt();
                for (int i = 0; i < nhanvien.length; i++) {
                    nhanviens[i] = nhanvien[i];
                }
                nhanviens[nhanvien.length] = new Parttime(id, name, age, add, soNgay);
                nhanvien = nhanviens;
                break;
        }
        return nhanvien;
    }
}
