package BTVN.Tren_lop;

public class CongNhan extends CanBo {
    private double bac;

    public CongNhan() {
    }

    public CongNhan(double bac) {
        this.bac = bac;
    }

    public CongNhan(String name, String bith, String sex, String address, double bac) {
        super(name, bith, sex, address);
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "bac: " + bac;
    }
}
