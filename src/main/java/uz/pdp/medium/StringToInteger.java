package uz.pdp.medium;

//    8. String to Integer (atoi)
//    Medium
//    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
//
//    The algorithm for myAtoi(string s) is as follows:
//
//    Whitespace: Ignore any leading whitespace (" ").
//    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
//            Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
//    Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
//    Return the integer as the final result.
public class StringToInteger {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        int sign = 1;
        while(i<n && s.charAt(i)==' ') {
            i++;
        }
        if (i>=n) {
            return 0;
        }
        if (s.charAt(i)=='-') {
            sign = -1;
        }
        if (s.charAt(i)=='+' || s.charAt(i)=='-') {
            i++;
        }

        if (i>=n) {
            return 0;
        }
        int num = 0;
        while (i<n && s.charAt(i)>='0' && s.charAt(i)<='9') {
            int x = s.charAt(i)-'0';
            if (num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && x>Integer.MAX_VALUE%10)) {
                if (sign==1) {
                    return Integer.MAX_VALUE;
                }
                else {
                    return Integer.MIN_VALUE;
                }
            }
            num = num*10 + x;
            i++;
        }
        return num*sign;
    }
}
