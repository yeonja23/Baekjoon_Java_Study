package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        long H = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long nowMinute = (H*60) + M;

        long C = Long.parseLong(br.readLine());

        long result = nowMinute + C;

        H = result / 60;
        M = result % 60;

        if (H>23) {
            H -= 24;
        }
        System.out.print(H + " " + M);
    }
}
