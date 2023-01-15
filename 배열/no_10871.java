package 배열;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no_10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        List<Integer> small = new ArrayList<Integer>();

        for(int i = 0;i<N;i++){
            int V = scan.nextInt();
            if(X>V){
                small.add(V);
            }
        }
        for(int i = 0; i<small.size();i++){
            System.out.println(small.get(i));
        }


    }
}
