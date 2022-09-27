package Ngay_9.Bai_5;

public class TriangleClassifier {
    public static String Triangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && a == c) {
                return "Đều";
            } else if (a == b || a == c) {
                return "Cân";
            } else return "Thường";
        } else return "Sai";
    }
}
