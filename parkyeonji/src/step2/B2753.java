package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long a = Long.parseLong(br.readLine());

        if ((a % 4) == 0) {
            if ((a%400)==0){
                System.out.print(1);
            } else if ((a%100)==0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        } else {
            System.out.print(0);
        }
    }
}
