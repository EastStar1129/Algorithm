package eaststar1129.programers.competition.카카오2022;

public class 파괴되지않은건물 {

    private static final int TYPE_INDEX = 0;
    private static final int R1_INDEX = 1;
    private static final int C1_INDEX = 2;
    private static final int R2_INDEX = 3;
    private static final int C2_INDEX = 4;
    private static final int DEGREE_INDEX = 5;
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;

        int[][] flag = new int[board.length+1][board[0].length+1];

        int sl = skill.length;
        for(int i=0;i<sl;++i) {
            int degree = skill[i][DEGREE_INDEX];
            if(skill[i][TYPE_INDEX] == 1) {
                degree *= -1;
            }
            int rs = skill[i][R1_INDEX];
            int cs = skill[i][C1_INDEX];
            int re = skill[i][R2_INDEX]+1;
            int ce = skill[i][C2_INDEX]+1;

            flag[rs][cs] = flag[rs][cs] + degree;
            flag[re][cs] = flag[re][cs] - degree;
            flag[rs][ce] = flag[rs][ce] - degree;
            flag[re][ce] = flag[re][ce] + degree;
        }

        int fl = flag.length-1;
        int fl0 = flag[0].length-1;

        for(int r=0;r<fl;++r) {
            for(int c=0;c<fl0;++c) {
                flag[r][c+1] += flag[r][c];
            }
        }

        for(int c=0;c<fl0;++c) {
            for(int r=0;r<fl;++r) {
                flag[r+1][c] += flag[r][c];
            }
        }

        int bl = board.length;
        int bl0 = board[0].length;
        for(int r=0;r<bl;++r) {
            for(int c=0;c<bl0;++c) {
                int val = board[r][c] + flag[r][c];
                if(val > 0) {
                    ++answer;
                }
            }
        }
        return answer;
    }
}
