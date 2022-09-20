package BTVN.Tren_lop;

public class CanBo {
    private String name;
    private String birth;
    private String sex;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String birth, String sex, String address) {
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: " + name +  ", birth: " + birth +  ", sex: " + sex +  ", address: " + address + " ";
    }
}
