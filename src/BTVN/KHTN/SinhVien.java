package BTVN.KHTN;

public class SinhVien {
    private String hoTen;
    private String mSV;
    private int nam_Sinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String mSV, int nam_Sinh) {
        this.hoTen = hoTen;
        this.mSV = mSV;

        this.nam_Sinh = nam_Sinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }


    public int getNam_Sinh() {
        return nam_Sinh;
    }

    public void setNam_Sinh(int nam_Sinh) {
        this.nam_Sinh = nam_Sinh;
    }

    @Override
    public String toString() {
        return "Mã Sinh Viên: " + mSV +
                ", Họ Và Tên:  " + hoTen +
                ", Sinh Năm: " + nam_Sinh
                ;
    }
}
