import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int stars;
        int spaces;

        for (int i = 1; i <= 2 * n - 1; i++) {
            if( i <= n ) {
                stars = 2 * i - 1;
                spaces = n - i;
            } else {
                stars = 2 * (2 * n - i) - 1;
                spaces = i - n;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
