package Ngay_10;

public class Bai_4 {
    public static void main(String[] args) {
        Test_4 list = new Test_4("dinh");
        list.add(1, "Melinda");
        list.add(2, "kk");
        list.add(3, "22");
        list.addLast("an");
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }
}
