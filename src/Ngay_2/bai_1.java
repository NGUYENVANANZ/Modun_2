package Ngay_2;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Là số nguyên tố!");
        } else {
            System.out.println("Nooooo");
        }
    }
}
