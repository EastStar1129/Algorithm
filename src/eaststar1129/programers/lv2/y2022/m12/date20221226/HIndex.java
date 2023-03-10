package eaststar1129.programers.lv2.y2022.m12.date20221226;

import java.util.Arrays;

public class HIndex {
    static class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);

            for (int i=0;i<citations.length;++i) {
                if (citations[citations.length-i-1] <= i) {
                    return i;
                }
            }

            return citations.length;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 4, 4};
        System.out.println(new Solution().solution(arr));
    }
}
