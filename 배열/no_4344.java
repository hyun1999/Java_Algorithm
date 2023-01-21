package 배열;

import java.util.Scanner;

public class no_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i = 0;i<test;i++){
            int people = scan.nextInt();
            int arr[] = new int[people];
            double sum = 0;
            double highNum = 0;
            for(int j = 0; j<people;j++){
                arr[j] = scan.nextInt();
                sum += arr[j];
            }
            sum = sum/people;
            for(int k = 0; k<people;k++){
                if(arr[k]>sum){
                    highNum++;
                }
            }
            sum = Math.round(highNum*100000/people);
            System.out.printf("%.3f%%\n",sum/1000);
        }
    }
}
