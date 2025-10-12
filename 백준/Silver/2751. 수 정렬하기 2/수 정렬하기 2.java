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
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + "\n");
        }
        System.out.print(sb);
    }

    static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);           // 전반부 정렬
            mergeSort(arr, q + 1, r);    // 후반부 정렬
            merge(arr, p, q, r);            // 병합
        }
    }

    static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[r - p + 1];

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }
        // 왼쪽 부분 배열이 남은 경우
        while (i <= q) { tmp[t++] = arr[i++]; }
        // 오른쪽 부분 배열이 남은 경우
        while (j <= r) { tmp[t++] = arr[j++]; }

        i = p;
        t = 0;
        // 결과를 arr[]에 저장
        while (i <= r) {
            arr[i++] = tmp[t++];
        }
    }
}
