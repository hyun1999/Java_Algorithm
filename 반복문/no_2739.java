package 반복문;

import java.util.Scanner;

public class no_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for(int i = 1; i<=9;i++){
            System.out.println(value+" * "+i+" = "+value*i);
        }
    }
}
