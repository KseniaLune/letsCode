package org.example.quest.easy;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,0}, {0,0,0}
        };

        System.out.println(Arrays.deepToString(floodFill(arr, 1, 0, 2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null) {
            return image;
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (i == sr && j == sc) {
                    return colored(image, image[i][j], i, j, color);
                }

            }
        }
        return image;
    }

    public static int[][] colored(int[][] image, int val, int i, int j, int color) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length) {
            return image;
        }
        if (image[i][j] == color) {
            return image;
        }
        if (image[i][j] !=val) {
            return image;
        }
        image[i][j] = color;

        colored(image, val, i-1, j, color);
        colored(image, val, i, j-1, color);
        colored(image, val, i, j+1, color);
        colored(image, val, i+1, j, color);

        return image;
    }
}
