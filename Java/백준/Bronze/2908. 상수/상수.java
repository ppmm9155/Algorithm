import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        (ex 상수의 수를 734 , 893 이면 반대로 437 , 398로 읽음
        따라서 두개의 상수중 큰수인 437을 큰수라고 말함

        첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
        두수는 같지 않은 세자리수 이며, 0이 포함되어 있지않다.

         */
        int max;
        max =0;

        String S;
        S = sc.nextLine();
        StringBuilder sb = new StringBuilder(S);

        sb.reverse();

        String s1 = sb.substring(0,3);
        String s2 = sb.substring(4,7);

        int intS1 = Integer.valueOf(s1).intValue();
        int intS2 = Integer.valueOf(s2).intValue();

        max = intS1;

        if(intS2>max)
        {
            max = intS2;
        }

        System.out.println(max);

    }
}
