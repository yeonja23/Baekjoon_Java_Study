package Bronze;
import java.io.*;
import java.util.StringTokenizer;

//30명 입력 받기 -> if문으로 배열에 없는 애들 걸러내기 -> 작은애부터 출력
public class B5597 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int array[] = new int[30];

        for(int i=0; i<28; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            array[n-1]=1;
        }

        for(int j=0; j<30; j++){
            if(array[j]==0)
                bw.write(j+1+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}