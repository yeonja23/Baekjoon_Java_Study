import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        insertionSort(arr, arr.length);

        System.out.print(arr[k - 1]);
    }

    // 내림차순 정렬
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int newItem = arr[i];
            int j = i - 1;
            while (j >= 0 && newItem > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = newItem;
        }
    }
}
