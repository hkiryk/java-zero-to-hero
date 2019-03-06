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

        //String  newString = Stream.generate(() -> s).limit(x).collect(Collectors.joining());

        // String newString = Collections.nCopies(x, s).stream().collect(Collectors.joining(""));

        //String newString = String.join("", Collections.nCopies(x, s));
        if (x<0) x=0;
        StringBuilder c = new StringBuilder(x * s.length());
        for (int i = 0; i < x; i += 1) {
            c.append(s);
        }
        String newString = c.toString();
        return newString;
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        if (x1<0) x1=0;
        if (x2<0) x2=0;

        StringBuilder a = new StringBuilder(x1 * s1.length());
        for (int i = 0; i < x1; i += 1) {
            a.append(s1);
        }
        StringBuilder b = new StringBuilder(x2 * s2.length());
        for (int i = 0; i < x2; i += 1) {
            b.append(s2);
        }
        String chars = a.toString() + b.toString();
        return chars;
    }
}
