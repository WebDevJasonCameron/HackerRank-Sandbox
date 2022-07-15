/**     Problem 01
 *
 *      This exercise is to test your understanding of Java Strings. A sample
 *      String declaration:
 *
 *      String myString = "Hello World!"
 *
 *      The elements of a String are called characters. The number of characters
 *      in a String is called the length, and it can be retrieved with the
 *      String.length() method.
 *
 *      Given two strings of lowercase English letters,  and , perform the following
 *      operations:
 *
 *      1. Sum the lengths of A and B.
 *      2. Determine if A is lexicographically larger than B (i.e.: does B come before A
 *         in the dictionary?).
 *      3. Capitalize the first letter in A and B and print them on a single line,
 *         separated by a space.
 *
 *
 *      Input Format
 *
 *      The first line contains a string A. The second line contains another string B.
 *      The strings are comprised of only lowercase English letters.
 *
 *      There are three lines of output:
 *
 *      - For the first line, sum the lengths of A and B.
 *      - For the second line, write Yes if A is lexicographically greater than B otherwise
 *        print No instead.
 *      - For the third line, capitalize the first letter in both A and B and print them
 *        on a single line, separated by a space.
 *
 *      HELP:
 *      (https://www.geeksforgeeks.org/compare-two-strings-lexicographically-in-java/)
 *
 */


package Daily.Year_2022.Week_28.Java_Daily_2022_07_11_15;

import java.util.*;

public class Problem01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        Problem01 problem01 = new Problem01();

        problem01.sumOfStrings(A, B);
        problem01.compareStringValue(A, B);
        problem01.combineStrings(A, B);

    }

    public void sumOfStrings(String A, String B){
        System.out.println(A.length() + B.length());
    }

    public void compareStringValue(String A, String B){

        if(A.compareTo(B) > B.compareTo(A)) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }

    public void combineStrings(String A, String B){

        String a = A.substring(0,1).toUpperCase() + A.substring(1);
        String b = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(a + " " + b);

    }


}  //<--END


