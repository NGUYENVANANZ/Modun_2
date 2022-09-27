package Ngay_6.Bai_4;

import java.util.Arrays;

public class bai_4 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(5,5);
        System.out.println(Arrays.toString(point2D.getXY()));
//        System.out.println(point2D);

        Point3D point3D = new Point3D( point2D.getX(), point2D.getY(), 10);
        System.out.println(point3D);
    }
}
