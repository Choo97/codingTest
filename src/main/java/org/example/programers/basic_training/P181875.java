package org.example.programers.basic_training;

public class P181875 {

    public String[] solution(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].toUpperCase();
        }

        for (int i = 0; i < strArr.length; i +=2) {
            strArr[i] = strArr[i].toLowerCase();
        }

        return strArr;
    }

}
