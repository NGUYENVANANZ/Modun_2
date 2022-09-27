package Ngay_6.Bai_7;

import java.util.Scanner;

public class Nhanvien {
    private int id;
    private String name;
    private int age;
    private String address;

    public Nhanvien() {
    }

    public Nhanvien(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show() {
        System.out.println("full hay part");
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
