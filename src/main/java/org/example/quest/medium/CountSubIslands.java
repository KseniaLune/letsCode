package org.example.quest.medium;

public class CountSubIslands {
    public static void main(String[] args) {
        int[][] first = {
            {1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 1, 1}
        };
        int[][] second = {
            {1, 1, 1, 0, 0},
            {0, 0, 1, 1, 1},
            {0, 1, 0, 0, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0}
        };

        System.out.println(countSubIslands(first, second));
    }

    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        if (grid1 == null || grid2 == null) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid1[i][j] == 1 && grid2[i][j] == 1) {

                    if (color(grid1,grid2,i,j) >=0) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    private static int color(int[][] grid1, int[][] grid2, int i, int j) {

        if (i < 0 || i >= grid1.length || j < 0 || j >= grid1[0].length) {
            return 0;
        }
        if (grid2[i][j] == 0) {
            return 0;
        }
        if (grid2[i][j] == 2) {
            return 0;
        }
        int counter = 0;

        if (grid1[i][j] == grid2[i][j]) {
            grid2[i][j] = 2;
            counter += color(grid1, grid2, i - 1, j);
            counter += color(grid1, grid2, i, j - 1);
            counter += color(grid1, grid2, i, j + 1);
            counter += color(grid1, grid2, i + 1, j);
        } else {
            return -1;
        }
        return counter;


    }
}
