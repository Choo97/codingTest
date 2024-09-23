package org.example.programers.basic_training;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class P181851 {

    public static int solution(int[] rank, boolean[] attendance) {
        // 참석 가능한 학생들만 선별하여 (등수, 학생 번호) 형태로 저장
        ArrayList<int[]> eligibleStudents = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                eligibleStudents.add(new int[]{rank[i], i});
            }
        }

        // 등수를 기준으로 정렬
        Collections.sort(eligibleStudents, Comparator.comparingInt(a -> a[0]));

        // 상위 3명의 학생 번호 추출
        int a = eligibleStudents.get(0)[1];
        int b = eligibleStudents.get(1)[1];
        int c = eligibleStudents.get(2)[1];

        // 결과 계산
        return 10000 * a + 100 * b + c;
    }
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};

        // 함수 호출 및 결과 출력
        System.out.println(solution(rank, attendance));  // 출력: 20403
    }
}
