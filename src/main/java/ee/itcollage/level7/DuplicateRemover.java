package ee.itcollage.level7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers)
    {
        Set<Integer> duplicateFreeList = new HashSet<Integer>(numbers);
        numbers.clear();
        numbers.addAll(duplicateFreeList);
        return numbers;
    }
}
