package Ngay_2;

public class bai_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 8; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6 ; i++){
            for (int j = 0; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 6 ; i++){
            for (int j = 6; j > i ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5 ; i++){
            for (int k = 5; k >= 0; k--){
                if ( k > i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
