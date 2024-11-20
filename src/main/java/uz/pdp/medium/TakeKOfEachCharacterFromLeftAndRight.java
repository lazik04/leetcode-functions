package uz.pdp.medium;

//2516. Take K of Each Character From Left and Right
//        Medium
//Topics
//        Companies
//Hint
//You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k. Each minute, you may take either the leftmost character of s, or the rightmost character of s.
//
//Return the minimum number of minutes needed for you to take at least k of each character, or return -1 if it is not possible to take k of each character.

public class TakeKOfEachCharacterFromLeftAndRight {
    public int takeCharacters(String s, int k) {
        int[] arr = new int[3];
        char[] c = s.toCharArray();
        int cur, len = c.length;
        for (cur = 0; cur < len; cur++) {
            arr[c[cur] - 'a']++;
            if (arr[0] >= k &&   arr[1] >= k && arr[2] >= k) break;
        }
        if (cur == len) return -1;
        int count = cur + 1, min = count, end = len - 1;
        while (cur >= 0) {
            if (arr[c[cur] - 'a'] == k) {
                while (c[cur] != c[end]) {
                    arr[c[end] - 'a']++;
                    end--;
                    count++;
                }
                end--;
            } else {
                arr[c[cur] - 'a']--;
                count--;
                min = Math.min(count, min);
            }
            cur--;
        }
        return min;
    }

}
