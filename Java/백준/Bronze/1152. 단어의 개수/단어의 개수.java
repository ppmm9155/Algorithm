import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        문자열 S 몇개의 단어가 있는지 한단어가 여러번 등장해도
        횟수만큼 모두 세어야한다.

        첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        단어는 공백 한개로 구분되며, 공백이 연속해서 나오는 경우는 없다.

         */

        String S;
        S= sc.nextLine();
        //StringTokenizer 이용
        StringTokenizer st = new StringTokenizer(S);

        //countTokens() 사용
        System.out.println(st.countTokens());

    }
}
