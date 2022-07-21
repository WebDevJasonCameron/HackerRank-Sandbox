package Daily.Year_2022.Week_29.Java_Daily_2022_07_11_21;

public class Init_Daily {

    public static void main(String[] args) {

        Problem01 problem01 = new Problem01();

        String S = "Will this work? I Don't Know!!!";

        System.out.println(S);
        System.out.println(problem01.stripMarks(S));
        problem01.makeArray(S);

        problem01.printArray(problem01.makeArray(problem01.stripMarks(S)));

    }


} //<--END
