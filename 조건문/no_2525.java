package 조건문;

import java.util.Scanner;

public class no_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();
        int hplus = (m+t)/60;
        m = (m+t)%60;
        h = h + hplus;
        h = (h>=24) ? h-24:h;
        System.out.println(h);
        System.out.println(m);
    }
}
