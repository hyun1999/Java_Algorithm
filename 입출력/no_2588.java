import java.util.Scanner;

public class no_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int BB = B;
        int[] ArrB = new int[3];
        for(int i=0; i<3;i++){
            ArrB[i] = BB%10;
            BB = BB/10;
        } // 배열에 역순으로 저장
        for(int i = 0; i<3;i++){
            System.out.println(A*ArrB[i]);
        }
        System.out.println(A*B);
    }
}
