package uz.pdp.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//15. 3Sum
//        Medium
//Topics
//        Companies
//Hint
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
public class ЗSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int ival = nums[i];

            if (ival > 0)
                break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + ival;

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    sums.add(Arrays.asList(ival, nums[left], nums[right]));

                    left++;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                }


            }

        }


        return sums;
    }
}
