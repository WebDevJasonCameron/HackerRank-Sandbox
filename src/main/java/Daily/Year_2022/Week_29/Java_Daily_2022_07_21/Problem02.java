/**
 *      Problem 01
 *
 *      Using Regex, we can easily match or search for patterns in a text.
 *      Before searching for a pattern, we have to specify one using some
 *      well-defined syntax.
 *
 *      In this problem, you are given a pattern. You have to check whether
 *      the syntax of the given pattern is valid.
 *
 *  Note:
 *      In this problem, a regex is only valid if you can compile it using
 *      the Pattern.compile method.
 *
 * Input Format
 *      The first line of input contains an integer N, denoting the number
 *      of test cases. The next N lines contain a string of any printable
 *      characters representing the pattern of a regex.
 *
 * Output Format
 *      For each test case, print Valid if the syntax of the given pattern
 *      is correct. Otherwise, print Invalid. Do not print the quotes.
 *
 *
 * NOTE:
 *      I do not understand how this works!!! I looked up help and found this
 *      solution (without an explanation).  I need to read more from the docs.
 *      https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29
 *
 *
 */

package Daily.Year_2022.Week_29.Java_Daily_2022_07_21;
import java.util.Scanner;
import java.util.regex.*;

public class Problem02 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern p = null;
                p = p.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
