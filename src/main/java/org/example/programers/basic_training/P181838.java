package org.example.programers.basic_training;

import java.util.Date;

public class P181838 {

    public int solution(int[] date1, int[] date2) {
        Date dateA = new Date(date1[0], date1[1], date1[2]);
        Date dateB = new Date(date2[0], date2[1], date2[2]);

        if (dateA.before(dateB)) {
            return 1;
        }

        return 0;
    }

}
