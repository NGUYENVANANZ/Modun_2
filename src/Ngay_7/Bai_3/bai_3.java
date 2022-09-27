package Ngay_7.Bai_3;

import Ngay_7.Bai_2.Circle;
import Ngay_7.Bai_2.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class bai_3 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }
    }
}
