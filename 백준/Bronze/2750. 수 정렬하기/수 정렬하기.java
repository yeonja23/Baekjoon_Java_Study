import java.io.BufferedReader;
import java.io.InputStreamReader;

// 선택 정렬
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int last = arr[i];
            int k = theLargest(arr, i);
            int tmp = arr[k];
            arr[k] = last;
            arr[i] = tmp;
        }
    }

    static int theLargest(int[] arr, int n) {
        int largest = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }
}
