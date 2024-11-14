package Bronze;

import java.io.*;
import java.util.HashSet;

public class B3052 {
    public static void main(String[] args)throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        bw.write(String.valueOf(hs.size()));
        br.close();
        bw.flush();
        bw.close();
    }
}