package eaststar1129.programers.lv2.y2022.m12.date20221219;

import java.util.Arrays;

public class e최솟값만들기 {

    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        int len = A.length-1;
        for(int i=0; i<=len; ++i) {
            sum += A[i]*B[len-i];
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(sum);

        return answer;
    }
}
