package eaststar1129.programers.lv2.y2022.m12.date20221219;

public class e최대값과최솟값 {
    static class Solution {
        public static String solution(String s) {
            String[] strArr = s.split(" ");
            int min = Integer.parseInt(strArr[0]);
            int max = min;

            for(String strNumber : strArr) {
                int number = Integer.parseInt(strNumber);
                if(number < min){
                    min = number;
                    continue;
                }

                if(number > max){
                    max = number;
                }
            }
            return min + " " + max;
        }
    }

    public static void main(String[] args) {
        String value = "1 4";
        new Solution().solution(value);
    }
}
