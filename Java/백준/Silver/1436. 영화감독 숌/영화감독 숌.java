import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        666은 종말을 나타내는 수 따라서 블록버스터 영화에서는
        666이 들어간 제목을 많이 사용한다.

        종말의 수란 어떤수 N에 6이적어도 3개이상 연속으로 들어가는 수
        제일 작은 종말의 수는 666이고 큰수는 1666,2666,3666...

        따라서 세상의종말 666,두번째 1666,..N666 와 같이 이름지을것
        그래서 N번쨰의 영화제목은 세상의 종말 (N번쨰로 작은 종말의수) 와 같다
        즉 N번째로 영화의 제목에 들어간 수를 출력

        입력N 10000보다 작거나같은 자연수

        출력 첫째 줄에 N번쨰의 영화의 제목에 들어간 수를 입력
         */

        Scanner sc = new Scanner(System.in);

        int N,count,result;
        result =0;
        count =0;
        String S;

        N=sc.nextInt();

        int i=666;
        
        while(true)
        {

            S = Integer.toString(i);

            boolean a = S.contains("666");

            if(a)
            {
                count++;
                if(count ==N)
                {
                    result =i;
                    break;
                }
            }
            i++;
        }

        System.out.println(result);



        

    }
}
