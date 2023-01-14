package eaststar1129.programers.lv2.y2023.m01.date20230114;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _1차클러스터링 {
    public int solution(String str1, String str2) {
        final int NUMBER_VALUE = 65536;
        int answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i=0;i<str1.length()-1;i++) {
            String substr = str1.substring(i, i+2);
            if (substr.matches("[a-zA-Z]*")) {
                Integer temp = map1.get(substr);
                if (Objects.isNull(temp)) {
                   map1.put(substr, 1);
                } else {
                    map1.put(substr, temp + 1);
                }
            }
        }
        for (int i=0;i<str2.length()-1;i++) {
            String substr = str2.substring(i, i+2);
            if (substr.matches("[a-zA-Z]*")) {
                Integer temp = map2.get(substr);
                if (Objects.isNull(temp)) {
                    map2.put(substr, 1);
                } else {
                    map2.put(substr, temp + 1);
                }
            }
        }

        int union = 0;
        int intersection = 0;
        for (String key : map1.keySet()) {
            Integer temp = map2.get(key);
            if (Objects.isNull(temp)) {
                union += map1.get(key);
            } else {
                union += map1.get(key) > temp ? map1.get(key) : temp;
                intersection += map1.get(key) < temp ? map1.get(key) : temp;
            }
        }

        for (String key : map2.keySet()) {
            Integer temp = map1.get(key);
            if (Objects.isNull(map1.get(key))) {
                union += map2.get(key);
            }
        }

        if (union == 0) {
            return NUMBER_VALUE;
        }
        return NUMBER_VALUE * intersection / union;
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(new _1차클러스터링().solution(str1, str2));
    }
}
