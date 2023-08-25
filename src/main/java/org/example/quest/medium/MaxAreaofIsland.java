package org.example.quest.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxAreaofIsland {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 1, 1, 0}
        };
        System.out.println(maxAreaOfIsland(arr));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, getArea(grid, i, j));
                }
            }
        }
        return res;
    }

    public static int getArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        if (grid[i][j] == 2) {
            return 0;
        }
        int res = 1;
        grid[i][j] = 2;

        res += getArea(grid,i-1, j);
        res += getArea(grid, i, j-1);
        res += getArea(grid, i, j+1);
        res += getArea(grid, i+1, j);

        return res;
    }
}
