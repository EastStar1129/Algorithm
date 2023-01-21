package eaststar1129.programers.lv2.y2023.m01.date20230121;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {

    public int solution(int[] elements) {
        int answer = 0;

        Set<Long> set = new HashSet<>();
        for (int i=1;i<=elements.length;i++) {
            for (int j=0;j<elements.length;j++) {
                long sum = 0L;
                for (int k=0;k<i;k++) {
                    int index = (j + k) % elements.length;
                    sum += elements[index];
                }
                System.out.println(sum);
                set.add(sum);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {7,9,1,1,4};
        new 연속부분수열합의개수().solution(arr);
    }
}
