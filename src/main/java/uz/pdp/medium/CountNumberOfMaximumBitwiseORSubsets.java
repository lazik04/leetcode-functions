package uz.pdp.medium;
//2044. Count Number of Maximum Bitwise-OR Subsets
//Medium
//        Topics
//Companies
//        Hint
//Given an integer array nums, find the maximum possible bitwise OR of a subset of nums and return the number of different non-empty subsets with the maximum bitwise OR.
//
//An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b. Two subsets are considered different if the indices of the elements chosen are different.
//
//The bitwise OR of an array a is equal to a[0] OR a[1] OR ... OR a[a.length - 1] (0-indexed).
//

public class CountNumberOfMaximumBitwiseORSubsets {
    static int[] tail = new int[16];  // Array to store the bitwise OR of tail elements
    int[] nums;  // Reference to the input array
    int max;     // Variable to store the maximum OR value

    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        max = nums[0];

        // Calculate the maximum possible OR of all elements in the array
        for (int i = 1; i < nums.length; i++) {
            max |= nums[i];
        }

        // Populate the tail array
        int v = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            v |= nums[i];
            tail[i] = v;
        }

        // Start the recursion
        return recurse(0, 0);
    }

    int recurse(int i, int partial) {
        // If the current partial OR equals the max, return the count of remaining subsets
        if (partial == max) {
            return 1 << (nums.length - i);
        }

        // If we've reached the end of the array or it's impossible to achieve the max, return 0
        if (i == nums.length || ((partial | tail[i]) != max)) {
            return 0;
        }//ringewashere

        // Recursive step: include or exclude the current element
        return recurse(i + 1, partial | nums[i])  // Include the current element
                + recurse(i + 1, partial);          // Exclude the current element
    }
}
