package 배열;

import java.util.Scanner;

public class no_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int arr[] = new int[T];
        arr[0] = scan.nextInt();
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<T;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println(min);
        System.out.println(max);
        
    }
}
