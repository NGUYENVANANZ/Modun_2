package Ngay_3;

import java.util.Scanner;

public class bai_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Số hàng");
            x = sc.nextInt();
            System.out.println("Số cột");
            y = sc.nextInt();
            if ((x < 0 || y < 0) || x != y) {
                System.out.println("Nhập lại: ");
            }
        } while ((x < 0 || y < 0) || x != y);
        int[][] arr = new int[y][x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử của mảng: \n");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("a[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận vuông là:" + sum);
    }
}
