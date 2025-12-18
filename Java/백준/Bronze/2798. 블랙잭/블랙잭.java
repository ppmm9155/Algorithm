import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        블랙잭의 규칙 카드의 합이 21이 넘지않는 한도내에서
        카드의 합을 최대한 크게 만드는 게임

        새로운 규칙으로 블랙잭 게임을 하려함
        딜러는 N장의 카드를 모두 숫자가 보이도록
        그런후에 딜러는 숫자 M을 외친다.

        플레이어는 제한된 시간안에 N장의 카드중에서 3장의 카드를 고른다.
        고른카드의 합은 딜러가 외친, M을 넘지않으면서 M과 가깝게
        만들어야한다.

        N장의 카드에 써져있는 숫자가 주어졌을때, M을 넘지않으면서
        M에 최대한 가까운 카드 3장의 합을 구해 출력하시오

        첫째줄 카드의 개수 N, 과 M

        N 과 M 입력
        card N까지 입력
        (ex 5,6,7,8,9 면

         */


        int T,M,hap,result;
        T= 0;
        M= 0;
        hap =0;
        result =0;

        T = sc.nextInt();
        M = sc.nextInt();

        int[] card = new int[T];

        //배열 저장
        for(int i=0;i<card.length;i++)
        {
            card[i] = sc.nextInt();
        }

        //3개의카드 뽑고 M에 넘지않는 hap 구하기 , 중복방지
        for(int a=0;a<card.length;a++)
        {
            for(int b=a+1;b<card.length;b++)
            {
                for(int c=b+1;c<card.length;c++)
                {
                    hap = card[a]+card[b]+card[c];

                    //합이 M을 넘으면 안되고,
                    //현재 알고있는 기록보다 클 때만 갱신
                    if(hap<=M&&hap>result)
                    {
                        result = hap;
                    }

                }
            }
        }

        System.out.println(result);




    }
}
