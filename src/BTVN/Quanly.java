package BTVN;

import java.util.Scanner;

public class Quanly {
    static Scanner sc = new Scanner(System.in);
    static HSHocSinh[] hocSinhs = new HSHocSinh[Test.dSach];

    public static void dSach() {
        for (int i = 0; i < hocSinhs.length; i++) {
            System.out.println("Nhập tên:");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Quê quán:");
            String address = sc.nextLine();
            System.out.println("Nhập lớp");
            String lop = sc.nextLine();
            System.out.println("Khóa");
            String khoaHoc = sc.nextLine();
            System.out.println("Kỳ");
            int kyHoc = Integer.parseInt(sc.nextLine());
            hocSinhs[i] = new HSHocSinh(name, age, address, lop, khoaHoc, kyHoc);
            int index = i + 1;
            System.out.println("học sinh " + index + " đã được thêm");
        }


    }

    public static void show_1(){
        for (HSHocSinh hocSinh : hocSinhs) {
            if (hocSinh.getAge() == 20 && hocSinh.getAddress().equals("Thai Nguyen")) {
                System.out.println(hocSinh.toString());
            }
        }
    }
    public static void show_2(){
        for (HSHocSinh hocSinh : hocSinhs) {
            if (hocSinh.getLop().equals("10A1")) {
                System.out.println(hocSinh.toString());
            }
        }
    }
}
