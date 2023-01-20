package eaststar1129.programers.lv2.y2023.m01.date20230120;

public class 피로도 {

    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        dfs(k, dungeons, new int[dungeons.length], new boolean[dungeons.length], 0);
        return this.answer;
    }

    public void dfs(int k, int[][] dungeons, int[] out, boolean[] visited, int depth) {
        if(depth == out.length){
            int count = 0;
            int kk = k;
            for(int num: out) {
                if (dungeons[num][0] > kk) {
                    break;
                }
                ++count;
                kk -= dungeons[num][1];
            }
            answer = answer < count ? count : answer;
            return;
        }

        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i;
                dfs(k, dungeons, out, visited, depth+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args){
        int[][] arr = {{80,20},{50,40},{30,10}}	;
        int k = 80;
        System.out.println(new 피로도().solution(k, arr));
    }
}
