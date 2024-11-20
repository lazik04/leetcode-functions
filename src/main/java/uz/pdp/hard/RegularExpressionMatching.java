package uz.pdp.hard;
//10. Regular Expression Matching
//        Hard
//Topics
//        Companies
//Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
//
//        '.' Matches any single character.
//        '*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
    public boolean isMatch(String str, String pattern) {
//        Pattern p = Pattern.compile(pattern);
//        Matcher matcher = p.matcher(str);
//        return matcher.matches();
        //**************************************************************************************************************

        boolean star = false;

        int[] A = new int[str.length() + 1];
        for (int i = 0; i < A.length - 1; i++) {
            A[i] = -1;
        }

        int rule = 0;
        int minLetters = 0;
        boolean bounded = true;
        for (int i = pattern.length() - 1; i >= 0; i--) {
            char curr = pattern.charAt(i);
            if ('*' == curr) {
                star = true;
                continue;
            }

            if (star) {
                // now, look for the last place in A where all other rules matched and start matcing
                for (int j = A.length - 2; j >= 0; j--) {
                    if (A[j + 1] == rule) {
                        A[j + 1] = rule + 1;
                    }

                    if (A[j + 1] == rule + 1) {
                        if (curr == '.' || curr == str.charAt(j)) {
                            A[j] = rule + 1;
                        }
                    }
                }
            } else {
                for (int j = 0; j < A.length - 1; j++) {
                    if (A[j + 1] == rule && (curr == str.charAt(j) || curr == '.')) {
                        A[j] = rule + 1;
                    }
                }
            }

            // last rule is a *
            if (star && A[0] == rule) {
                A[0]++;
            }

            star = false;
            rule++;
        }

        return A[0] == rule;

    }
}
