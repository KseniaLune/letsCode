package org.example.quest.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
//        Input: nums = [0,2,3,4,6,8,9]
//        Output: ["0","2->4","6","8->9"]
//        Explanation: The ranges are:
//            [0,0] --> "0"
//            [2,4] --> "2->4"
//            [6,6] --> "6"
//            [8,9] --> "8->9"
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
            ArrayList<String> al=new ArrayList<>();

            for(int i=0;i<nums.length;i++){
                int start=nums[i];
                while(i+1<nums.length && nums[i]+1==nums[i+1]){
                    i++;
                }

                if(start!=nums[i]){
                    al.add(""+start+"->"+nums[i]);
                }
                else{
                    al.add(""+start);
                }
            }
            return al;
    }
}
