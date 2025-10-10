import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        int avg = sum / arr.length;
        bubbleSort(arr, arr.length);
        System.out.println(avg);
        System.out.println(arr[arr.length / 2]);

    }
    static void bubbleSort(int[] arr, int n) {
        boolean sorted = false;

        for (int i = n - 1; i > 0; i--) {
            sorted = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted == true) { return; }
        }
    }
}
