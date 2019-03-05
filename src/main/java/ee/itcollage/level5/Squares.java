package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 will be
     * 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        List<Integer> squareList= new ArrayList<>();
        for (Integer integer : integers) {
            int square = integer*integer;
            squareList.add(square);
        }

        return squareList;
    }
}
