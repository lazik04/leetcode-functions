package uz.pdp.easy;
//1. Two Sum
//       Easy

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1 ; j < nums.length; j++ ){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
//        Map<Integer,Integer> intMap = new HashMap<Integer,Integer> ();
//        for (int i =0;i<nums.length;i++) {
//            if (intMap.containsKey(nums[i])) {
//                return new int[]{i,intMap.get(nums[i])};
//            } else {
//                intMap.put(target-nums[i],i);
//            }
//        }
//
//        return new int[]{};
    }
}
