/**
 *      Problem 01
 *
 *      A palindrome is a word, phrase, number, or other sequence of
 *      characters which reads the same backward or forward.
 *
 *      Given a string A, print Yes if it is a palindrome, print No otherwise.
 *
 */

package Daily.Year_2022.Week_29.Java_Daily_2022_07_11_19;

import java.io.*;
import java.util.*;

public class Problem01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(palCheck(A));

    }

    public static String palCheck(String A) {

        // Set Vars
        String a = A.substring(0, A.length() / 2);                  //   Simple
        String b = "";

        if (A.length() % 2 == 0) {                                  //   If odd we need to move one digit over
            b = A.substring(A.length() / 2);
        } else {
            b = A.substring((A.length() / 2) + 1 );
        }

        for (int i = 0; i < a.length(); i++) {                      //   Run through the two strings to check,
            if(a.charAt(i) != b.charAt(b.length() - (i + 1))) {     // sub by i + 1, otherwise we would be
                return "No";                                        // outside the String's index
            }
        }

        return "Yes";
    }






} //<--END

