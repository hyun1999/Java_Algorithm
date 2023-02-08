package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class no_2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int mid = 0;
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int avg = sum/5;
        mid = arr[2];
        System.out.println(avg+"\n"+mid);
    }
}
