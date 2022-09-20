package BTVN.San_pham;

import java.util.Scanner;

public class Run {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 7;
        Quan_ly quan_ly = new Quan_ly();
        San_pham sp = new San_pham("M01", "Son", 1000, 1, "deptrai");
        quan_ly.getSan_phams().add(sp);

        System.out.println("--- CHOUWNG TRÌNH QUẢN LÝ SẢN PHẨM ---");
        System.out.println(" Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Thoát");
        while (true) {
            do {
                if (choice > 7) System.out.println("mời chọn lại");

                System.out.println("Chọn chức năng");
                choice = Integer.parseInt(sc.nextLine());
            } while (choice > 7);
            switch (choice) {
                case 1:
                    quan_ly.show();
                    break;
                case 2:
                    quan_ly.add();
                    break;
                case 3:
                    quan_ly.edit();
                    break;
                case 4:
                    quan_ly.pop();
                    break;
                case 5:
                    quan_ly.sapXep();
                    break;
                case 6:
                    quan_ly.giaLonNhat();
                    break;
                case 7:
                    System.exit(0);
                    break;

            }
        }
    }
}
