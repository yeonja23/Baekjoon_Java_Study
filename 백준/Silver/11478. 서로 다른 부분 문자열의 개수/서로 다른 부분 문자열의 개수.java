import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<String> set = new HashSet<>();

        String str = br.readLine();
        String tmp = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                tmp += str.charAt(j) + "";
                set.add(tmp);
            }
            tmp = "";
        }

        sb.append(set.size());

        System.out.println(sb);
    }
}
