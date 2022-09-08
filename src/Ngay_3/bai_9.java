package Ngay_3;

import java.util.Scanner;

public class bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử của mảng");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Số lớn nhất là:" + max(arr));
    }

    public static int max(int[][] arr) {
        int max = 0;
        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            i++;
        }
        return max;
    }
}
