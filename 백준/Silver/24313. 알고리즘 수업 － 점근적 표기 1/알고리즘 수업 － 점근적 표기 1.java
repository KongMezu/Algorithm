import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if(a1*n0+a0 <= c * n0 && a1 <= c){ // a1, a0가 주어진다. (0 ≤ |ai| ≤ 100) 이걸 안봐서 틀림
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}