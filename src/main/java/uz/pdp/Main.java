package uz.pdp;

import java.util.Arrays;
import uz.pdp.easy.TwoSum;
import uz.pdp.medium.CheckIfArrayPairsAreDivisibleByK;

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