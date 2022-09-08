package Ngay_2;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tiền vay: ");
         double money = input.nextDouble();
        System.out.println("Số tháng: ");
         int month = input.nextInt();
        System.out.println("Lãi suất: ");
         double interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i =0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Số tiền lãi: " + totalInterest);
    }
}
