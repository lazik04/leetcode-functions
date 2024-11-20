package uz.pdp.medium;
//962. Maximum Width Ramp
//Medium
//
//A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.
//
//Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.

public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);

        int left = 0, right = 0, maxVal = 0;

        while (right < n) {
            while (right<n && nums[left]<=rightMax[right])
                right++;
            maxVal = Math.max(maxVal, right - left-1);
            left++;
            right = left + maxVal + 1;
        }

        return maxVal;
    }
}
