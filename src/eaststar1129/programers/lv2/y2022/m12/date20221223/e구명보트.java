package eaststar1129.programers.lv2.y2022.m12.date20221223;

import java.util.Arrays;

public class e구명보트 {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;
        int max = people.length;

        while (--max >= min) {
            if (people[min] + people[max] <= limit) {
                ++min;
            }
            ++answer;
        }

        return answer;
    }
}
