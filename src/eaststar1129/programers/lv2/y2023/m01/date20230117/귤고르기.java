package eaststar1129.programers.lv2.y2023.m01.date20230117;

import java.util.*;

public class 귤고르기 {

     public int solution(int k, int[] tangerine) {
          int answer = 0;
          Map<Integer, Integer> map = new HashMap<>();

          for (int number : tangerine) {
               if (Objects.isNull(map.get(number))) {
                    map.put(number, 1);
               } else {
                    map.put(number, map.get(number) + 1);
               }
          }
          List<Integer> list = new ArrayList<>(map.values());
          list.sort((n1, n2) -> n2 - n1);
          int sum = 0;
          for (int number : list) {
               sum += number;
               ++answer;

               if (sum >= k) {
                    break;
               }
          }

          return answer;
     }

     public static void main(String[] args) {
          int k= 6;
          int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
          System.out.println(new 귤고르기().solution(k, arr));
     }
}
