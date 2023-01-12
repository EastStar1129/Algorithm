package eaststar1129.programers.lv2.y2023.m01.date20230112;

public class N제곱배열자르기 {
    public int[] solution(int n, long left, long right) {
        int len = (int)right - (int)left + 1;
        int[] answer = new int[len];

        int cnt = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[cnt++] = Math.max((int)row, (int)col) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a[] = new N제곱배열자르기().solution(0, 0, 0);
        for (int aa : a ){
            System.out.print(aa + " " );
        }
    }
}
