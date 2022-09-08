package Ngay_1;

import java.util.Scanner;

public class bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int sc = scanner.nextInt();
        int a = sc / 100;
        int b = (sc % 100) / 10;
        int c = sc % 10;
        String name = "";
        String name_1 = "";
        String name_2 = "";
        switch (a) {
            case 0:
                name = " ";
                break;
            case 1:
                name = "one hundred";
                break;
            case 2:
                name = "two hundred";
                break;
            case 3:
                name = "three  hundred";
                break;
            case 4:
                name = "four  hundred";
                break;
            case 5:
                name = "five  hundred";
                break;
            case 6:
                name = "six  hundred";
                break;
            case 7:
                name = "seven  hundred";
                break;
            case 8:
                name = "eight  hundred";
                break;
            case 9:
                name = "nine  hundred";
                break;
        }
        switch (b) {
            case 2:
                name_1 = "Twenty";
                break;
            case 3:
                name_1 = "thirty";
                break;
            case 4:
                name_1 = "forty";
                break;
            case 5:
                name_1 = "fifty";
                break;
            case 6:
                name_1 = "sixty";
                break;
            case 7:
                name_1 = "seventy";
                break;
            case 8:
                name_1 = "eighty";
                break;
            case 9:
                name_1 = "ninety";
                break;
        }
        if(b == 1){
            switch (c) {
                case 0:
                    name_2 = "Ten";
                    break;
                case 1:
                    name_2 = "Eleven";
                    break;
                case 2:
                    name_2 = "Twelve";
                    break;
                case 3:
                    name_2 = "thirteen";
                    break;
                case 4:
                    name_2 = "fourteen";
                    break;
                case 5:
                    name_2 = "fifteen";
                    break;
                case 6:
                    name_2 = "sixteen";
                    break;
                case 7:
                    name_2 = "seventeen";
                    break;
                case 8:
                    name_2 = "eighteen";
                    break;
                case 9:
                    name_2 = "nineteen";
                    break;
            }
        }else {
            switch (c) {
                case 1:
                    name_2 = "one";
                    break;
                case 2:
                    name_2 = "two";
                    break;
                case 3:
                    name_2 = "three";
                    break;
                case 4:
                    name_2 = "four";
                    break;
                case 5:
                    name_2 = "five";
                    break;
                case 6:
                    name_2 = "six";
                    break;
                case 7:
                    name_2 = "seven";
                    break;
                case 8:
                    name_2 = "eight";
                    break;
                case 9:
                    name_2 = "nine";
                    break;
            }
        }

            if(sc == 0){
             System.out.println("zero");
             }else if (0 < sc && sc < 10) {
                 System.out.println(name_2);
             } else if (10 <= sc && sc < 20) {
                 System.out.println(name_2);
             } else if (20 < sc && sc < 100) {
                 System.out.println(name_1 + " " + name_2);
             } else  if(100 <= sc && sc<= 999){
                 System.out.println(name + " " + name_1 + " " + name_2);
             }


    }

}
