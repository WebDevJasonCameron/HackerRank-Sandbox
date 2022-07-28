/**
 *      Problem 01
 *
 *      Java's BigDecimal class can handle arbitrary-precision signed
 *      decimal numbers. Let's test your knowledge of them!
 *
 *      Given an array, s, of n real number strings, sort them in descending
 *      order — but wait, there's more! Each number must be printed in the
 *      exact same format as it was read from stdin, meaning that .1 is printed
 *      as .1, and 0.1 is printed as 0.1. If two numbers represent numerically
 *      equivalent values (e.g., .1 == 0.1), then they must be listed in the
 *      same order as they were received as input).
 *
 *      Complete the code in the unlocked section of the editor below. You
 *      must rearrange array s's elements according to the instructions above.
 *
 *  Input Format
 *
 *      The first line consists of a single integer, n, denoting the number of
 *      integer strings.
 *      Each line i of the n subsequent lines contains a real number denoting
 *      the value of s.
 *
 * Constraints
 *      - 1 <= n <= 200
 *      - Each s(lower i) has at most 300 digits.
 *
 *  Output Format
 *      Locked stub code in the editor will print the contents of array  to stdout.
 *      You are only responsible for reordering the array's elements.
 *
 *
 */

package Daily.Year_2022.Week_30.Java_Daily_2022_07_28;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.rotateLeft;

class Problem01{
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n + 2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        s = descArray(n, s);

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }

    public static String[] descArray(int n ,String[] s){
        String[] hold = s;
        String[] out = new String[n];



        for (int i = 0; i < n; i++) {
            String checker = s[i].toString();
            String winner = "";

            for (int j = 0; j < n; j++) {

                if(parseInt(checker) == parseInt(s[j])) {
                    winner = checker;
                    System.out.println("winner ==: " + winner);
                } else if(parseInt(checker) > parseInt(s[j])) {
                    winner = checker;
                    System.out.println("winner >: " + winner);
                } else {
                    winner = s[j];
                    System.out.println("winner else: " + winner);
                }
            }

            out[i] = winner;

        }

        return out;
    }


} //<--END
