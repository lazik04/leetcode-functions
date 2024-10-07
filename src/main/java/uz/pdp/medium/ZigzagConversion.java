package uz.pdp.medium;

//6. Zigzag Conversion
//Medium

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }

        int index = 0 , d =1 ;
        List<Character>[] list = new ArrayList[numRows];
        for(int i = 0 ; i < numRows; i++){
            list[i]= new ArrayList<>();
        }
        for ( char c: s.toCharArray()){
            list[index].add(c);
            if (index == 0 ){
                d=1;
            }
            else if(index == numRows -1 ){
                d=-1;
            }
            index += d;
        }
        StringBuilder res = new StringBuilder();
        for (List<Character> row : list){
            for(char c : row){
                res.append(c);
            }
        }
        return res.toString();
    }
}
