package org.example.quest.explore.array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));

    }
    public static int[] replaceElements(int[] arr) {
        if(arr==null)return arr;

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            arr[i] = max;
            if(i== arr.length-1){
                arr[i] = -1;
            }
        }
        return arr;
    }
}
