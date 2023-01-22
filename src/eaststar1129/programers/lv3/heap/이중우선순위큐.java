package eaststar1129.programers.lv3.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class 이중우선순위큐 {

        static final String MAX_POP_STRING = "D 1";
        static final String MIN_POP_STRING = "D -1";
        public int[] solution(String[] operations) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());
            for (String s: operations) {
                if (s.equals(MAX_POP_STRING)) {
                    queue.remove(reverseQueue.poll());
                } else if (s.equals(MIN_POP_STRING)) {
                    reverseQueue.remove(queue.poll());
                } else {
                    int num = Integer.parseInt(s.replaceAll("I ", ""));
                    queue.add(num);
                    reverseQueue.add(num);
                }
            }

            int[] answer = {0, 0};
            answer[0] = reverseQueue.size() == 0 ? 0 : reverseQueue.poll();
            answer[1] = queue.size() == 0 ? 0 : queue.poll();
            return answer;
        }
}
