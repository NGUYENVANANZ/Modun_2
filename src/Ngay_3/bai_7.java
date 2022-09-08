package Ngay_3;

import java.util.Arrays;
import java.util.Scanner;

public class bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[]{1, 2, 3, 4, 5};
        System.out.println("Nhập vị trí");
        int index = scanner.nextInt();
        int[] y = new int[x.length - 1];
        pop(x, index, y);
        System.out.println(Arrays.toString(y));
    }

    public static void pop(int[] x, int index, int[] y) {
        for (int i = 0; i < y.length; i++) {
            if (i < index) {
                y[i] = x[i];
            } else if (i == index) {
                y[i] = 9;
            } else {
                y[i] = x[i - 1];
            }
        }
    }
}
