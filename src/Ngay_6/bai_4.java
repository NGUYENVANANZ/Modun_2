package Ngay_6;

public class bai_4 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,5);
        System.out.println(point2D);

        Point3D point3D = new Point3D( point2D.getX(), point2D.getY(), 10);
        System.out.println(point3D);
    }
}
