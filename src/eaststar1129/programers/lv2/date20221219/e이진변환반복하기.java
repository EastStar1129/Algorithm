package eaststar1129.programers.lv2.date20221219;

public class e이진변환반복하기 {
    static class Solution {
        public static int[] solution(String s) {

            int zeroCount = 0;
            int twoCount = 0;

            while(!s.equals("1")) {
                ++twoCount;
                String temp = s.replaceAll("0", "");
                zeroCount += s.length() - temp.length();
                s = Long.toBinaryString(temp.length());
            }

            int[] answer = {twoCount, zeroCount};
            return answer;
        }
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution("110010101001"));
    }
}
