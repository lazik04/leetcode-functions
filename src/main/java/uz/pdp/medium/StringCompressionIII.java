package uz.pdp.medium;

//3163. String Compression III
//        Medium
//Topics
//        Companies
//Hint
//Given a string word, compress it using the following algorithm:
//
//Begin with an empty string comp. While word is not empty, use the following operation:
//Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
//Append the length of the prefix followed by c to comp.
//Return the string comp.
public class StringCompressionIII {

    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 0, j = 0;
        for (int i = 0; i < word.length(); ++i) {
            j = i;
            char c = word.charAt(i);
            while (j < word.length() && word.charAt(j) == c) {
                ++count;
                ++j;
            }
            while (count > 9) {
                sb.append('9');
                sb.append(c);
                count -= 9;

            }
            sb.append((char) (count + '0'));
            sb.append(c);
            count = 0;
            i = j - 1;

        }
        return sb.toString();
    }
}
