package 기본수학1;

import java.util.Scanner;

public class no_1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fix = scan.nextInt();
        int variable = scan.nextInt();
        int cost = scan.nextInt();
        int bp = 0;
        if(cost-variable <= 0){
            bp = -1;
        }
        else{
            bp = fix/(cost-variable);
            bp++;
        }
        System.out.println(bp);
    }
}
