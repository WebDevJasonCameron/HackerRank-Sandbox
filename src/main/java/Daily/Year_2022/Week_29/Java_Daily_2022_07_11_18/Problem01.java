/**
 *      Problem 01
 *
 *      Given a string, s, and two indices, start and end, print a substring consisting
 *      of all characters in the inclusive range from start to end -1. You'll find the
 *      String class' substring method helpful in completing this challenge.
 *
 *  Input Format
 *
 *      The first line contains a single string denoting .
 *      The second line contains two space-separated integers denoting the
 *      respective values of start and end.
 *
 */

package Daily.Year_2022.Week_29.Java_Daily_2022_07_11_18;

import java.util.*;

public class Problem01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        Problem01 problem01 = new Problem01();
        problem01.breakString(S, start, end);

    }

    public void breakString(String S, int start, int end){
        System.out.println(S.substring(start, end));
    }
}
