import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
        문자열 S 입력 각문자를 R번 반복함
        새 문자열 P를 만든후 출력

        첫번쨰 문자를 R번 반복하고
        두번째 문자를 R번 반복하는식으로 P를 만든다?

        S = QR Code "alphanumeric" 문자만 들어간다
        = 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./:

        첫째줄에 테스트 케이스의 개수 T 테스트케이스는 반복횟수 R
        문자열 S가 공백으로 구분되어 주어진다.

        S의 최소길이 1이며 , 20글자 넘어가지않는다,

        2  //테스트 케이스의 개수 T
        3 ABC //각문자 반복할 R , ABC  출력: AAABBBCCC
        5 /HTP 동일 출력: /////HHHHHTTTTTPPPPP

         */

        int T,R;
        R=0;
        String S;
        T = sc.nextInt(); //테스트 케이스 T
        
        
        //전체 반복
        for(int i=0;i<T;i++)
        {
            R = sc.nextInt();
            S = sc.next();
            //

            for(int j=0;j<S.length();j++)
            {
                char A = S.charAt(j);
                for(int k=0;k<R;k++)
                {
                    System.out.print(A);
                }
            }
            System.out.println();
        }
        
    }
}
