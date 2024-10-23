package uz.pdp.medium;

import java.util.Arrays;

//Code
//        Testcase
//Testcase
//Test Result
//16. 3Sum Closest
//Solved
//        Medium
//Topics
//        Companies
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {

                    end--;
                } else {
                    start++;
                }


            }
        }

        return min;
    }
}
