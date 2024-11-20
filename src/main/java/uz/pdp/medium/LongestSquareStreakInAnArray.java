package uz.pdp.medium;

//2501. Longest Square Streak in an Array
//Medium
//        Topics
//Companies
//        Hint
//You are given an integer array nums. A subsequence of nums is called a square streak if:
//
//The length of the subsequence is at least 2, and
//after sorting the subsequence, each element (except the first element) is the square of the previous number.
//Return the length of the longest square streak in nums, or return -1 if there is no square streak.
//
//A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
public class LongestSquareStreakInAnArray {
    public int longestSquareStreak(int[] nums) {
        int result = -1;
        final int max = 100000;
        boolean[] isExisted = new boolean[max + 1];
        boolean[] isVisited = new boolean[max + 1];
        for (int num : nums) {
            isExisted[num] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (!isExisted[i] || isVisited[i]) {
                continue;
            }
            isVisited[i] = true;
            int length = 1;
            int j = i * i;
            while (j >= 0 && j <= max && isExisted[j]) {
                isVisited[j] = true;
                length++;
                j = j * j;
            }
            if (length > 1) {
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
