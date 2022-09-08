package Ngay_1;

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        double vnd = 23.000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập usd:");
        usd = scanner.nextDouble();
        double tiente = usd * vnd;
        System.out.println("Tiền việt"+tiente);
    }
}
