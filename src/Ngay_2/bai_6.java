package Ngay_2;



public class bai_6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <=1000 ; i++){
            boolean check = true;
            if(count == 20){
                break;
            }
                for (int j = 2; j < i; j++){
                    if (i%j == 0){
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.println(i);
                    count++;
                }

            }

    }
}
