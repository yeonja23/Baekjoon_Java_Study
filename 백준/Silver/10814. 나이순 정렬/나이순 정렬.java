import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        list.sort((a, b) -> a.age -b.age);

        StringBuilder sb = new StringBuilder();
        for(Member m : list) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }

        System.out.println(sb);
    }
}
