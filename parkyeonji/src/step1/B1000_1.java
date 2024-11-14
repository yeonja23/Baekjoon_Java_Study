package step1;

import java.util.Scanner;

// 1000
public class B1000_1 {
    public static void main(String[] args) {
        // Scanner 사용
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print(A+B);

        scanner.close();
    }
}
