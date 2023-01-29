package eaststar1129.programers.competition.카카오2023;

public class 표현가능한이진트리 {

/*
1. 이진수를 저장할 빈 문자열을 생성합니다.
2. 주어진 이진트리에 더미 노드를 추가하여 포화 이진트리로 만듭니다. 루트 노드는 그대로 유지합니다.
3. 만들어진 포화 이진트리의 노드들을 가장 왼쪽 노드부터 가장 오른쪽 노드까지, 왼쪽에 있는 순서대로 살펴봅니다. 노드의 높이는 살펴보는 순서에 영향을 끼치지 않습니다.
4. 살펴본 노드가 더미 노드라면, 문자열 뒤에 0을 추가합니다. 살펴본 노드가 더미 노드가 아니라면, 문자열 뒤에 1을 추가합니다.
5. 문자열에 저장된 이진수를 십진수로 변환합니다.
* */
     public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];


        int i=0;
        for (Long number: numbers) {
            String binary = Long.toBinaryString(number);
            StringBuilder sb = new StringBuilder(binary);

            if (sb.length() % 2 == 0) {
                sb.insert(0, 0);
            }

            answer[i++] = dfs(sb, (sb.length() - 1) / 2) ? 1 : 0;
        }

        return answer;
    }

    private boolean dfs(StringBuilder sb, int index) {
         if (sb.charAt(index) == '1') {
            return dfs(sb, (sb.length() - 1) / 2) && dfs(sb, (sb.length() - 1) / 2);
         }
         for (int i=0;i<index;i++) {
             if (sb.charAt(i) == '1') {
                 return false;
             }
         }
         return true;
    }
}
