package 정렬;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
//정렬 
public class no_2751 {	
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}

}