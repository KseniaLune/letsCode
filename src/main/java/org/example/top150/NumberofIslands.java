package org.example.top150;

public class NumberofIslands {
    public static void main(String[] args) {

        char[][] map = {
            {'1', '1', '0'},
            {'0', '1', '0'},
            {'1', '1', '1'}
        }; // 1

        System.out.println(numIslands(map));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    check(grid, i, j);
                    count++;
                }
            }
        return count;
    }

    private static void check(char[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0';
            check(grid, i + 1, j);
            check(grid, i - 1, j);
            check(grid, i, j + 1);
            check(grid, i, j - 1);
        }
    }
}
