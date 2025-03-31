import java.util.*;
// 넘버 키 패드 문제
// 그럼..아 어려워... 뭐야 이거
// 좌표??? * = 10 / 0 = 11 / # = 12
// x 좌표를 기준으로 하면 1,2,3 = 0 4,5,6 = 1 7,8,9 = 2 3
// 1 = (0,0) // 2 = (0,1) .. 일일히 다 넣어야 하나 음......이거 이렇게 푸는거 아닌거 같은데...
// x : (숫자 - 1 ) / 3  y : (숫자 -1) %3

// 아니 다 통과된 것도 아니고 2개만 통과는 뭐ㅑ?
public class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10; //* 시작
        int r = 12; // # 시작

        for (int i = 0 ; i<numbers.length ; i++) {
            // 1,4,7 / 3 6 9 는 무조건 왼손 오른속 FIX
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer+="L";
                l = numbers[i];
            }
            else if(numbers[i]==3 || numbers[i]==6|| numbers[i]==9){
                answer+="R";
                r = numbers[i];

            }
            else {
                // 2, 5, 8, 0 의 경우
                // 왼손 오른손 길이 비교 후 더 가까운 쪽이 누르는 걸로
                if(numbers[i]==0){
                    numbers[i]+=11;
                }
                int Ldis = (Math.abs(numbers[i]-l))/3 + (Math.abs(numbers[i]-l))%3;
                int Rdis = (Math.abs(numbers[i]-r))/3 + (Math.abs(numbers[i]-r))%3;

                if(Ldis==Rdis){
                    if(hand.equals("left")){ //입력값 제대로 안보고 L 집어넣음 그럼 나머진 어케 맞춘겨
                        answer+="L";
                        l=numbers[i];
                    }
                    else{
                        answer+="R";
                        r=numbers[i];
                    }

                } else if (Ldis< Rdis) {
                    answer+="L";
                    l=numbers[i];

                } else{
                    answer+="R";
                    r=numbers[i];
                }


            }
        }
        return answer;
    }
}
