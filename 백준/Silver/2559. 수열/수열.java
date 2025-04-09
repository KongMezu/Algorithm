import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;

//  N = 온도 개수
// K = 연속으로 몇개의 날짜를 셀 것인가
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] arr = new int[n+1];
        int[] prefixsum = new int[n+1]; // 누적합 배열 arr[0] + .. + arr[i-1] 까지

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefixsum[i] = prefixsum[i-1] + arr[i]; //누적합 계산

        }

        int max = Integer.MIN_VALUE;
        for (int i = k; i <= n; i++) { // 연속된 배열 K구간까지 탐색
            max = Math.max(max, prefixsum[i] - prefixsum[i-k]);
        }

        System.out.println(max);
    }
}