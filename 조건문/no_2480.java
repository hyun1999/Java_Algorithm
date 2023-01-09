package 조건문;

import java.util.Scanner;

public class no_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        int same=0;
        int sameValue = 0;
        
        for(int i=0; i<3;i++){
            arr[i] = scan.nextInt();
        }
        int max=arr[0];

        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(arr[i] == arr[j]){
                    same++;
                    sameValue = arr[i];
                }
                else if(max<arr[j]){
                    max = arr[j];
                }
            }
        }
        
        if(same==0){
            System.out.println(max*100);
        }
        else if(same==1){
            System.out.println(1000+(sameValue*100));
        }
        else{
            System.out.println(10000+(sameValue*1000));
        }
    }
}
