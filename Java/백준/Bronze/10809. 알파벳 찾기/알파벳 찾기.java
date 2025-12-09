import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        알파벳 소문자 단어 S
         단어가 포함된 경우 처음 등장하는 위치를 ,
          포함되어 있지 않은 경우에는 -1

          a가 처음등장하는 위치, ...Z가
          공백으로 구분해서 출력
          어떤 알파벳이 단어에 포함되어있지 않으면 -1
          첫번째 글자는 0번쨰 위치 두번째는 1번쨰 위치
         */

        Scanner sc = new Scanner(System.in);

        String word;

        word = sc.nextLine();
        //(ex baekjoon
        char[] Word = new char[word.length()];

        //일단 단어 char[] 배열에 저장
        for(int i=0;i<word.length();i++)
        {
            Word[i]=word.charAt(i);
        }

        //char j 가 소문자 a..b..c...z 까지
        for(char j='a';j<123;j++)
        {
            int foundIndex = -1;
            for(int k=0;k<word.length();k++)
            {
                if (Word[k]==j)
                {
                    foundIndex = k;
                    break;
                }
            }
            System.out.print(foundIndex+" ");

        }

        //아 String 클래스 indexOf(String str)


    }
}
