package 문자열;

import java.util.Scanner;

public class no_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i] = -1;
        }
        int len = str.length();
        for(int i=0;i<len;i++){
            int index = str.charAt(i)-97;
            if(arr[index]==-1){
                arr[index] = i;
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(arr[i]);
        }
    }
}
