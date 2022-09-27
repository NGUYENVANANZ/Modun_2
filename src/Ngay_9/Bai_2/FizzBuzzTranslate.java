package Ngay_9.Bai_2;

public class FizzBuzzTranslate {
    public static String traslate(int number){
        boolean check_1 = number%3 == 0;
        boolean check_2 = number%5 == 0;
        if (check_1 && check_2){
            return "FizzBuzz";
        }else if (check_1){
            return "Fizz";
        }else if (check_2){
            return "Buzz";
        }else return ""+number;
    }
}
