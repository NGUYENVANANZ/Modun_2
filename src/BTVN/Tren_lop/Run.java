package BTVN.Tren_lop;

import java.util.Scanner;

public class Run{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ManageCenter manageCenter =  new ManageCenter();

        System.out.println("------------MENU------------");
        System.out.println("1. Nhập thông tin mới cho cán bộ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị Thông tin cán bộ");
        System.out.println("4. Thoát");

        while (true) {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manageCenter.Them();
                    break;
                case 2:
                    manageCenter.TimKiem();
                    break;
                case 3:
                    manageCenter.Show();
                    break;
                case 4:
                    return;
            }
        }
    }
}
