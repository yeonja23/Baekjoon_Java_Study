import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] pos = new int[26];
        for (int i = 0; i < pos.length; i++) { pos[i] = -1; }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if (pos[index] == -1) { pos[index] = i; }
        }

        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }
    }
}
