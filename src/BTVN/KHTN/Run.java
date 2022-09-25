package BTVN.KHTN;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien thuVien = new ThuVien();
        while (true) {
            System.out.println("------------MENU------------");
            System.out.println("1. Nhập thông tin sinh viên mượn sách");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thời gian trả");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    thuVien.themSinhVien();
                    break;
                case 2:
                    thuVien.push_And_Show();
                    break;
                case 3:
                    thuVien.show_xy();
                    break;
                case 4:
                    System.exit(0);
                    return;
            }
        }

    }
}
