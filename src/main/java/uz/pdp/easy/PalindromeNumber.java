package uz.pdp.easy;
//9. Palindrome Number
//Easy
//Given an integer x, return true if x is a
//        palindrome
//, and false otherwise.

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
          if (x < 0) {
              return false;
          }
          int y = x;
          int reverse = 0;
          while (y > 0) {
              reverse = reverse * 10 + y % 10;
              y /= 10;
          }
          return x == reverse;
    }
}
