package Ngay_14.Bai_3;

import java.util.Arrays;

public class Bai_3 {
    public static void main(String[] args) {
        int[] number = {
                5,8,1,4,7,3
        };
        Chon(number);
        Chen(number);
        Noi_Bot(number);

    }
    public static void Chon(int[] number){
        int min;
        for (int i = 0; i < number.length-1; i++) {
            min = i;
            for (int j = i+1; j < number.length; j++) {
                if (number[min] > number[j]){
                    int tpm = number[min];
                    number[min] = number[j];
                    number[j] = tpm;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }

    public static void Chen(int[] number){
        for (int i = 1; i < number.length-1; i++) {
            for (int j = i; j > 0; j--) {
                if (number[j] > number[i]){
                    int tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }

    public static void Noi_Bot(int[] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length-1-i; j++) {
                if (number[j] > number[j+1]){
                    int tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(number));
    }
}
