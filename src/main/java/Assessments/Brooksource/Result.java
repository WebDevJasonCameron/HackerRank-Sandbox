package Assessments.Brooksource;

class Result {

    public static String breakPalindrome(String palindromeStr) {

        // Inside Checks...
        System.out.println(palindromeStr);


        // ATT
        String output = "";
        boolean flag = false;
        int countB = 0;
        char[] charArray = palindromeStr.toCharArray();

        // INIT CHECKS
        if(charArray.length <= 1) return "IMPOSSIBLE";
//        if(palindromeStr.length() % 2 != 0) return "IMPOSSIBLE";

        // METHS

        flag = palCheck(charArray);

        if(flag && countB % 2 == 0){
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
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] != 'a') return true;
        }
        return false;
    }

}
