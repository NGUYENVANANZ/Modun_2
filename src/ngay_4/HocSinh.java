package ngay_4;

public class HocSinh {
    String name;
    String lop;
    int masinhvien;
    int toan;
    int ly;
    int hoa;

    public HocSinh(String name, String lop, int masinhvien, int toan, int ly, int hoa) {
        this.name = name;
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;


    }

    public void inRa() {
        System.out.println(name);
        System.out.println(masinhvien);
        System.out.println(lop);
        System.out.println(toan);
        System.out.println(ly);
        System.out.println(hoa);
    }

}
