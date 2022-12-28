package eaststar1129.programers.lv2.date20221228;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class 캐시 {

    /** LinkedHashMap 분석
     super parameter
     initialCapacity : 초기값, deafult : 10
        해쉬사이즈의 초기값을 설정한다. 이 후 사이즈가 넘어가도록 put이 된 경우 2배를 증가시켜 size를 설정한다.

     loadFactor : 초기값 75%
        해쉬 버킷의 용량이다. loadFactor에 따라 해쉬 검색속도가 달라진다.

     accessOrder : 최근에 방문한 순서대로 내부를 정렬한다

     @Override
     removeEldestEntry : Entry가 지워질 조건을 정의한다.
     */

    class Cache extends LinkedHashMap<String, Integer> {
        private final int initialCapacity;
        private int missCount;

        public Cache(int initialCapacity) {
            super(initialCapacity, 0.75f, true);
            this.initialCapacity = initialCapacity;
            missCount = 0;
        }


        public void add(String city) {
            if (Objects.isNull(get(city))) {
                ++missCount;
                put(city, 0);
            }

        }

        public int getMissCount() {
            return missCount;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
            return size() > initialCapacity;
        }
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Cache cache = new Cache(cacheSize);

        for (String city : cities) {
            cache.add(city.toLowerCase());
        }

        answer = cities.length - cache.getMissCount() + cache.getMissCount() * 5;
        return answer;
    }

    public static void main(String[] args) {
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        System.out.println(new 캐시().solution(cacheSize, cities));
    }
}
