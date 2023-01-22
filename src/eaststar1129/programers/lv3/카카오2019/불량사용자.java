package eaststar1129.programers.lv3.카카오2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class 불량사용자 {
    int answer = 0;
    public int solution(String[] user_id, String[] banned_id) {
        answer = 0;

        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        for (String bannedId: banned_id) {
            String temp = bannedId.replaceAll("\\*", ".");
            ArrayList<String> tempArr = new ArrayList<>();

            for (String userId: user_id) {
                if (userId.matches(temp)) {
                    tempArr.add(userId);
                }
            }
            arr.add(tempArr);
        }
        dfs(arr, 0, new String[banned_id.length]);
        return answer;
    }

    private void dfs(ArrayList<ArrayList<String>> arr, int index, String[] answerArr) {
        if (arr.size() == index) {
            answer++;
            for (String s: answerArr) {
                System.out.print(s + " ");
            }
            System.out.println("");
            return ;
        }
        for (int i=0;i<arr.get(index).size();i++) {
            boolean flag = true;
            for (int j=0;j<index;j++) {
                if (answerArr[j].equals(arr.get(index).get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answerArr[index] = arr.get(index).get(i);
                dfs(arr, index + 1, answerArr);
            }
        }
    }

    public static void main(String[] args) {

    }
}
