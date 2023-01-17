package eaststar1129.programers.lv2.y2023.m01.date20230117;

import java.util.*;

public class 귤고르기 {

     int answer = 0;
     public int solution(int k, int[] tangerine) {
          Map<Integer, Integer> map = new HashMap<>();

          for (int number : tangerine) {
               if (Objects.isNull(map.get(number))) {
                    map.put(number, 1);
               } else {
                    map.put(number, map.get(number) + 1);
               }
          }

          ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
          answer = keyList.size();
          return answer;
     }

     public void dfs(ArrayList<Integer> keyList, int index, Map<Integer, Integer> map, int k, int sum, int count) {
          if (sum == k) {
               answer = answer > count ? count : answer;
          }
          if (sum > k || index == keyList.size()) {
               return;
          }
          dfs(keyList, index + 1, map, k, sum + keyList.get(index), count + 1);
          dfs(keyList, index + 1, map, k, sum, count);
     }

     public static void main(String[] args) {
     }
}
