package eaststar1129.programers.lv2.date20221225;

public class 멀리뛰기 {
    public long solution(int n) {
        if (n <= 2) {
            return n;
        }

        long answer = 0;
        int arr[] = new int[2001];
        arr[1] = 1; arr[2] = 2;

        for (int i=3;i<=n;i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }

        answer = arr[n];
        return answer;


        /** 5
         * 8
         1 1 1 1 1
         2 1 1 1
         1 2 1 1
         1 1 2 1
         1 1 1 2
         1 2 2
         2 1 2
         2 2 1

         * 13
         1 1 1 1 1 1
         2 1 1 1 1
         1 2 1 1 1
         1 1 2 1 1
         1 1 1 2 1
         1 1 1 1 2
         2 2 1 1
         2 1 2 1
         2 1 1 2
         1 2 2 1
         1 2 1 2
         1 1 2 2
         2 2 2

         **/

    }
}
