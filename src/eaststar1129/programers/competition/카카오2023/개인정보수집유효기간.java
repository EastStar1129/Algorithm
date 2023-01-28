package eaststar1129.programers.competition.카카오2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        String[] todayArr = today.split("\\.");
        int tYear = Integer.parseInt(todayArr[0]);
        int tMonth = Integer.parseInt(todayArr[1]);
        int tDate = Integer.parseInt(todayArr[2]);

        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (String term: terms) {
            String[] strArr = term.split(" ");
            map.put(strArr[0], Integer.parseInt(strArr[1]));
        }

        int index=0;
        for (String privacy: privacies) {
            ++index;
            String[] strArr = privacy.split(" ");
            String[] dateArr = strArr[0].split("\\.");

            int month = Integer.parseInt(dateArr[1]) + map.get(strArr[1]);
            int year = Integer.parseInt(dateArr[0]) + (month / 12);
            month %= 12;

            if (month == 0) {
                year--;
                month = 12;
            }

            int date = Integer.parseInt(dateArr[2]);
            if (year > tYear) {
                continue;
            }
            if (year == tYear && month > tMonth) {
                continue;
            }
            if (year == tYear && month == tMonth && date > tDate) {
                continue;
            }
            System.out.println(index);
            list.add(index);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
