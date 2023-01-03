package eaststar1129.programers.lv2.y2023.m01.date20230103;

import java.util.Arrays;

public class FollowingMatrix {
    public int determinant(int[][] matrix) {
        int length = matrix.length;

        if(length == 1) {
            return matrix[0][0];
        }

        if(length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int index = 1;
        int result = 0;
        for(int i=0;i<length;i++) {
            int alpha = matrix[0][i];
            int detMatrix[][] = new int[length-1][length-1];
            if (alpha != 0) {
                for (int x=1;x<length;++x) {
                    int y1 = 0;
                    for (int y=0;y<length;++y) {
                        if (y == i) {
                            continue;
                        }
                        detMatrix[x-1][y1] = matrix[x][y];
                        ++y1;
                    }
                }
//                System.out.println(alpha + "=============");
//                for(int[] detM: detMatrix) {
//                    for(int detMM : detM) {
//                        System.out.print(detMM + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println("result : " + alpha * determinant(detMatrix));
            }
            result += index * alpha * determinant(detMatrix);
            index *= -1;
        }
        return result;
    }

    public static void main(String[] args) {
//        int arr[][] = {{-1, 0, -1, -1}, {9, 5, 10, 7}, {6, -2, 7, 8}, {5, 2, 5, 3}}; //6
        int arr[][] = {{16, 22, 4}, {4, -3, 2}, {12, 25, 2}}; //0
        System.out.println(new FollowingMatrix().determinant(arr));
    }

}
