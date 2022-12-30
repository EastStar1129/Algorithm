package eaststar1129.programers.lv2.y2022.m12.date20221226;

public class 행렬의곱셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i=0;i<arr1.length;++i) {
            for (int j=0;j<arr2[0].length;++j) {
                for (int k=0;k<arr1[0].length;++k) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,4}, {3,2}, {4,1}};
        int arr2[][] = {{3,3}, {3,3}};

        new 행렬의곱셈().solution(arr, arr2);
    }

}
