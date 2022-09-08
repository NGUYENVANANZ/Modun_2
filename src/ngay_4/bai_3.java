package ngay_4;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:");
        double b = scanner.nextDouble();
        System.out.print("Nhập c:");
        double c = scanner.nextDouble();
        PTBacHai ptBacHai = new PTBacHai(a,b,c);
        ptBacHai.tinh_PT();
    }
}
