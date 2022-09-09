package Ngay_5;

public class bai_3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Area(circle.getRadius());
        System.out.println(circle.toString());
        Circle circle1 = new Circle(10, "black");
        circle1.setRadius(10);
        circle1.Area(circle1.getRadius());
        System.out.println(circle1.toString());
    }
}
