package BTVN.Tren_lop;

public class NhanVien extends CanBo{
    private String jobInformation;

    public NhanVien() {
    }

    public NhanVien(String jobInformation) {
        this.jobInformation = jobInformation;
    }

    public NhanVien(String name, String bith, String sex, String address, String jobInformation) {
        super(name, bith, sex, address);
        this.jobInformation = jobInformation;
    }

    public String getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(String jobInformation) {
        this.jobInformation = jobInformation;
    }

    @Override
    public String toString() {
        return super.toString() + "jobInformation: " + jobInformation;
    }
}