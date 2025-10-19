import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        arr = countingSort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }

    static int[] countingSort(int[] arr) {
        int max = 10000;
        int[] count = new int[max + 1];
        int[] result = new int[arr.length];
        // 원소 개수 카운트
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // 누적합 구하기
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // 뒤에서부터 결과에 배치
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        return result;
    }
}
