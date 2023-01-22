package eaststar1129.programers.lv3.dp;

public class 등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;

        boolean arr2[][] = new boolean[m][n];
        int arr[][] = new int[m][n];

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = 0;
                arr2[i][j] = false;
            }
        }

        for (int[] puddle: puddles) {
            arr2[puddle[0]-1][puddle[1]-1] = true;
        }
        arr[0][0] = 1;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (arr2[i][j]) {
                    continue;
                }
                int num1 = 0;
                int num2 = 0;
                if (i != 0) {
                    num1 = arr[i-1][j];
                }
                if (j != 0) {
                    num2 = arr[i][j-1];
                }
                arr[i][j] = (num1 + num2) % 1000000007;
            }
        }

        return arr[m-1][n-1] % 1000000007;
    }
}
