package eaststar1129.programers.lv3.dp;

import java.util.ArrayList;
import java.util.Arrays;

public class 정수삼각형 {
    public int solution(int[][] triangle) {
        /**
        프로그래머스 좋아요 코드 
         알고리즘은 같음
         1. 변수를 생성하지 않고 triangle 변수를 덮어썻다.
         2. index 0과 마지막을 초기화 해준뒤 반복문을 돌렸다.
         3. 나머지 알고리즘은 동일
         
         for (int i = 1; i < triangle.length; i++) {
         triangle[i][0] += triangle[i-1][0];
         triangle[i][i] += triangle[i-1][i-1];
         for (int j = 1; j < i; j++) 
         triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
         }

         return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
         */
        int answer = 0;

        int[][] arr = new int[triangle.length][triangle[triangle.length-1].length];
        arr[0][0] = triangle[0][0];

        for (int i=1;i<triangle.length;i++) {
            int len = triangle[i].length;
            for (int j=0;j<len;j++) {
                int num1 = 0;
                int num2 = 0;
                if (j != 0) {
                    num1 = arr[i-1][j-1];
                }
                if (j != len-1) {
                    num2 = arr[i-1][j];
                }
                arr[i][j] = triangle[i][j] + Math.max(num1, num2) ;
            }
        }


        return Arrays.stream(arr[triangle.length-1]).max().getAsInt();
    }
//    int answer = 0;
//    public int solution(int[][] triangle) {
//        dfs(triangle, 0, 0, 0);
//        return answer;
//    }
//
//    public void dfs(int[][] triangle, int depth, int width, int sum) {
//        if (depth == triangle.length) {
//            answer = answer < sum ? sum : answer;
//            return ;
//        }
//        sum += triangle[depth][width];
//        dfs(triangle, depth + 1, width, sum);
//        dfs(triangle, depth + 1, width + 1, sum);
//    }
}
