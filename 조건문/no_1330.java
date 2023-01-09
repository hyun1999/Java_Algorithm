package 조건문;

import java.util.Scanner;

public class no_1330 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
    
        String C = (A>B) ? ">": (A<B) ? "<":"=="; //삼항 연산자
        System.out.println(C);
    }
}
