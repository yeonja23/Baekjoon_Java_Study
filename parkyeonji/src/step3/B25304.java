package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long x = Long.parseLong(br.readLine());

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            long price = Long.parseLong(st.nextToken());
            long quantity = Long.parseLong(st.nextToken());

            x -= price * quantity;
        }

        if (x == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
