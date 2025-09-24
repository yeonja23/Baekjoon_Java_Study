import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String[] str = st.nextToken().split("");
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(str[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
