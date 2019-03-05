package ee.itcollage.level3;

public class LargestNumbest {

    //todo make tests work

    public static int pickLargest(int x1, int x2){
        int lrg;
        if (x1>x2){
            lrg = x1;
        } else {
            lrg = x2;
        }
        return lrg;
    }

    public static int pickLargest(int x1, int x2, int x3){
        int lrg1 = 0;
        if (x1>x2){
            if (x1>x3){
            lrg1 = x1;}
        } else if (x2>x3){
            lrg1 = x2;
        } else lrg1 = x3;
        return lrg1;
    }
}
