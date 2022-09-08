package ngay_4;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        stopWatch.end();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
