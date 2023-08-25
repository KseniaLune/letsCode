package org.example.quest.easy;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(arr));
    }

    public static int islandPerimeter(int[][] grid) {
        //dfs
        if (grid == null) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return getPerimeter(grid, i, j);
                }
            }
        }
        return 0;
    }
    public static int getPerimeter(int[][] grid, int i, int j) {
        //если квадрат за границей - он вода =+ 1;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 1;
        }
        //если квадрат вода =+ 1;
        if (grid[i][j] == 0) {
            return 1;
        }
        //если квадрат остров, который мы уже посещали =+ 0;
        if (grid[i][j] == -1) {
            return 0;
        }


        int count = 0;
        grid[i][j] = -1; //помечаем остров, как посещенный

        //рассматриваем всех соседей
        count += getPerimeter(grid, i-1, j);
        count += getPerimeter(grid, i, j-1);
        count += getPerimeter(grid, i, j+1);
        count += getPerimeter(grid, i+1, j);

        return count;
    }
}
