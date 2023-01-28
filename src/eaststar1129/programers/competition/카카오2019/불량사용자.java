package eaststar1129.programers.competition.카카오2019;

import java.util.*;

public class 불량사용자 {
    int answer = 0;
    Set<String> set;
    public int solution(String[] user_id, String[] banned_id) {
        answer = 0;
        set = new HashSet<>();

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
            String[] str = new String[answerArr.length];
            for (int i=0;i<answerArr.length;i++) {
                str[i] = answerArr[i];
            }
            Arrays.sort(str);
            String strr = Arrays.toString(str);
            if (!set.contains(strr)) {
                System.out.println(strr);
                set.add(strr);
                answer++;
            }

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
        String [] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String [] ban_id = {"*rodo", "*rodo", "******" };
        System.out.println(new 불량사용자().solution(user_id, ban_id));
    }
}
