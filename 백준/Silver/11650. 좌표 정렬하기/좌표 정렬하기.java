import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        // 좌표 저장
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }

        // 힙 정렬 수행
        heapSort(arr);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        System.out.print(sb);
    }

    // 힙 정렬
    static void heapSort(int[][] arr) {
        int n = arr.length;

        // 1. 최대 힙 구성
        buildHeap(arr, n);

        // 2. 루트(최댓값) ↔ 맨 뒤 교환, 힙 크기 줄이며 반복
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            percolateDown(arr, i, 0); // 힙 크기를 i로 줄이고 다시 heapify
        }
    }

    // 최대 힙 생성
    static void buildHeap(int[][] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            percolateDown(arr, n, i);
        }
    }

    // 힙 성질 복구 (heapify)
    static void percolateDown(int[][] arr, int n, int i) {
        int largest = i;       // 현재 루트
        int left = 2 * i + 1;  // 왼쪽 자식
        int right = 2 * i + 2; // 오른쪽 자식

        if (left < n && compare(arr[left], arr[largest]) > 0)
            largest = left;
        if (right < n && compare(arr[right], arr[largest]) > 0)
            largest = right;

        if (largest != i) {
            swap(arr, i, largest);
            percolateDown(arr, n, largest);
        }
    }

    static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int compare(int[] a, int[] b) {
        if (a[0] != b[0]) return a[0] - b[0];
        return a[1] - b[1];
    }
}
