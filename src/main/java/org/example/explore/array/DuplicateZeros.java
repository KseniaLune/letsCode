package org.example.explore.array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] a = {};
        int [] b = {1};
        int [] d = {0,1};
        int [] c = {1,0,2,0,3}; //{1,0,0,2,0}
        duplicateZeros(c);
        System.out.println(Arrays.toString(b));
    }
    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==0){
                for (int j = arr.length-2; j >=i ; j--) {
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
    }
}
