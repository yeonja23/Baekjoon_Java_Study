package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = "";

        for (int i = 0; i < n/4; i++) {
            str += "long ";
        }

        System.out.println(str + "int");
    }
}
