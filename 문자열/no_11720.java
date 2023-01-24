package 문자열;

import java.util.Scanner;

public class no_11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String num = scan.next();
        scan.close();

        int sum = 0;

        for(int i =0;i<T;i++){
            sum +=num.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
