package Ngay_3;

import java.util.Arrays;

public class bai_8 {
    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5};
        int[] y = new int[]{1, 2, 3, 4, 5};
        int[] z = new int[x.length + y.length];
        crush(x, y, z);
        System.out.println(Arrays.toString(z));

    }

    public static void crush(int[] x, int[] y, int[] z) {
        for (int i = 0; i < z.length; i++) {
            if (i < x.length) {
                z[i] = x[i];
            } else {
                z[i] = y[i - x.length];
            }
        }
    }
}
