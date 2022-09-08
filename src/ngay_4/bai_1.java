package ngay_4;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh("An", "C07", 1, 9, 9, 9);
        hocSinh.inRa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập lớp:");
        String lop = scanner.nextLine();
        System.out.println("Nhập mã sinh viên:");
        int masinhvien = scanner.nextInt();
        System.out.println("Nhập điểm toán:");
        int toan = scanner.nextInt();
        System.out.println("Nhập điểm lý:");
        int ly = scanner.nextInt();
        System.out.println("Nhập điểm hóa:");
        int hoa = scanner.nextInt();
        HocSinh hocSinh1 = new HocSinh(name, lop, masinhvien, toan, ly, hoa);
        hocSinh1.inRa();


    }
}
