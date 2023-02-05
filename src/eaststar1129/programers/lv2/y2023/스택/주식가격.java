package eaststar1129.programers.lv2.y2023.스택;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        new 주식가격().solution(arr);
    }
}
