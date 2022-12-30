package eaststar1129.programers.lv2.y2022.m12.date20221220;

public class e피보나치수 {
    public int solution(int n) {
        if(n < 2) {
            return n;
        }
        final int NUMBER = 1234567;
        int answer = 0;

        int num1 = 0;
        int num2 = 1;

        // (A + B) % C
        // ((A % C) + (B % C)) & C
        for (int i=2;i<=n;++i) {
            int tempNumber = (num1 + num2) % NUMBER;
            num1 = num2;
            num2 = tempNumber;
        }

        answer = num2;
        return answer;
     }

}
