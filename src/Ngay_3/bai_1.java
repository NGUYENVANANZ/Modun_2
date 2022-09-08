package Ngay_3;

import java.util.Arrays;

public class bai_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 3, 5, 9, 1, 0};

        sort_1(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort_1(int[] arr) {
        int a;
        for (int i = 0; i < arr.length / 2; i++) {
            a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
    }

}
