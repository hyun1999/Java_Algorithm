package 배열;

import java.util.Scanner;

public class no_2738 {
    public static Scanner scan = new Scanner(System.in);
    public static int N = scan.nextInt();
    public static int M = scan.nextInt();
    public static void main(String[] args) {
        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        for(int i = 0; i<N;i++){
            for(int j = 0; j<M;j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i<N;i++){
            for(int j = 0; j<M;j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i<N;i++){
            for(int j = 0; j<M;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
