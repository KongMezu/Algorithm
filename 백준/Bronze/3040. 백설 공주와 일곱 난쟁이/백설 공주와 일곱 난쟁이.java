import java.io.*;

public class Main {

    static int[] input;
    static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = new int[9];
        result = new int[7];

        for(int i = 0; i < 9; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        hat(0, 0);
    }

    private static void hat(int cnt, int start) {
        if(cnt==7) {
            int sum = 0;
            for(int i = 0; i < 7; i++) {
                sum += result[i];
            }
            if(sum==100) {
                for(int i = 0; i < 7; i++) {
                    System.out.println(result[i]);
                }
            }
            return;
        }
        for(int i = start; i<9; i++) {
            result[cnt] = input[i];
            hat(cnt+1, i+1);
        }
    }
}