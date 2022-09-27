package Ngay_6.Bai_7;

import Ngay_6.Bai_7.Nhanvien;

public class Parttime extends Nhanvien {
    private int soNgay;

    public Parttime() {
    }

    public Parttime(int soNgay) {
        this.soNgay = soNgay;
    }

    public Parttime(int id, String name, int age, String address, int soNgay) {
        super(id, name, age, address);
        this.soNgay = soNgay;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void show() {
        System.out.println(getSoNgay() * 120000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "soNgay=" + soNgay;
    }
}
