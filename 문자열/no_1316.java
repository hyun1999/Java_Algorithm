package 문자열;

import java.util.Scanner;

public class no_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int correctNum = 0;
        int[] arr = new int[26];

        for(int i=0;i<T;i++){   //입력 문자 횟수
            for(int z=0;z<26;z++){
                arr[z]=0;
            }   // 배열 초기화
            boolean bool = true;
            String str = scan.next();
            for(int j=0;j<str.length();j++){    //입력 string 길이
                if(arr[str.charAt(j)-'a']==0){  //알파벳이 한번도 안들어왔던 경우
                    arr[str.charAt(j)-'a'] += 1; //arr에 +1해줌
                    // System.out.println(str.charAt(j)-'a');
                    
                }
                else{
                    try{
                        if(str.charAt(j-1)==str.charAt(j)){ 
                            continue;                        
                        }
                        else{
                            bool = false;
                        }
                    }catch(Exception e){
                        bool = false;
                    }
                    
                    
                }
                
            }
            if(bool == true){
                correctNum++;
            }
        }
        System.out.println(correctNum);
    }
}
