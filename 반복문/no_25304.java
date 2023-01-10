package 반복문;

import java.util.Scanner;

public class no_25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int num = scan.nextInt();
        int total = 0;
        for(int i=0; i<num;i++){
            int cost = scan.nextInt();
            int number = scan.nextInt();
            total = cost*number+total;
        }
        String A = (total == sum) ? "Yes" : "No";
        System.out.println(A);
    }
}
