package Bronze;

import java.io.*;
import java.util.StringTokenizer;

//1. 처음에는 바구니에 적혀 있는 번호와 같은 번호가 적힌 공이 들어있다.
//2. 바구니 N개, M번 공 바꾸기

// 입력 받기 -> 배열에 숫자 넣기 -> 바꾸기 -> 출력
public class B10813 {
    public static void main(String[] args)throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int array[] = new int[N];

        for(int i=0; i<N; i++){
            array[i]=i+1;
        }

        for(int j=0; j<M; j++){
            st=new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            int temp = array[I-1];
            array[I-1]=array[J-1];
            array[J-1]=temp;
        }

        for(int m=0; m<N; m++){
            bw.write(array[m]+ " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}