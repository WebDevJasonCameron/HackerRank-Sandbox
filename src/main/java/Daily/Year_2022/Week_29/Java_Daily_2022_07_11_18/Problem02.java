/**
 *      Problem 01
 *
 *      -> Lexicographical Order, also known as alphabetic or dictionary order, orders
 *         characters as follows:  a<b<...<y<z<a<b<...<y<z
 *      For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 *
 *      -> A substring of a string is a contiguous block of characters in the string. For
 *         example, the substrings of abc are a, b, c, ab, bc, and abc.
 *
 *          Given a string, s, and an integer, k, complete the function so that it finds the
 *          lexicographically smallest and largest substrings of length k
 *
 *  Function Description
 *      Complete the getSmallestAndLargest function in the editor below.
 *
 *      getSmallestAndLargest has the following parameters:
 *
 *          string s: a string
 *          int k: the length of the substrings to find
 *
 *  Returns
 *      string: the string ' + "\n" + ' where and are the two substrings
 */

package Daily.Year_2022.Week_29.Java_Daily_2022_07_11_18;

import java.util.Scanner;

public class Problem02 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i < s.length() - (k - 1); i++) {
            String substring = s.substring(i, i + k );
            if(substring.compareTo(smallest) <= 0) smallest = substring;
            else if (substring.compareTo(largest) >= 0) largest = substring;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
