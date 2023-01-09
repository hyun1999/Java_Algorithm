package 조건문;

import java.util.Scanner;

public class no_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        if(m<45){
            m = m+15;
            h--;
            if(h<0){
                h = 23;
            }
        }else{
            m = m-45;
        }
        System.out.println(h);
        System.out.println(m);

    }
}
