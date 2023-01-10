package 반복문;

import java.util.Scanner;

public class no_1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int finish = num;
        int left,right;
        int count = 0;
        
        if(finish<10){
            left=0;
            right=finish;
        }
        else{
            left= finish/10;
            right = finish%10;
        }
        count++;
        finish = right*10+(left+right)%10;
        
        while(num != finish){
            if(finish<10){
                left=0;
                right=finish;
            }
            else{
                left= finish/10;
                right = finish%10;
            }
            count++;
            finish = right*10+(left+right)%10;
        }
        System.out.println(count);
    }
}
