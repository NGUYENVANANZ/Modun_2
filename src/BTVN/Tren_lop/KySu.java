package BTVN.Tren_lop;

public class KySu extends CanBo {
    private String ngAnhdaoTao;

    public KySu() {
    }

    public KySu(String ngAnhdaoTao) {
        this.ngAnhdaoTao = ngAnhdaoTao;
    }

    public KySu(String name, String bith, String sex, String address, String ngAnhdaoTao) {
        super(name, bith, sex, address);
        this.ngAnhdaoTao = ngAnhdaoTao;
    }

    public String getNgAnhdaoTao() {
        return ngAnhdaoTao;
    }

    public void setNgAnhdaoTao(String ngAnhdaoTao) {
        this.ngAnhdaoTao = ngAnhdaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "ngAnhdaoTao: " + ngAnhdaoTao;
    }
}
