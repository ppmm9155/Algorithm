import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력
         */
        
        int T;
        String S;
        T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            S = sc.next();
            int StringNum = S.length();
            //첫번쨰
            char first = S.charAt(0);
            //끝
            char end = S.charAt(StringNum-1);

            System.out.println(""+first+end);
        }


    }
}
