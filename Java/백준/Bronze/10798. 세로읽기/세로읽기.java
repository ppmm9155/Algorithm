import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        A-Z, a-z, 0-9
        한줄 최대 5
        세로로 위에서 아래로
        해당 자리에 글자가 없으면 읽지 않고, 건너뛴다

        A A B C D D
        a f z z
        0 9 1 2 1
        o 8 E n g 6
        P 5 h 3 k x

        (ex D1gk, D6x


        출력할 때 세로로 읽은 순서대로 글자를 출력
        입력 시
        세로 5줄 가로 15글

        배열에 word 저장
        인덱스 순번 순으로

         */

        String S;
        char[][] word = new char[5][15];

        //배열 저장
        for(int i=0;i<word.length;i++) 
        {
            S= sc.next();
            for(int j=0;j<S.length();j++)
            {
                word[i][j] = S.charAt(j);
            }
        }
        //세로로 읽기
        for(int k=0;k<word[0].length;k++) //0~14
        {
            for(int l=0;l<word.length;l++) //0~4
            {
                //배열에 초기값이 아닌경우만 출력
                if(word[l][k] !='\0')
                {
                    System.out.print(word[l][k]);
                }
            }
        }


    }
}
