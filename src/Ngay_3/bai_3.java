package Ngay_3;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ac = new int[5];
        int i = 0;
        while (i < ac.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            ac[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        System.out.println();
        System.out.println("Max= " + Max(ac));
    }

    public static int Max(int[] ac) {
        int i = 0;
        while (i < ac.length) {
            System.out.print(ac[i] + "\t");
            i++;
        }
        int max = ac[0];
        int j = 0;
        while (j < ac.length) {
            if (ac[j] > max) {
                max = ac[j];
            }
            j++;
        }
        return max;
    }
}
