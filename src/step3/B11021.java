package step3;

import java.io.*;
import java.util.StringTokenizer;

public class B11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long t = Long.parseLong(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
