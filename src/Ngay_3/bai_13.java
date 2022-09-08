package Ngay_3;

import java.io.IOException;
import java.util.Scanner;

public class bai_13 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String a = scanner.nextLine();
        System.out.println("kí tự cần đếm");
        char b = (char) System.in.read();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                count++;
            }
        }
        System.out.println("Số kí tụ giống" + count);
    }
}
