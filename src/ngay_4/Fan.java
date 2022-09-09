package ngay_4;

public class Fan {
    private final int SLOW=1 , MEDIUM=2 , FAST=3;
    private double radius =10;
    private boolean fan = false;
    private String color = "blue";

    private int speed = SLOW;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public Fan(){

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isFan() {
        return fan;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return "Tốc độ :"+ speed+ "Bán kính :"+ radius + "Màu :" +color + "trạng thái" + fan;
    }
}
