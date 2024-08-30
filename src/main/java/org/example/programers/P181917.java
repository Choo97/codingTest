package org.example.programers;

public class P181917 {

//    v는 t 우선 , n은 f 우선
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean res1;
        boolean res2;

        res1 = matchV(x1, x2);
        res2 = matchV(x3, x4);
        return matchN(res1, res2);
    }

    private boolean matchV(boolean x, boolean y) {

        if (x == false && y == false) {
            return false;
        } else {
            return true;
        }
    }

    private boolean matchN(boolean x, boolean y) {

        if (x ==  true && y == true) {
            return true;
        } else {
            return false;
        }
    }
}
