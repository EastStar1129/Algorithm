package eaststar1129.programers.competition.카카오2022인턴십;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i=0;i<survey.length;i++) {
            if (choices[i] == 4) {
                continue;
            }

            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);

            int temp = function(c1, c2, choices[i]);
            if (temp > 0) {
                map.put(c1, map.get(c1) + temp);
            }
            if (temp < 0) {
                map.put(c2, map.get(c2) + (temp * -1));
            }
        }

        for (char c : map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }

        answer += map.get('R') >= map.get('T') ? "R" : "T";
        answer += map.get('C') >= map.get('F') ? "C" : "F";
        answer += map.get('J') >= map.get('M') ? "J" : "M";
        answer += map.get('A') >= map.get('N') ? "A" : "N";

        return answer;
    }

    public int function(char c1, char c2, int choice) {
        if (choice == 1)
            return 3;
        if (choice == 2)
            return 2;
        if (choice == 3)
            return 1;
        if (choice == 5)
            return -1;
        if (choice == 6)
            return -2;
        if (choice == 7)
            return -3;
        return 0;
    }

    public static void main(String[] args) {
        String[] str = {"AN", "CF", "MJ", "RT", "NA"};
        int[] i = {5, 3, 2, 7, 5};
        new 성격유형검사하기().solution(str, i);
    }
}
