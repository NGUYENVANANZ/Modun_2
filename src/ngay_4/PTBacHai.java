package ngay_4;

public class PTBacHai {
    double a;
    double b;
    double c;

    public PTBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void tinh_PT() {
        double x1;
        double x2;
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("chả có nghiệm");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("PT có nghiệm kép: " + x1);
        } else {
            x1 = (-b + delta) / 2 * a;
            x2 = (-b - delta) / 2 * a;
            System.out.println("PT có 2 nghiệm:" + x1 + "&&" + x2);
        }
    }
}
