package BTVN.San_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class Quan_ly {
    private final Scanner sc = new Scanner(System.in);
    IOProduct ioProduct = new IOProduct();
    private  ArrayList<San_pham> san_phams = ioProduct.read();


    public ArrayList<San_pham> getSan_phams() {
        return san_phams;
    }
    public  San_pham taoSp() {
        System.out.println("Nhập mã");
        String mS = sc.nextLine();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập giá");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mô tả");
        String moTa = sc.nextLine();
        return new San_pham(mS, name, gia, soLuong, moTa);
    }

    public void show() {
        for (San_pham s : san_phams) {
            System.out.println(s.toString());
        }
        ioProduct.write(san_phams);
    }
    public  void add() {
        San_pham sp = taoSp();
        san_phams.add(sp);
        show();

    }

    public void pop() {
        System.out.println("Bạn muốn xóa");
        String mS = sc.nextLine();
        for (int i = 0; i < san_phams.size(); i++) {
            if (san_phams.get(i).getmS().equals(mS)) {
                san_phams.remove(i);
                break;
            }
        }
    }

    public void edit() {
        System.out.println("Bạn muốn sủa");
        String mS = sc.nextLine();
        for (int i = 0; i < san_phams.size(); i++) {
            if (san_phams.get(i).getmS().equals(mS)) {
                san_phams.set(i, taoSp());
            }
        }
    }

    public void giaLonNhat() {
       double max = san_phams.get(0).getGia();
        for (int i = 1; i < san_phams.size(); i++) {
            if (max < san_phams.get(i).getGia()){
                max = san_phams.get(i).getGia();
            }
        }
        for (San_pham san_pham : san_phams) {
            if (max == san_pham.getGia()) {
                String str = san_pham.toString();
                System.out.println(str);
            }
        }

    }

    public void sapXep() {
        int chon = 2;
        System.out.println("1. Tăng dần");
        System.out.println("2. Giảm dần");
        System.out.println("Chọn");
        do{
            if (chon >2) System.out.println(" Chọn lại");
            chon = Integer.parseInt(sc.nextLine());
        }while (chon > 2);

        switch (chon){
            case 1:
                tangDan();
                break;
            case 2:
                giamDan();
                break;
        }
    }

    public void tangDan(){
        San_pham temp ;
        for (int i = 0 ; i < san_phams.size() - 1; i++) {
            for (int j = i + 1; j < san_phams.size(); j++) {
                if (san_phams.get(i).getGia() > san_phams.get(j).getGia()) {
                    temp = san_phams.get(i);
                    san_phams.set(i, san_phams.get(j));
                    san_phams.set(j, temp) ;
                }
            }
        }
        show();

    }

    public void giamDan(){
        San_pham temp ;
        for (int i = 0 ; i < san_phams.size() - 1; i++) {
            for (int j = i + 1; j < san_phams.size(); j++) {
                if (san_phams.get(i).getGia() < san_phams.get(j).getGia()) {
                    temp = san_phams.get(i);
                    san_phams.set(i, san_phams.get(j));
                    san_phams.set(j, temp) ;
                }
            }
        }
        show();
    }
}
