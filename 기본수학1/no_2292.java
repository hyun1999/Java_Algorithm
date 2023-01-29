package 기본수학1;

import java.util.Scanner;

public class no_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int count = 1;
        int range = 2;

        if(num==1){
            System.out.println(1);
        }
        else{
            while(range<=num){
                range = range+(6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
// 1: 0번     
// 2~7: 1번
// 8~19: 2번
// 20~37: 3번
// 38~61: 4번
// 62~70: 5번
//left = 6씩 증가
//right = 6씩 증가 