import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = List.of(1,1,2,2,2,8);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        List<Integer> finalList = new ArrayList<>();
        for(int i = 0; i<6; i++){
            list2.add(i,scan.nextInt());
        }
        for(int j=0; j<6;j++){
            int L1 = list.get(j);
            int L2 = list2.get(j);
            finalList.add(L1-L2);
        }
        for(int i = 0; i<6;i++){
            System.out.println(finalList.get(i).intValue());
        }
    }
}
