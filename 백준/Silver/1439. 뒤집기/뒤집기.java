// 1. 0과 1을 연속된 그룹을 나뉘기
// 2. 그룹으로 나눠서 그룹 개수로 매핑 했을 때, 그룹개수가 더 적은쪽을 뒤집기

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int ZeroGroup = 0;
        int OneGroup = 0;

        if (s.charAt(0)=='0') {
            ZeroGroup++;
        }
        else{
            OneGroup++;
        }
        //아하..!
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                if(s.charAt(i)=='0'){
                    ZeroGroup++;
                }else{
                    OneGroup++;
                }
            }
        }
        System.out.println (Math.min(ZeroGroup,OneGroup));
    }
}