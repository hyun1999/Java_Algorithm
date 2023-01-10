package 반복문;

import java.util.Scanner;

public class no_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for(int i = 1;i<=value;i++){
            for(int j = value-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

