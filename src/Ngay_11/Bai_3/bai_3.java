package Ngay_11.Bai_3;

import java.util.Stack;

public class bai_3 {
    public static void main(String[] args) {
        Stack<Integer> test = new Stack<>();
        int[] a = {
                1,2,3,4,5,6,7,8
        };
        for (int j : a) {
            System.out.println(test.push(j));
        }
        System.out.println();
        System.out.println(test.size());
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(test.pop());
        }



    }
}
