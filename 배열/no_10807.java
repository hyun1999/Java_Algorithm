package 배열;

import java.util.Scanner;

public class no_10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[T];
        for(int i=0;i<T;i++){
            arr[i] = scan.nextInt();
            
        }   
        int count = 0;
        int value = scan.nextInt();
        for(int i=0;i<T;i++){
            if(arr[i] == value){
                count++;
            }
        }
        System.out.println(count);
    }
}
