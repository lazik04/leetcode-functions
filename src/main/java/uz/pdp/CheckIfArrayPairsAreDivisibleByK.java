package uz.pdp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CheckIfArrayPairsAreDivisibleByK {
    //1497. Check If Array Pairs Are Divisible by k
//    Medium
//
//    Given an array of integers arr of even length n and an integer k.
//
//    We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
//
//    Return true If you can find a way to do that or false otherwise.
    public boolean canArrange(int[] arr, int k) {
//        Map<Integer, Integer> remainderCount = new HashMap<>();
//
//        // Store the count of remainders in a map.
//        for (int i : arr) {
//            int rem = ((i % k) + k) % k;
//            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
//        }
//
//        for (int i : arr) {
//            int rem = ((i % k) + k) % k;
//
//            // If the remainder for an element is 0, then the count
//            // of numbers that give this remainder must be even.
//            if (rem == 0) {
//                if (remainderCount.get(rem) % 2 == 1) return false;
//            }
//            // If the remainder rem and k-rem do not have the
//            // same count then pairs can not be made.
//            else if (
//                    !Objects.equals(
//                            remainderCount.get(rem),
//                            remainderCount.get(k - rem)
//                    )
//            ) return false;
//        }
//        return true;
            int[] remainderCount = new int[k];
            for (int num : arr) {
                int rem = (num % k + k) % k;
                remainderCount[rem]++;
            }
            for (int i = 1; i < k; i++) {
                if (remainderCount[i] != remainderCount[k - i]) {
                    return false;
                }
            }
            return remainderCount[0] % 2 == 0;
    }
}
