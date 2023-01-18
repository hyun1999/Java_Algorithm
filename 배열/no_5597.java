package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class no_5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i = 0; i<28; i++){
            int a = scan.nextInt();
            arr[a-1] = a;
        }
        for(int j = 0; j<30;j++){
            if(arr[j]==0){
                System.out.println(j+1);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
