package BTVN.KHTN;

public class TheMuon extends SinhVien {
    private int so_Phieu_Muon, soNgayDuocMuon, ngay_Muon, thang_Muon, nam_Muon;
    private String ma_SAch;

    public TheMuon() {
    }


    public TheMuon(int so_Phieu_Muon, int ngay_Muon, int thang_Muon, int nam_Muon, int han_Tra, String ma_SAch) {
        this.so_Phieu_Muon = so_Phieu_Muon;
        this.soNgayDuocMuon = han_Tra;
        this.ngay_Muon = ngay_Muon;
        this.thang_Muon = thang_Muon;
        this.nam_Muon = nam_Muon;
        this.ma_SAch = ma_SAch;
    }

    public TheMuon(String hoTen, String mSV, int nam_Sinh, int so_Phieu_Muon, int ngay_Muon, int thang_Muon, int nam_Muon, int han_Tra, String ma_SAch) {
        super(hoTen, mSV, nam_Sinh);
        this.so_Phieu_Muon = so_Phieu_Muon;
        this.soNgayDuocMuon = han_Tra;
        this.ngay_Muon = ngay_Muon;
        this.thang_Muon = thang_Muon;
        this.nam_Muon = nam_Muon;
        this.ma_SAch = ma_SAch;
    }

    public int getSo_Phieu_Muon() {
        return so_Phieu_Muon;
    }

    public void setSo_Phieu_Muon(int so_Phieu_Muon) {
        this.so_Phieu_Muon = so_Phieu_Muon;
    }

    public int getSoNgayDuocMuon() {
        return soNgayDuocMuon;
    }

    public void setSoNgayDuocMuon(int soNgayDuocMuon) {
        this.soNgayDuocMuon = soNgayDuocMuon;
    }

    public int getNgay_Muon() {
        return ngay_Muon;
    }

    public void setNgay_Muon(int ngay_Muon) {
        this.ngay_Muon = ngay_Muon;
    }

    public int getThang_Muon() {
        return thang_Muon;
    }

    public void setThang_Muon(int thang_Muon) {
        this.thang_Muon = thang_Muon;
    }

    public int getNam_Muon() {
        return nam_Muon;
    }

    public void setNam_Muon(int nam_Muon) {
        this.nam_Muon = nam_Muon;
    }


    public String getMa_SAch() {
        return ma_SAch;
    }

    public void setMa_SAch(String ma_SAch) {
        this.ma_SAch = ma_SAch;
    }


}
