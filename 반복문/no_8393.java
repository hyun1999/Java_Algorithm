package 반복문;

import java.util.Scanner;

public class no_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int sum = 0;

        for(int i = value; i>0; i--){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
