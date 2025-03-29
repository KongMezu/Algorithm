import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    static int line[];
    static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int K;
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        line = new int[K];
 
        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            line[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(line);
 
        binarySearch();
    }
    public static void binarySearch(){
        long st,ed,mid;
        st = 1;
        ed = line[line.length-1];
        while(st <= ed){
            long count = 0;
            mid = (st + ed) / 2;
            for(int i = 0; i < line.length; i++){
                    count += line[i] / mid;
            }
            if(count >= N)
                st = mid + 1;
            else
                ed = mid - 1;
        }
        System.out.println(ed);
    }
}
 