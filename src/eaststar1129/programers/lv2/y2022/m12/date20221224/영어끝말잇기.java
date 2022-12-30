package eaststar1129.programers.lv2.y2022.m12.date20221224;

import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> answerList = new HashSet<>();

        answerList.add(words[0]);
        for (int i=1;i<words.length;++i) {
            if (isValidation(words, answerList, i)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            answerList.add(words[i]);
        }

        return answer;
    }
    // 글자가 이어지는가?
    // 한글자인가?
    // 이전에 나왔던 단어인가?
    private boolean isValidation(String[] words, Set<String> answerList, int i) {
        return words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) ||
                words[i].length() == 1 ||
                answerList.contains(words[i]);
    }

    public static void main(String[] args) {
        String[] str = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = new 영어끝말잇기().solution(3, str);
        System.out.println( answer[0] + " " + answer[1]);
    }
}
