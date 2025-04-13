import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    static final int size =100;
    static int[][] ladder = new int[size][size];
    static int result=0;
    static int[] dx= {-1,0,0};
    static int[] dy= {0,-1,1};
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
         
        int T = 10;
         
        for(int testcase =1; testcase<=T;testcase++) {
            br.readLine().trim();
            for(int row = 0; row<size-1;row++) {
                st = new StringTokenizer(br.readLine().trim());
                for(int col =0; col<size;col++) {
                    ladder[row][col] = Integer.parseInt(st.nextToken());
                }
            }
            st = new StringTokenizer(br.readLine().trim());
             
            int start_col=0;
            for(int col =0; col<size;col++) {
                int num = Integer.parseInt(st.nextToken());
                ladder[size-1][col] =num;
                if (num==2) start_col = col;
                 
            }
             
            solution(size-1, start_col, 0);
             
            sb.append("#"+testcase+" "+result+"\n");
        }
         
        System.out.println(sb);
 
    }
     
    //direction -> 0: 위로, 1:왼쪽 , 2:오른쪽
    public static void solution(int row, int col, int direction) {
        if(row ==0) {
            result=col;
            return;
        }

        direction = check(row,col,direction);
        int nx = dx[direction] +row;
        int ny = dy[direction] +col;
         
        solution(nx, ny, direction);
         
         
    }
     
    public static int check(int row, int col,int direction) {
        if(direction ==0) {
            int ny = col+dy[1];
             
            if( ny>=0 && ny<size) {
                if(ladder[row][ny]==1) return 1;
            }
             
            ny = col+dy[2]; 
             
            if( ny>=0 && ny<size) {
                if(ladder[row][ny]==1) return 2;
            }
             
            return 0;
        }
        else {
            int nx = row+dx[0]; 
            if(ladder[nx][col]==1) return 0;
            else return direction;
        }
    } 
 
}