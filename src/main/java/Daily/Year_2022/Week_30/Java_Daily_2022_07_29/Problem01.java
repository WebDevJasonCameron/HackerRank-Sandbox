/**
 *      Problem 01 (Continuation from Yesterday)
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
 *  NOTE:
 *          Answer uses a bubble sort.  Code provided by ihalilkoca (6years ago).
 *          What I need to know is what is BigDecimal?  If you hover over the
 *          method, you get the answer:
 *
 *          Immutable, arbitrary-precision signed decimal numbers.
 *          A BigDecimal consists of an arbitrary precision integer
 *          unscaled value and a 32-bit integer scale. If zero or
 *          positive, the scale is the number of digits to the right
 *          of the decimal point. If negative, the unscaled value of
 *          the number is multiplied by ten to the power of the
 *          negation of the scale. The value of the number represented
 *          by the BigDecimal is therefore (unscaledValue × 10-scale).
 *
 */

package Daily.Year_2022.Week_30.Java_Daily_2022_07_29;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

class Problem01{
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n + 2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }

                                                            //   Our Code Starts Here
        for (int i = 0; i < s.length-2; i++) {              //   Could just be set to n

            for (int j = 1; j < (n-i); j++) {               //   Subtract i, So we do not rework what has
                                                            // been done.  Note we start j at 1

                BigDecimal sj = new BigDecimal(s[j]);       //   I think Float could work instead.  Starting j
                BigDecimal sj1 = new BigDecimal(s[j-1]);    // at 1 means we can compare index 1-1, and 1

                if(sj.compareTo(sj1) == 1){                 //   This approach compares strings, not numbers!
                                                            //   if index 2 greater than index 1

                                                            //   Bubble sort:
                    String temp = s[j];                     //   Move index 2 to temp
                    s[j] = s[j-1];                          //   Move index 1 over to 2's
                    s[j-1] = temp;                          //   Move index 2 (now temp) into 1's
                }
            }
        }

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }


} //<--END
