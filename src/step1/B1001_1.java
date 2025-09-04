package step1;

import java.util.Scanner;

// 1001
public class B1001_1 {
    public static void main(String[] args) {
        // Scanner 사용
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print(A-B);

        scanner.close();
    }
}

