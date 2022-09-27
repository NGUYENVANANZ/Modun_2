package Ngay_5.Bai_3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area(double radius) {
        return area = Math.pow(radius, 2) * Math.PI;
    }

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
