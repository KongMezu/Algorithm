import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

// a + b = x
// a = x- b
// x-b에 해당하는 a값의 개수를 증가 시킴
//해시로 풀자..걍
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        int x = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i<n; i++){
            if(set.contains(x-arr[i])){ //이렇게 하면 값이 2개 나옴
                count++;
            }
        }

        System.out.println(count/2);
    }

}
