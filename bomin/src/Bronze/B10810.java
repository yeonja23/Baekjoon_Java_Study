package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B10810 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //총 바구니
        int M = Integer.parseInt(st.nextToken()); //공 넣는 수

        int[] array = new int[N];

        for(int i = 0; i<M; i++){
            st =  new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I-1; j<J; j++){
                array[j] = K;
            }
        }

        for(int k=0; k<N; k++){
            bw.write(array[k]+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}