/**     Problem 01
 *
 *
 *      The Calendar class is an abstract class that provides methods for converting
 *      between a specific instant in time and a set of calendar fields such as YEAR,
 *      MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar
 *      fields, such as getting the date of the next week.
 *      =====
 *      You are given a date. You just need to write the method,getDay, which returns
 *      the day on that date. To simplify your task, we have provided a portion of
 *      the code in the editor.
 *
 *
 *      NOTE: This works as it does in Java 8.  We can delete the excess int vars
 *      in later Java versions.  Also, we needed to import the java.time.LocalDate
 *      package ... I don't know if this still applies in Java 17
 *
 *      (https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html)...
 */

package Daily.Year_2022.Week_28.Java_Daily_2022_07_14;
import java.time.LocalDate;

public class Problem01 {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);

        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();

    }

}
