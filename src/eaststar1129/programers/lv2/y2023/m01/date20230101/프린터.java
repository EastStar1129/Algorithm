package eaststar1129.programers.lv2.y2023.m01.date20230101;

import java.util.*;

public class 프린터 {

    public int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities){
            priorityQueue.add(priority);
        }

        while(!priorityQueue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)priorityQueue.peek()) {
                    if(i == location){
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr []= {1, 1, 9, 1, 1, 1};
        int loc = 0;
        System.out.println(new 프린터().solution(arr , loc));
    }
}
