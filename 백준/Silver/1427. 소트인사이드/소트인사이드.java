import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        quickSort(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.print(sb);

    }
    static void quickSort(int[] arr, int p, int r) {
        int q; // 분할 지점
        if (p < r) {
            q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
    }

    // 내림차순
    static int partition(int[] arr, int p, int r) {
        int x = arr[r];     // 기준원소
        int i = p - 1;      // 1구역의 끝 지점
        int temp;
        for (int j = p; j < r; j++) {
            if (arr[j] > x) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return i + 1;
    }
}
