package uz.pdp.easy;
//14. Longest Common Prefix
//        Easy
//Topics
//        Companies
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for(String s: strs){
            while(s.indexOf(res)!=0){
                res = res.substring(0, res.length()-1);
            }
        }
        return res;
    }
}
