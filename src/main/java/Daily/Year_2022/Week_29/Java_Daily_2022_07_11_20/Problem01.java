/**
 *      Problem 01
 *
 *      Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the
 *      string into tokens. We define a token to be one or more consecutive English
 *      alphabetic letters. Then, print the number of tokens, followed by each token on
 *      a new line.
 *
 *      Note: You may find the String.split method helpful in completing this challenge.
 *
 *  Input Format
 *      A single string, s.
 *
 *  Constraints
 *      - 1 <= length of s <= 4*10(5thP)
 *      - is composed of any of the following: English alphabetic letters, blank spaces,
 *        exclamation points (!), commas (,), question marks (?), periods (.),
 *        underscores (_), apostrophes ('), and at symbols (@).
 *
 * Output Format
 *      On the first line, print an integer, n, denoting the number of tokens in string s
 *      (they do not need to be unique). Next, print each of the n tokens on a new line in
 *      the same order as they appear in input string s.
 *
 * NOTES:
 *
 *      To remove extra spaces
 *      (https://mkyong.com/java/how-to-remove-whitespace-between-string-java/)
 *
 *
 */


package Daily.Year_2022.Week_29.Java_Daily_2022_07_11_20;

import java.io.*;
import java.util.*;

public class Problem01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.                                    // Did not Pass:
                                                                    // 3
                                                                    // 6
                                                                    // 7
                                                                    // 10

        System.out.println("Testing Inputs:  " + s);
        printArray(makeArray(stripMarks(s)));

        scan.close();
    }

    public static String stripMarks(String S){
        String output = S.replaceAll("!", " ");
        output = output.replaceAll(",", " ");
        output = output.replaceAll("_", " ");
        output = output.replaceAll("'", " ");
        output = output.replaceAll("@", " ");

        output = output.replace('?', ' ');
        output = output.replace('.', ' ');

        output = output.replaceAll("\\s+", " ");

        return output;
    }

    public static String[] makeArray(String S){
        String[] output = S.split(" ");
        System.out.println(output.length);
        return output;
    }

    public static void printArray(String[] SA){
        for (int i = 0; i < SA.length; i++) {
            System.out.println(SA[i]);
        }
    }

}  //<--END


