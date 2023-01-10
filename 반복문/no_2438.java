package 반복문;

import java.util.Scanner;

public class no_2438 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for(int i = 1;i<value+1;i++){
            for(int j = 1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
