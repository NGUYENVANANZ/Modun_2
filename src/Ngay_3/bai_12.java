package Ngay_3;

import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Số hàng");
            x = sc.nextInt();
            System.out.println("Số cột");
            y = sc.nextInt();
            if (x < 0 || y < 0) {
                System.out.println("Nhập lại: ");
            }
        } while (x < 0 || y < 0);
        int[][] arr = new int[y][x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử của mảng: \n");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("a[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Vị trí cột");
        int index = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][index];
            i++;
        }
        System.out.println("Tổng của cột " + index + "là:" + sum);
    }
}
