package org.example.quest.easy;

public class Sqrtx {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
      int first = 1, last = x;
      while (first<=last){
         int mid = first +(last-first)/2;
         if (mid==x/mid){
             return mid;
         } else if (mid>x/mid){
             last = mid-1;
         } else {
             first=mid+1;
         }

      }
      return last;
    }
}
