import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 국가 수 : N / 비행기 종류 : M
//BFS 사용 해야할듯
//
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트케이스입력

        for(int t = 0; t< T; t++){ //테케만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine()); //공백기준
            int n = Integer.parseInt(st.nextToken()); // 국가 수 n
            int m = Integer.parseInt(st.nextToken()); // 비행기 종류 m
            for(int i =  0 ; i< m; i++){ // 무시
                br.readLine();
            }
            System.out.println(n-1); //최소 여행 간선수  N-1
        }


    }
}
