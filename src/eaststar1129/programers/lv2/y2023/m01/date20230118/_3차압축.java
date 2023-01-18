package eaststar1129.programers.lv2.y2023.m01.date20230118;

import java.util.*;

public class _3차압축 {
    public int[] solution(String msg) {
        int[] answer = {};

        ArrayList<String> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for (char c='A';c<='Z';c++) {
            list.add(String.valueOf(c));
        }

        char[] charArr = msg.toCharArray();
        for (int i=0;i<charArr.length;i++) {
            String str = String.valueOf(charArr[i]);
            for (int j=i+1;j<charArr.length;j++) {
                String temp = str + charArr[j];
                if (!list.contains(temp)) {
                    System.out.println(temp + " " + (list.indexOf(str) + 1));
                    answerList.add(list.indexOf(str) + 1);
                    list.add(temp);
                    break;
                }
                str = temp;
                i++;
            }
            if (charArr.length-1 == i) {
                answerList.add(list.indexOf(str) + 1);
            }
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = new _3차압축().solution("KAKAO");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
