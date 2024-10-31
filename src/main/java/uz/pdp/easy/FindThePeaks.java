package uz.pdp.easy;
//2951. Find the Peaks
//        Easy
//Topics
//        Companies
//Hint
//You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.
//
//Return an array that consists of indices of peaks in the given array in any order.
//
//Notes:
//
//A peak is defined as an element that is strictly greater than its neighboring elements.
//The first and last elements of the array are not a peak.

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++) {
            int prev = mountain[i - 1];
            int curr = mountain[i];
            int next = mountain[i + 1];

            if (prev < curr && curr > next)
                list.add(i);
        }

        return list;
    }
}
