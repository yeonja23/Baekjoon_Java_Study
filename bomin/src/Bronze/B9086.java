package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열 입력 -> 첫글자와 마지막 글자 출력
public class B9086 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String s = br.readLine();
            char first = s.charAt(0);
            char last = s.charAt(s.length()-1);
            System.out.println(first+last);
        }
    }
}
