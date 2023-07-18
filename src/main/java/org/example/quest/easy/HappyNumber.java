package org.example.quest.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {
        if(n==1||n==7){
            return true;
        }else if (n<10){
            return false;
        }
        String s = n + "";
        char[] chars = s.toCharArray();

        List<Integer> list = new ArrayList<>();
        for (char c : chars) {
            list.add(Character.getNumericValue(c));
        }
        int res = 0;
        System.out.println(list);
        for (int i : list) {
            if (i !=0){
                res = res + i * i;
            }
            System.out.println(res+" i= "+i);
        }
        if (res == 1){
            System.out.println("res:"+res);
            return true;

        } else{
            return isHappy(res);
        }
    }
}

