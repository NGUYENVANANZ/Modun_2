package Ngay_6.Bai_1;

import java.util.Arrays;
import java.util.Scanner;

public class bai_1 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Độ dài mảng");
        int size;
        do {
            size = scanner.nextInt();
        } while (size > 5);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("1. Hiển thị mảng");
        System.out.println("2. Thêm phần tử");
        System.out.println("3. Sửa phần tử");
        System.out.println("4. Exit");
        while (true) {
            int menu = scanner.nextInt();
            switch (menu) {
                case 1 -> show();
                case 2 -> push();
                case 3 -> sua();
                case 4 -> System.exit(0);
            }
        }

    }

    public static void show() {
        System.out.println(Arrays.toString(arr));
    }

    public static void push() {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("Phần tử muốn thêm");
        arr1[arr.length] = scanner.nextInt();
        System.out.println(Arrays.toString(arr1));
        arr = arr1;

    }

    public static void sua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vị trí muốn sửa");
        int index = scanner.nextInt();
        System.out.println("Thay bằng");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = number;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
