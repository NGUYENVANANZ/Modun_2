package BTVN;

public class HSHocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private int kyHoc;

    public HSHocSinh() {
    }

    public HSHocSinh(String lop, String khoaHoc, int kyHoc) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public HSHocSinh(String name, int age, String address, String lop, String khoaHoc, int kyHoc) {
        super(name, age, address);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "lop=" + lop +
                ", khoaHoc='" + khoaHoc+
                ", kyHoc=" + kyHoc ;
    }
}
