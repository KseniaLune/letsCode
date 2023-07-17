package org.example.explore.array;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println("result = "+findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i]>=1){
                nums[i]= nums[i]/10;
                digit++;
            }
            if(digit!=0&&digit%2==0){
                System.out.println(digit);
                even++;
            }
        }
        return even;
    }
}
