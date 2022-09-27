package Ngay_6.Bai_7;

import java.util.Scanner;

public class bai_7 {
    static Nhanvien[] nhanvien;

    public static void main(String[] args) {
        nhanvien = new Nhanvien[2];
        nhanvien[0] = new Fulltime(1, "An", 18, "VN", 10000);
        nhanvien[1] = new Parttime(2, "Sơn", 25, "VN", 15);

        Scanner scanner = new Scanner(System.in);
        Quanly quanly = new Quanly();

        System.out.println("Menu");
        System.out.println("1. HIện thị nhân viên");
        System.out.println("2. Thêm nv");
        System.out.println("3. Thoát");
        while (true) {
            System.out.println("bạn muốn???");
            int xx = scanner.nextInt();
            switch (xx) {
                case 1:
                    quanly.show(nhanvien);
                    break;
                case 2:
                    nhanvien = quanly.push(nhanvien);
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }
}

