package 배열;

import java.util.Scanner;

public class no_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        double[] arr = new double[T];
        double max = 0;
        double sum = 0;
        for(int i=0;i<T;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<T;i++){
            sum = arr[i]/max*100 + sum;
        }

        System.out.println(sum/T);
    }
}
