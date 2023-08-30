package org.example.quest.explore.array;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6 -8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        if(arr.length<2) return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]*2&&i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkIfExistWithSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) {
            if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
