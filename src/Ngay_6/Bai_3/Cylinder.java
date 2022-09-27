package Ngay_6.Bai_3;

import Ngay_6.Bai_3.Circle_1;

public class Cylinder extends Circle_1 {
    private double hight;

    public Cylinder() {
        super();
    }

    public Cylinder(double hight) {
        super();
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return super.getArea() * hight;
    }
}
