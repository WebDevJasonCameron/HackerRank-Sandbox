/**
 *      Assessment
 *
 *      Take a palindrome
 *
 */

package Assessments.Brooksource;

class Result {

    public static String breakPalindrome(String palindromeStr) {

        // Inside Checks...
        System.out.println(palindromeStr);


        // ATT
        String output = "";
        char[] charArray = palindromeStr.toCharArray();

        // INIT CHECKS
        if(charArray.length <= 1) return "IMPOSSIBLE";

        // METH
        if(palCheck(charArray)){
            for (int i = 0; i < charArray.length; i++) {
                if(charArray[i] != 'a') {
                    charArray[i] = 'a';
                    output = String.valueOf(charArray);
                    if(palCheck(charArray)){
                        return output;
                    } else {
                        return "IMPOSSIBLE";
                    }
                }
            }
        }
        return "IMPOSSIBLE";
    }

    static boolean palCheck(char[] charArray){
        for (char c : charArray) {
            if (c != 'a') return true;
        }
        return false;
    }

}
