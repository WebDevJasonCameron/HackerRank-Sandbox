package Assessments.Congnizant;

class Parser {

    boolean isBalanced(String s){

        // ATT
        boolean flag = false;

        // INTI CHECK
        if( s.length() % 2 != 0) return false;
        if(s.length() == 0) flag = true;

        for (int i = 0; i < s.length(); i++) {
            String modS = s.substring(i);
            if(s.charAt(i) == '{') {
                flag = findMate('}', modS);
            }
            else if(s.charAt(i) == '(') {
                flag = findMate(')', modS);
            }
        }
        return flag;
    }


    boolean findMate(char m2, String modS){

        if(modS.length() < 3) return false;

        if(modS.isEmpty()) return false;

        for (int i = 0; i < modS.length(); i++) {
            if(modS.charAt(i) == m2) {
                return true;
            }
        }
        return false;
    }


}
