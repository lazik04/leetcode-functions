package uz.pdp;

import java.util.Arrays;
import uz.pdp.easy.TwoSum;
//1. Two Sum
//       Easy

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
public class Main {
    public static void main(String[] args) {
//        CheckIfArrayPairsAreDivisibleByK check = new CheckIfArrayPairsAreDivisibleByK();
//        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9,2,4};
//        boolean b = check.canArrange(arr, 5);
//        System.out.println(b);
//***
        TwoSum twoSum = new TwoSum();
        int[] arr = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(arr));
    }
}