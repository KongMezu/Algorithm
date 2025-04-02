import java.util.*;
import java.util.HashMap;
//if 문 파티

public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> MBTImap = new HashMap<>();
        MBTImap.put('R', 0);
        MBTImap.put('C', 0);
        MBTImap.put('J', 0);
        MBTImap.put('A', 0);
        MBTImap.put('T', 0);
        MBTImap.put('F', 0);
        MBTImap.put('M', 0);
        MBTImap.put('N', 0);


        //
        for (int i = 0; i < survey.length; i++) {
            String[] surveyArr = survey[i].split(" ");
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] < 4) { // 점수가 4점 미만(즉 3점 이하) 왼쪽이
                MBTImap.put(survey[i].charAt(0), MBTImap.get(survey[i].charAt(0)) + 4 - choices[i]);
            } else { //아님 오른쪽이 점수 먹기
                MBTImap.put(survey[i].charAt(1), MBTImap.get(survey[i].charAt(1)) + choices[i] - 4);
            }

        }

        if (MBTImap.get('R') >= MBTImap.get('T')) {
            answer = "R";
        } else
            answer = "T";

        if (MBTImap.get('C') >= MBTImap.get('F')) {
            answer += "C";
        } else
            answer += "F";

        if (MBTImap.get('J') >= MBTImap.get('M')) {
            answer += "J";
        } else
            answer += "M";

        if (MBTImap.get('A') >= MBTImap.get('N')) {
            answer += "A";
        } else
            answer += "N";


        return answer;

    }
}
