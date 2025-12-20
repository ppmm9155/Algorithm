import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        문자가 2개인 연립방정식을 해결하는방법
        ax + by = c
        dx + ey = f

        -900 이상 999 이하 정수만 입력

        a,b,c,d,e,f 가 공백으로 구분되어 차례대로 주어진다.
        (-999<= a,b,c,d,e,f <= 999)

        입력
        문제에서 언급한 방정식을 만족하는 (x,y) 가 유일 하게 존재
        이 떄 x와 y가 각각 조건에 맞는 정수인 경우만 입력으로

        출력 x와 y를 공백으로 구분해 출력

        연립방정식은 가감법,대입법 으로 푼다
        근데 너무 복잡하네

        다 대입 하자
        x , y 유일하게 존재하니까
         */

        //입력
        int a,b,c,d,e,f;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        // x , y ax by c and dx ey =f 나오는 값만
        for(int x=-999;x<=999;x++)
        {
            for(int y=-999;y<=999;y++)
            {
                if(a*x + b*y ==c && d*x + e*y ==f)
                {
                    System.out.println(x+" "+y);
                    return;
                }

            }
        }




    }
}
