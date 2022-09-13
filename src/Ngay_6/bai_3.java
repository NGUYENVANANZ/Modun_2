package Ngay_6;

public class bai_3 {
    public static void main(String[] args) {
        Circle_1 circle_1 = new Circle_1();
        circle_1.setRadius(10);
        System.out.println(circle_1.getArea());

        Cylinder cylinder = new Cylinder(circle_1.getRadius(), circle_1.getColor(), 10);
        System.out.println(cylinder.getArea());
    }
}
