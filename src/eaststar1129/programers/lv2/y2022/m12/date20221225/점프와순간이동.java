package eaststar1129.programers.lv2.y2022.m12.date20221225;

public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 0;

        while(n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                --n;
                ++ans;
            }
        }
        return ans;
    }
}
