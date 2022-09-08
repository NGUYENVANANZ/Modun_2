package Ngay_3;

import java.util.Scanner;

public class bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số phần tử trong mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];
        if (size < 30) {
            System.out.println("Nhập phần tử của mảng");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

        } else {
            System.out.println("không vượt quá 30");
        }
        int count = 0;
        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) count++;
            j++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
