package eaststar1129.programers.lv2.y2022.m12.date20221227;

import java.util.Stack;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        int k = -1;
        for (int i=0;i<s.length();i++) {
            stack.clear();
            ++k;
            for (int j=0;j<s.length();j++) {
                int index = (j + k) % s.length();
                if(stack.isEmpty()) {
                    stack.push(s.charAt(index));
                } else {
                    int temp = s.charAt(index) - stack.peek();
                    if (temp == 1 || temp == 2) {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(index));
                    }
                }
            }
            if(stack.isEmpty()) {
                ++answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "[](){}";
        System.out.println(new 괄호회전하기().solution(str));
    }
}
