/**     Problem 02
 *
 *
 *      You are given an integer , you have to convert it into a string.
 *
 *      Please complete the partially completed code in the editor. If your
 *      code successfully converts  into a string  the code will print "Good job".
 *      Otherwise, it will print "Wrong answer".
 *
 *      can range between -100  to 100 inclusive.
 *
 *
 */


package Daily.Year_2022.Week_28.Java_Daily_2022_07_13;

import java.util.*;
import java.security.*;
public class Problem02 {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();


            String s = String.valueOf(n);               //   This all they were looking for


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}  //<--END
