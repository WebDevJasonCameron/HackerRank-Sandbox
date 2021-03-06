/**
 *      Problem 01
 *
 *      Two strings, a and b, are called anagrams if they contain all
 *      the same characters in the same frequencies. For this challenge,
 *      the test is not case-sensitive. For example, the anagrams of
 *      CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 *
 *  Function Description
 *      Complete the isAnagram function in the editor.
 *
 *      isAnagram has the following parameters:
 *      - string a: the first string
 *      - string b: the second string
 *
 *  Returns
 *
 *      boolean: If a and b are case-insensitive anagrams, return true.
 *      Otherwise, return false.
 *
 *  Input Format
 *      The first line contains a string "a".
 *  The second line contains a string "b".
 *
 *  Constraints
 *      1<= length(a), length(b) <= 50
 *      - Strings a and b consist of English alphabetic characters.
 *      - The comparison should NOT be case-sensitive.
 */

package Daily.Year_2022.Week_29.Java_Daily_2022_07_19;

import java.util.Scanner;

public class Problem02 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        if(A.length() != B.length()) return false;

        for (int i = 0; i <A.length(); i++) {
            int c1 = 0;                                 //   Set holding vars
            int c2 = 0;
            char ch =A.charAt(i);

            for (int j = 0; j <A.length(); j++) {      //   Count total of ch in string A
                if(A.charAt(j) == ch) {
                    c1++;
                }
            }

            for (int j = 0; j < B.length(); j++) {      //   Count total of ch in string B
                if(B.charAt(j) == ch) {
                    c2++;
                }
            }
            if(c1 != c2) return false;                  //   Check totals between a and b now.  If it does
                                                        // not match, return the false now
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

