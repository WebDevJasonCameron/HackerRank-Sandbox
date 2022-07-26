/**
 *      Code for this copied from:
 *      https://www.youtube.com/watch?v=vuv5oAfRoQA
 */

package Playgrounds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPlayground01 {

    // RUN
    public static void main(String[] args) {

        displayFind("(Lizard)[sz]","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("(lizard)[sz]","Is a snake a lizard?");
        displayFind("Lizard[sz]","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("(Lizards)|(Lizardz)","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("(Lizard)s|(Lizard)z","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("(Lizard)[s]|(Lizard)[z]","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("((Lizard)[s])|((Lizard)[z])","Should I name my new pet store Happy Lizards or Happy Lizardz?");
        displayFind("(Lizard)[sz]|(my)","Should I name my new pet store Happy Lizards or Happy Lizardz?");

    }

    // METH
    static void displayFind(String regex, String searchMe){
        boolean foundIt = false;
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(searchMe);
        Matcher m = Pattern.compile(regex).matcher(searchMe);

        while ((m.find())) {
            System.out.println("Matcher found " + m.group() + "at index " + m.start() + " for regex " + regex + " in string \"" + searchMe + "\"");
            foundIt = true;
        }
        if(!foundIt){
            System.out.println("No matches found for " + regex + " in string \"" + searchMe + "\'");
        }
        System.out.println("");

    }


} //<--END
