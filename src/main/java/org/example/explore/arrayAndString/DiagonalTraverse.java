package org.example.explore.arrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int resInd = 0;
        int row = 0, column = 0;
        boolean up = true;

        while (row < m && column < n) {
            if (up) {
                while (row > 0 && column < n - 1) {
                    res[resInd++] = mat[row][column];
                    row--;
                    column++;
                }
                res[resInd++] = mat[row][column];
                if (column == n - 1) {
                    row++;
                } else {
                    column++;
                }
                System.out.println("up"+Arrays.toString(res));

            } else {
                while (row < m - 1 && column > 0) {
                    res[resInd++] = mat[row][column];
                    row++;
                    column--;
                }
                res[resInd++] = mat[row][column];
                if (row == m - 1) {
                    column++;
                } else {
                    row++;
                }
                System.out.println("down"+Arrays.toString(res));
            }
            up = !up;
        }
        return res;
    }
}
