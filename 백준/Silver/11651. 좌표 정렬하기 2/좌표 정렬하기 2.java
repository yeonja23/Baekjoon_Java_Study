import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0]; // y가 같을 때 x 비교
            return a[1] - b[1];                   // y 기준 비교
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}
