package eaststar1129.programers.lv2.date20221223;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N개의최소공배수 {

    public int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        set.add(1);

        Arrays.stream(arr)
                .forEach(a -> divisors(set, a));

        return set.stream().reduce(1, (a, b) -> a * b);
    }

    public void divisors(Set<Integer> set, int number) {
        for (int i=2;i<=number;++i) {
            if (number % i == 0) {
                set.add(i);
                number /= i;
                i=2;
            }
        }
    }
}
