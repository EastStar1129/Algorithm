package eaststar1129.programers.lv2.y2022.m12.date20221227;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        for (int i=1;;++i) {
             if (progresses[index] + (speeds[index] * i) >= 100) {
                 int count = 0;
                 while (index != progresses.length && progresses[index] + (speeds[index] * i) >= 100) {
                     ++index;
                     ++count;
                 }
                 queue.add(count);
             };

             if (index == progresses.length) {
                 break;
             }
        }

        return Arrays
                .stream(queue.stream()
                .toArray(Integer[]::new))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
