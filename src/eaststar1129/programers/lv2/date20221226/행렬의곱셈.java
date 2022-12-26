package eaststar1129.programers.lv2.date20221226;

public class 행렬의곱셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0;i<arr1.length;++i) {
            for (int j=0;j<arr1[0].length;++j) {
                for (int k=0;k<arr1[0].length;++k) {
                    answer[i][j] += arr1[i][k] * getAnInt(j, arr2[k]);
                }
            }
        }
        return answer;
    }

    private int getAnInt(int j, int[] arr2) {

        return arr2[j];
    }

    public static void main(String[] args) {
        int arr[][] = {{1,4}, {3,2}, {4,1}};
        int arr2[][] = {{3,3}, {3,3}};

        new 행렬의곱셈().solution(arr, arr2);
    }

}
