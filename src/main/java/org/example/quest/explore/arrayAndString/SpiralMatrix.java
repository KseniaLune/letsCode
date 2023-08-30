package org.example.quest.explore.arrayAndString;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int rowBegin = 0, columnBegin = 0;
        int rowEnd = m - 1, columnEnd = n - 1;

        List<Integer> res = new ArrayList<>();


        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            //traverse right
            for (int i = columnBegin; i <= columnEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            //traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            //traverse left
            if(rowBegin<=rowEnd){
                for (int i = columnEnd; i >= columnBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;
            //traverse up
            if(columnBegin<=columnEnd){
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return res;
    }
}
