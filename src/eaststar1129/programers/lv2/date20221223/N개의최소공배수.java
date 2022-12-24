package eaststar1129.programers.lv2.date20221223;

import java.util.*;
import java.util.stream.Stream;

public class N개의최소공배수 {

    public int solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(arr)
                .forEach(a -> divisors(map, a));

        int answer = 1;
        for (var a : map.entrySet()) {
            answer *= Math.pow(a.getKey(), a.getValue());
        }
        return answer;
    }

    public void divisors(Map<Integer, Integer> map, int a) {
        int i = 2;
        int count = 0;
        while (a >= i) {
            if (a % i == 0) {
                ++count;
                a/=i;
            } else {
                if (count != 0 && (map.get(i) == null || map.get(i) < count)) {
                    map.put(i, count);
                }
                ++i;
                count = 0;
            }
        }
        if (count != 0 && (map.get(i) == null || map.get(i) < count)) {
            map.put(i, count);
        }
    }

    /**
     * gcd : 유클리드 호제법을 이용한 최대공약수 구하기
     * @param num
     * @return
     */
    public long nlcm(int[] num) {
        long answer = 1;
        for (int i = 0; i < num.length; i++) {
            long g = gcd(num[i], answer);
            answer = num[i] * answer / g;
        }
        return answer;
    }

    // 최대공약수
    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

/**
 * 전재 자체가 틀렸음
 * 2와 8의 최소공배수는 8임.
 * 약수들의 곱은 2만 존재하므로 2가 나옴.
 * **/
//    public int solution(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//
//        Arrays.stream(arr)
//                .forEach(a -> divisors(set, a));
//
//        return set.stream().reduce(1, (a, b) -> a * b);
//    }
//
//    public void divisors(Set<Integer> set, int number) {
//        for (int i=2;i<=number;++i) {
//            if (number % i == 0) {
//                System.out.println(number + " " + i);
//                set.add(i);
//                number /= i;
//                i=1;
//            }
//        }
//    }

    public static void main(String[] args) {
        int [] arr = {2,6,8,14};
        System.out.println(new N개의최소공배수().solution(arr));
    }
}
