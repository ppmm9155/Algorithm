import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
        주어진 글자의 아스키 코드값을 출력
         */
        char c = sc.next().charAt(0);

        System.out.println((int)c);

    }
}
