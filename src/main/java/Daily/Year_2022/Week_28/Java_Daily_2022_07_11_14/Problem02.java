/**     Problem 02
 *
 *
 *      Given a double-precision number, payment, denoting an amount of money, use the
 *      NumberFormat class' getCurrencyInstance method to convert payment into the US,
 *      Indian, Chinese, and French currency formats. Then print the formatted
 *      values as follows:
 *
 *      RESEARCH:
 *          1. Locale class
 *          2. Instantiate Locale class
 *          3. NumberFormat class
 *          4. getCurrencyInstance from NumberFormat class
 *
 *      CLASS: NumberFormat
 *      (https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html)
 *
*/

package Daily.Year_2022.Week_28.Java_Daily_2022_07_11_14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                   //   Get input
        double payment = scanner.nextDouble();                      //   Already a double
        scanner.close();
                                                                    //   India not covered in getCurrencyInstance
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + us.format(payment));            //   As a NumberFormat class, each inherits
        System.out.println("India: " + india.format(payment));      // the format method.  This was set according
        System.out.println("China: " + china.format(payment));      // to the getCurrencyInstance method when we
        System.out.println("France: " + france.format(payment));    // instantiated each obj instance
    }
}
