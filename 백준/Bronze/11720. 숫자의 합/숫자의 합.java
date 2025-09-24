import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split("");
        int sum = Arrays.stream(num)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.print(sum);
    }
}
