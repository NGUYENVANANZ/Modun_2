package BTVN;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static int dSach;
    public static void main(String[] args) {
        System.out.println("Danh sách số học sinh");
        dSach = Integer.parseInt(sc.nextLine());
       Quanly.dSach();
       Quanly.show_1();
    }
}
