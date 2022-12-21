package eaststar1129.programers.lv2.date20221221;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int total = brown + yellow;
        int flagNumber = (int)Math.sqrt(total);
        for (int i=flagNumber;i>=3;--i) {
            if (total%i == 0) {
                int[] temp = {total/i, i};
                if (brown == (temp[0] * 2 + temp[1] * 2 - 4)) {
                    answer = temp;
                    break;
                }
            }
        }

        return answer;
    }

    // 1. 근의 공식 ( 다른사람 풀이 )
    public int[] 근의공식(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 카펫().solution(8, 1)[0]+ " " + new 카펫().solution(8, 1)[1]);
    }
}
