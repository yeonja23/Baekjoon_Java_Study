package Bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//알파벳 길이 출력
public class B2743 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(s.length());
    }
}
