package ee.itcollage.level9;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {

        String  newString = Stream.generate(() -> s).limit(x).collect(Collectors.joining());
                //newString = Collections.nCopies(x, s).stream().collect(Collectors.joining(""));

        /*String newString = Stream.generate(() -> "qwe").limit(3).collect(Collectors.joining());

        String newString = String.join("", Collections.nCopies(n, s));*/

        return newString;
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        String chars = "";
        return chars;
    }
}
