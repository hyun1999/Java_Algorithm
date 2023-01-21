package 배열;

import java.util.Scanner;

public class no_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String str;
        for(int i = 0; i<T;i++){
            str = scan.next();
            int total = 0;
            int plus = 0;
            for(int j = 0; j<str.length();j++){
                if(str.charAt(j) == 'O'){
                    plus++;
                    total += plus;
                }
                else{
                    plus = 0;
                }
            }
            System.out.println(total);
        }
    }
}
