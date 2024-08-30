package org.example.programers;

public class P181913 {

    public String solution(String my_string, int[][] queries) {

        String answer = "";






        for (int i = 0; i < queries.length; i++) {


                String second = my_string.substring(queries[i][0], queries[i][1]+1);
                StringBuffer sb = new StringBuffer(second);
                sb = sb.reverse();

                String first = my_string.substring(0, queries[i][0]+1);
                String third = my_string.substring(queries[i][1], my_string.length()+1);



        }

//        System.out.println(substring);

        return answer;
    }

    public static void main(String[] args) {
        P181913 p181913 = new P181913();

        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}};

        p181913.solution(my_string, queries);
    }

}
