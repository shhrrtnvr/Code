package leetcode.array;

import java.util.Arrays;

class ArraysPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0; 
        for(int i = 0; i < nums.length; i+=2){
            sum +=nums[i];
        }
        return sum;
    }
}