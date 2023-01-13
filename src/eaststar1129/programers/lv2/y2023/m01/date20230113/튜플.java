package eaststar1129.programers.lv2.y2023.m01.date20230113;

import java.util.*;

public class 튜플 {
    public int[] solution(String s) {
        Set<Integer> set = new LinkedHashSet<>();
        int[] answer = {};
        ArrayList<String[]> arrayList = new ArrayList<>();
        final String reg = "\\}\\,\\{";

        s = s.substring(2, s.length() - 2);
        String[] arr = s.split(reg);
        for (String ss : arr) {
            arrayList.add(ss.split(","));
        }

        arrayList.sort(Comparator.comparing(aa -> aa.length));

        for(String[] arr2 : arrayList) {
            for (String ss : arr2) {
                set.add(Integer.parseInt(ss));
            }
        }
        answer = new int[set.size()];
        int index = 0;

        for(int num : set) {
            answer[index++] = num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = new 튜플().solution("{{20,111},{111}}");
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
