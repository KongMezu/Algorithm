
/*
n개의 개인정보 
모든 달: 28일
아 길다..
그럼.. HashMap 써야겠네..
key : 약관 종류 / value : 개인정ㅇ보 수집일자
*/
import java.util.*;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int dayForM = 28;
        int todayY = Integer.parseInt(today.substring(0, 4));
        int todayM = Integer.parseInt(today.substring(5, 7));
        int todayD = Integer.parseInt(today.substring(8, 10));

        int totalDay = (todayY * 12 * dayForM) + (todayM * dayForM) + todayD;

        // 정답 배열
        List<Integer> list = new ArrayList<>();
        // 해시맵 사용
        HashMap<Character, Integer> termsMap = new HashMap<>();

        // 해시맵 데이터 삽입
        for (String term : terms) {
            char term0 = term.charAt(0);
            int termM = Integer.parseInt(term.substring(2));
            termsMap.put(term0, termM);
        }

        // 일자 계산
        for (int i = 0; i < privacies.length; i++) {
            char privacy = privacies[i].charAt(11);

            int privacyY = Integer.parseInt(privacies[i].substring(0, 4));
            int privacyM = Integer.parseInt(privacies[i].substring(5, 7));
            int privacyD = Integer.parseInt(privacies[i].substring(8, 10));
            int totalPrivacyDay = (privacyY * 12 * dayForM) + (privacyM * dayForM) + privacyD;

            int termM = termsMap.get(privacy);
            int termD = termM * dayForM;

            if (totalPrivacyDay + termD <= totalDay) {
                list.add(i + 1);
            }
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
