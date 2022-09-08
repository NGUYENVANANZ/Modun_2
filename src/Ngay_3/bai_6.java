package Ngay_3;

import java.util.Scanner;

public class bai_6 {
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
        for (int j = 0; j < ac.length; j++) System.out.print(ac[j] + "\t");
        int min = ac[0];
        int index = 1;
        for (int j = 0; j < ac.length; j++) {
            if (ac[j] < min) {
                min = ac[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Min= " + min + " ,at position " + index);
    }
}
