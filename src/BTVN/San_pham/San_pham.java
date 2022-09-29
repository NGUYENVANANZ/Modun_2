package BTVN.San_pham;

public class San_pham {
    private String mS;
    private String name;
    private double gia;
    private int soLuong;
    private String moTa;

    public San_pham() {
    }

    public San_pham(String mS, String name, double gia, int soLuong, String moTa) {
        this.mS = mS;
        this.name = name;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getmS() {
        return mS;
    }

    public void setmS(String mS) {
        this.mS = mS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return  mS + "," + name + "," + gia + "," + soLuong + "," + moTa;
    }
}
