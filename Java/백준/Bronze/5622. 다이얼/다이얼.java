
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에
        금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
        숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고,
        다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다

        숫자 1을 걸려면 총 2초가 필요하다.
        한칸 옆에 있는 수자를 걸기 위해선 1초씩 더걸린다.
        1 -> 2 , 2 -> 3 .. 0 -> 11

        상근할매는 전화번호를 각 숫자에 해당하는 문자로 외운다
        각 알파벳에 해당하는 숫자를 걸면된다.
        UNUCIC 는 868242 와 같다.
        다이얼 버튼           걸리는시간
        0 2번 버튼: A, B, C      3
        1 3번 버튼: D, E, F      4
        2 4번 버튼: G, H, I      5
        3 5번 버튼: J, K, L      6
        4 6번 버튼: M, N, O      7
        5 7번 버튼: P, Q, R, S   8
        6 8번 버튼: T, U, V      9
        7 9번 버튼: W, X, Y, Z   10
         */

        /*
        문자열 알파벳 입력
        문자열 입력된 알파벳 몇번 버튼인지 확인
        확인후 각 알파벳 걸리는시간 더한다
        걸리는 시간 출력

        2차원 배열로 다이얼 버튼 만든다음에
        버튼 해당되면 걸리는 시간 더하고 출력하면 되지않나
         */
        int hap;
        hap =0;
        String S;

        //다이얼
        char [][]dial = {{'A','B','C'},{'D','E','F'},
                {'G','H','I'},{'J','K','L'},
                {'M','N','O'},{'P','Q','R','S'},
                {'T','U','V'},{'W','X','Y','Z'}};

        S = sc.next();
        //알파벳 char s로 나누어서
        for(int i=0;i<S.length();i++)
        {
            char s = S.charAt(i);
            //다이얼 배열에 알파펫s 있는지 확인후 걸리는시간 각각 더함
            for(int j=0;j<dial.length;j++)
            {
                for(int k=0;k<dial[j].length;k++)
                {
                    if(dial[j][k] == s) {
                        hap += j + 3;
                        break;
                    }
                }
            }
        }

        System.out.println(hap);



    }
}
