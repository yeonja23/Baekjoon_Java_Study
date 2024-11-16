package Bronze;

import java.io.*;

//단어 S, 정수 i번째 출력
public class B27866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine())-1;

        br.close();
        System.out.print(S.charAt(i));
    }
}
