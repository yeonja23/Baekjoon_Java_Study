import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }

        int max = Arrays.stream(count).max().getAsInt();

        int freq = 0;
        int index = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                freq++;
                index = i;
            }
        }

        if (freq > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(index + 'A'));
        }
    }
}
