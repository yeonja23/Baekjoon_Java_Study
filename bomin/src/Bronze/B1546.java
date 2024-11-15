package Bronze;

import java.io.*;
import java.util.StringTokenizer;

//자기 점수중에 최댓값: M , M/(실제점수)*100, N: 시험 본 과목 개수
public class B1546 {
    public static void main(String[] args)throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double array[] = new double[N];
        double max=0;
        double sum=0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            array[i]= Double.parseDouble(st.nextToken());
            if(array[i]>max)
                max=array[i];
        }

        for(int z=0; z<N; z++)
        {
            array[z]=(array[z]/max)*100;
            sum+=array[z];
        }
        bw.write(String.valueOf(sum/N));

        br.close();
        bw.flush();
        bw.close();
    }
}
