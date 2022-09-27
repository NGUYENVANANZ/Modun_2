package Ngay_13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(8);
        number.add(14);
        number.add(9);
        number.add(53);
        number.add(7);

        int min;
        int index;
        for (int i = 0; i < number.size()-1; i++) {
            min = number.get(i);
            index = i;
            for (int j = i + 1; j < number.size(); j++) {
                if (min > number.get(j)) {
                    min = number.get(j);
                    index = j;
                }

            }
            if (index != i) {
                int c = number.get(i);
                number.set(i, min);
                number.set(index, c);
            }
        }
        for (Integer x : number) {
            System.out.println(x);
        }
    }
}


