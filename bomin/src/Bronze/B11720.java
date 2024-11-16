package Bronze;

//N개의 숫자. 모두 합해서 출력하는 프로그램
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] str = br.readLine().split("");
        br.close();

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}