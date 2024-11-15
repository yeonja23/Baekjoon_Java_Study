package Bronze;

//총 N개의 바구니 , M번 바구니의 순서를 역순으로

import java.io.*;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int array[] = new int[N];

        for(int j=0; j<N; j++){
            array[j]=j+1;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;
            while(I<J){
                int tmp = array[I];
                array[I]=array[J];
                array[J]=tmp;
                I++;
                J--;
            }
        }
        br.close();
        for(int z=0; z<N; z++)
            bw.write(array[z]+ " ");
        bw.flush();
        bw.close();
    }
}