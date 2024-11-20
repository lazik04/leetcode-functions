package uz.pdp.medium;
//2406. Divide Intervals Into Minimum Number of Groups
//        Solved
//Medium
//        Topics
//Companies
//        Hint
//You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].
//
//You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.
//
//Return the minimum number of groups you need to make.
//
//Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.
public class DivideIntervalsIntoMinimumNumberOfGroups {

    public int minGroups(int[][] intervals) {
        int rangeStart = Integer.MAX_VALUE;
        int rangeEnd = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            rangeStart = Math.min(rangeStart, interval[0]);
            rangeEnd = Math.max(rangeEnd, interval[1]);
        }

        int[] pointToCount = new int[rangeEnd + 2];
        for (int[] interval : intervals) {
            pointToCount[interval[0]]++;
            pointToCount[interval[1] + 1]--;
        }

        int concurrentIntervals = 0;
        int maxConcurrentIntervals = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            concurrentIntervals += pointToCount[i];
            maxConcurrentIntervals = Math.max(
                    maxConcurrentIntervals,
                    concurrentIntervals
            );
        }

        return maxConcurrentIntervals;
    }
}
