package Daily.Year_2022.Week_29.Java_Daily_2022_07_19;

public class Init_Daily {

    public static void main(String[] args) {

        /**
        Problem01 problem01 = new Problem01();

        System.out.println(problem01.palCheck("madam"));
        System.out.println(problem01.palCheck("john"));
        System.out.println(problem01.palCheck("44444"));
        System.out.println(problem01.palCheck("3223"));
        */

        Problem02 problem02 = new Problem02();

        System.out.println(problem02.isAnagram("anagram", "margana") + " ... Should be True");
        System.out.println(problem02.isAnagram("anagramm", "marganaa") + " ... Should be False");

    }


} //<--END
