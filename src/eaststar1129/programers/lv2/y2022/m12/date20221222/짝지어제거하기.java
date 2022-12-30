package eaststar1129.programers.lv2.y2022.m12.date20221222;

import java.util.Stack;

public class 짝지어제거하기 {

    /** stack
     *
     * @param s
     * @return stack.empty : 1, other : 0
     */
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    /** 효율성 없음
    public int solution(String s)
    {
        int answer = -1;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        answer = f(new StringBuilder(s));
        return answer;
    }

    public int f(StringBuilder sb) {
        for (int i=1;i<sb.length();++i) {
            if (sb.charAt(i-1) == sb.charAt(i)) {
                sb.delete(i-1, i+1);
                i = i == 1 ? 0 : i-2;
            }
        }
        return sb.length() == 0 ? 1 : 0;
    }

     **/

    public static void main(String[] args) {
        System.out.println(new 짝지어제거하기().solution("baabaa"));
    }
}
