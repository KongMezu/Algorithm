import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;

// 1) 현재 는 1열로 서있음
// 2) 맨 앞 사람만 이동가능
// 3) 스택
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 학생 번호표 수
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int now = 1;

        for (int i = 0; i < N; i++) {
            if (arr[i] == now) {
                now++; // now 값을 1씩 증가 시켜서 다음 번호 확인
                while (!stack.isEmpty() && stack.peek() == now) {
                    stack.pop(); // 팝 시키고
                    now++; // now 증가
                }
            } else{ //현재 받을 순서 X 다른번호
                stack.push(arr[i]); //대기열
            }
        }
        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }

}
