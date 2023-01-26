package 문자열;

import java.util.Scanner;

public class no_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i=0;i<T;i++){
            int repeat = scan.nextInt();
            String str = scan.next();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<repeat;k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }    
}
