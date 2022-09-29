package BTVN.San_pham;

import java.io.*;
import java.util.ArrayList;

public class IOProduct {
    File file = new File("C:\\Users\\admin\\IdeaProjects\\Java_Modun_2\\src\\BTVN\\San_pham\\bean.txt");


    public void write(ArrayList<San_pham> san_phams) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (San_pham x : san_phams) {
                bufferedWriter.write(x.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public ArrayList<San_pham> read(){
        ArrayList<San_pham> san_phams = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");

                 String mS = arr[0];
                 String name = arr[1];
                 double gia = Double.parseDouble(arr[2]);
                int soLuong = Integer.parseInt(arr[3]);
                 String moTa = arr[4];

                San_pham san_pham = new San_pham(mS, name, gia, soLuong, moTa);
                san_phams.add(san_pham);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return san_phams;
    }
}
