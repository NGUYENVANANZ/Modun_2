package Ngay_2;

public class text {
    public static void main(String[] args) {

        for (int i = 1; i < 6; ++i) {
            for (int j = 1; j < 6 - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k != 2 * i - 1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
