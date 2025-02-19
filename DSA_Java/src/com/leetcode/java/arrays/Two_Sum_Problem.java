//     https://leetcode.com/problems/two-sum/description/
package com.leetcode.java.arrays;

import  java.util.*;


class Two_Sum_Problem {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int [] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] == diff){
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            return  res;
      }
}
