package Ngay_2;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int c;
        if ( a < b){
            c = a;
            a = b;
            b = c;
        }
        for (int i = a; i > 0 ; i--){
            if (a % i == 0){
                if( b % i == 0){
                    System.out.println("Ước chung lớn nhất là: " + i);
                    break;
                }
            }
        }
    }
}
