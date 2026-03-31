import java.util.PriorityQueue;

public class Solution {
    static public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pQ.add(scoville[i]);
        }

        while (pQ.peek() < K) {
            if (pQ.size() == 1) {
                answer = -1;
                return answer;
            }
            int min = pQ.poll();
            int minNext = pQ.poll();

            int newFood = min + (minNext * 2);

            pQ.add(newFood);

            answer++;
        }

        return answer;
    }
}
