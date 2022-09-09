package ngay_4;

public class bai_5 {
    public static void main(String[] args) {
        Fan a = new Fan();
        a.setSpeed(a.getFAST());
        a.setRadius(10);
        a.setColor("yellow");
        a.setFan(true);
        String str = a.toString();
        System.out.println(str);

        Fan b = new Fan();
        b.setSpeed(b.getMEDIUM());
        b.setRadius(5);
        b.setColor("blue");
         str = b.toString();
        System.out.println(str);

    }
}
