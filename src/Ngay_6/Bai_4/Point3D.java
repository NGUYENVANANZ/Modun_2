package Ngay_6.Bai_4;

import Ngay_6.Bai_4.Point2D;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "z=" + z +
                super.toString();
    }
}
