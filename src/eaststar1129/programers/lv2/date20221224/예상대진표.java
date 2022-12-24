package eaststar1129.programers.lv2.date20221224;

public class 예상대진표 {
    public int solution(int n, int a, int b) {
        int answer = 1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }

        while (a != b - 1 || a % 2 == 1) {
            a = a == 1 ? 1 : a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;
            ++answer;
        }

        return answer;
    }

    /**
     * XOR 연산을 통해 공통되지 않은 부분을 체크한다.
     * 2진수 영역의 길이는 2의 n승 이므로 BinaryString 함수의 length()와 동일하다.
     * @param n 자연수 범위
     * @param a number 1
     * @param b number 2
     * @return
     */
    public int toBinaryString(int n, int a, int b)
    {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }

    public static void main(String[] args) {
        new 예상대진표().solution(8, 4, 7);
    }
}
