/**     Problem 01
 *
 *
 *      Static initialization blocks are executed when the class is loaded, and you can
 *      initialize static variables in those blocks.
 *
 *      It's time to test your knowledge of Static initialization blocks. You can read
 *      about it here: https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
 *
 *      You are given a class Solution with a main method. Complete the given code so
 *      that it outputs the area of a parallelogram with breadth  and height . You should
 *      read the variables from the standard input.
 *
 *      If  or  , the output should be "java.lang.Exception: Breadth and height must be
 *      positive" without quotes.
 *
 *  Input Format
 *
 *      There are two lines of input. The first line contains : the breadth of
 *      the parallelogram. The next line contains : the height of the parallelogram.
 *
 *
 */

/** My Thoughts:
 *
 *          I think this is specifically talking about try catch methods.  These are, in essence
 *          the Initializing Fields.  The code is very simple.  However, you need to figure out
 *          that, in order for this to work, you will need to use a scanner method.  This is not
 *          in the given code.  Most of these problems require you to figure what is and isn't
 *          in the give code.  Can you change it?  I found that most of the given code was locked.
 */

package Daily.Year_2022.Week_28.Java_Daily_2022_07_13;
import java.util.*;

public class Solution {

    // ATT
    static Scanner s = new Scanner(System.in);              //   Did not ask for this, but needed
    static int B = s.nextInt();                             //   Standard
    static int H = s.nextInt();
    static boolean f = true;

    // Static initialization blocks
    static {
        try {
            if(B <= 0 || H <= 0){
                f = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(f){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}  //<--END
