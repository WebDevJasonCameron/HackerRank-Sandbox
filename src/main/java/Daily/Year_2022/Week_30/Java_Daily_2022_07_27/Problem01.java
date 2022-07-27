/**
 *      Problem 01
 *
 *      In a tag-based language like XML or HTML, contents are enclosed
 *      between a start tag and an end tag like <tag>contents</tag>.
 *      Note that the corresponding end tag starts with a /.
 *
 *      Given a string of text in a tag-based language, parse this text
 *      and retrieve the contents enclosed within sequences of
 *      well-organized tags meeting the following criterion:
 *
 *      1. The name of the start and end tags must be same. The HTML code
 *         <h1>Hello World</h2> is not valid, because the text starts with
 *         an h1 tag and ends with a non-matching h2 tag.
 *
 *      2. Tags can be nested, but content between nested tags is considered
 *         not valid. For example, in <h1><a>contents</a>invalid</h1>,
 *         contents is valid but invalid is not valid.
 *
 *      3. Tags can consist of any printable characters.
 *
 *  Input Format
 *      The first line of input contains a single integer, N
 *      (the number of lines).
 *
 *      The  subsequent lines each contain a line of text.
 *
 *  Constraints
 *      - 1 <= N <= 100
 *      - Each line contains a maximum of 10(4pwr) printable characters.
 *      - The total number of characters in all test cases will not
 *        exceed 10(6pwr).
 *
 *
 *   NOTE:
 *      While I'm finally starting to understand REGEX, the following
 *      solution was provided by RodneySHag (5 years ago).  I can now
 *      actually read what we are looking for.  I also learned about
 *      how we can use groups to complete the tags! Not only that, we
 *      target the second group to return it.  I thought I needed to
 *      somehow grab it with another patter search and place it in a
 *      variable!  I was making it extremely complicated!!!
 *
 *
 */

package Daily.Year_2022.Week_30.Java_Daily_2022_07_27;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem01{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String line = in.nextLine();

            boolean match = false;

            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);

            while (m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if(!match){
                System.out.println("None");
            }

            testCases--;
        }
    }

} //<--END
