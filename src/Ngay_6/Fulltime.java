package Ngay_6;

public class Fulltime extends Nhanvien {
    private int luong;

    public Fulltime() {
    }

    public Fulltime(int luong) {
        this.luong = luong;
    }

    public Fulltime(int id, String name, int age, String address, int luong) {
        super(id, name, age, address);
        this.luong = luong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public void show() {
        System.out.println(getLuong());
    }

    @Override
    public String toString() {
        return super.toString() +
                "luong=" + luong;
    }
}
