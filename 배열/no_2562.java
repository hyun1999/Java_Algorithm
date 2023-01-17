package 배열;

import java.util.Scanner;

public class no_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        arr[0] = scan.nextInt();
        int max = arr[0];
        int index = 0;
        for(int i = 1; i<9;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max){
                max =arr[i];
                index = i;
            }
        }   
        System.out.println(max);
        System.out.println(index + 1);
    }
}
