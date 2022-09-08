package Ngay_3;

import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số phần tử trong mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập phần tử của mảng");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Số nhỏ nhất là:" + min(arr));

    }
    public static int min(int[] arr){
        int min = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
