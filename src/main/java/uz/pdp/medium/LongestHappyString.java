package uz.pdp.medium;
//1405. Longest Happy String
//        Medium
//A string s is called happy if it satisfies the following conditions:
//
//s only contains the letters 'a', 'b', and 'c'.
//s does not contain any of "aaa", "bbb", or "ccc" as a substring.
//s contains at most a occurrences of the letter 'a'.
//s contains at most b occurrences of the letter 'b'.
//s contains at most c occurrences of the letter 'c'.
//Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".
//
//A substring is a contiguous sequence of characters within a string.
//


public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        int currA =0, currB = 0, currC = 0;
        int maxLen = a+b+c, i=0;
        StringBuilder sb = new StringBuilder();
        while(i<(maxLen))
        {
            if(currA!=2 && a>=b && a>=c ||  a>0 && (currB==2 || currC==2))
            {
                sb.append('a');
                currA++;
                currB=0;
                currC=0;
                a--;
            }

            else if(currB!=2 && b>=a && b>=c ||  b>0 && (currA==2 || currC==2))
            {
                sb.append('b');
                currB++;
                currA=0;
                currC=0;
                b--;
            }

            else if(currC!=2 && c>=a && c>=b ||  c>0 && (currA==2 || currB==2))
            {
                sb.append('c');
                currC++;
                currA=0;
                currB=0;
                c--;
            }
            i++;
        }
        return sb.toString();
    }
}
