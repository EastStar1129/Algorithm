package eaststar1129.programers.lv2.y2022.m12.date20221220;

public class e숫자의표현 {

    static public int solution(int n) {

        int answer = 1;

        int forNumber = n / 2;

        for (int i=1;i<=forNumber;++i) {
            int sum = 0;
            for (int j=i;j<=forNumber+1;++j) {
                sum += j;
                if (sum == n) {
                    ++answer;
                }
                if (sum >= n) {
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
