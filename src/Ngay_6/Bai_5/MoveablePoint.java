package Ngay_6.Bai_5;

public class MoveablePoint extends Point {
    private double xSpeed = 0;
    private double ySpeed = 0;


    public MoveablePoint() {
    }


    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setspeed(double xSpeed,double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getXY(){
        double[] ar = { xSpeed, ySpeed};
        return ar;
    }

    @Override
    public String toString() {
        return super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed ;
    }

    public Point move(){
        setX(getX() + xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }
}
