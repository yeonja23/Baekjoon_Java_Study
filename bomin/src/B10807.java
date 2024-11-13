import java.util.Scanner;

public class B10807 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i]= sc.nextInt();
        }

        int count = 0;
        int v = sc.nextInt();
        for(int i=0; i<N; i++){
            if(array[i]==v)
                count++;
        }
        System.out.print(count);
    }
}