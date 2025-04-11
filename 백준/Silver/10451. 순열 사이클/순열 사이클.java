import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int [] arr; //순열 저장
    static boolean [] visited; // 방문 여부 체크 배열

    static void dfs(int index){
        visited[index] = true;

        int nextindex = arr[index];
        if(!visited[nextindex]){
            dfs(nextindex);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            visited = new boolean[n + 1];
            st = new StringTokenizer(br.readLine());
            
            for (int i = 1; i < n+1; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0);
            int Loop = 0;
            for (int i = 1; i < n + 1; i++) {
                if (!visited[i]) {
                    dfs(i);
                    Loop++;
                }
            }System.out.println(Loop);
        }

    }
}

