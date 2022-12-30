package eaststar1129.programers.lv2.y2022.m12.date20221230;

import java.util.Arrays;
import static java.util.stream.Collectors.*;

public class 위장 {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                //종류별로 구분
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;
    }
}
