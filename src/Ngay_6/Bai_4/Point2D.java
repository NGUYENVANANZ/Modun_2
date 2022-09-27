package Ngay_6.Bai_4;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        double[] ar = {
                x, y
        };

        return ar;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y
                ;
    }
}
