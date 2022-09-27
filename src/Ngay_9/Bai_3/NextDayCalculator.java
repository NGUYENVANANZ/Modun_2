package Ngay_9.Bai_3;

public class NextDayCalculator {
    public static String nextDay(int ngay, int thang,int nam ){
        if(thang == 2){
            if(ngay == 28 || ngay == 29){
                thang++;
                ngay = 1;
            }else {
                ngay++;
            }
        }else  if (thang == 4 ||thang == 6 ||thang == 9 ||thang == 11 ){
            if(ngay == 30){
                thang++;
                ngay = 1;
            }else {
                ngay++;
            }
        } else if (thang == 1 ||thang == 3 ||thang == 5 ||thang == 7 ||thang == 8 ||thang == 10 || thang == 12 ){
            if (thang == 12 && ngay == 31){
                nam++;
                thang =1;
                ngay = 1;
            }else {
                if(ngay == 31){
                    thang++;
                    ngay = 1;
                }else {
                    ngay++;
                }
            }

        }


return  ngay+"-"+thang+"-"+nam;
    }
}
