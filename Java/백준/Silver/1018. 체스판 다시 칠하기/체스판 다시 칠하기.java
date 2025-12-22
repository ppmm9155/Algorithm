import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        M*N 크기의 보드 , 어떤 정사각형은 검은색 나머지는 흰색 으로
        8*8 크기의 체스판으로 만들려고한다.

        체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
        체스판을 색칠하는 경우의 수는 두가지
        하나는 맨 왼쪽 위 칸이 흰색 , 하나는 검은색인 경우

        M*M 크기의 보드에서 8*8로 잘라낸 후 지민이가 다시 칠해야 하는
        정사각형의 최소 개수를 구하는 프로그램

        입력
        첫째 줄에 N과 M이 주어진다. N과M은 8보다 크거나 같고
        50보다 작은 자연수
        둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다.
        B는 검은색 W는 흰색

        출력
        첫째 줄에 지민이가 다시 칠해야 하는 정사각형의
        개수를 최솟값으로 출력 없으면 0출력

        체스판이 정해진게 아님 8보다 크거나 같고 50보다 작은 자연수
        체스판을 칠하는 경우의 수는 두가지 B먼저, W먼저

        B시작이면 다음줄 W시작 BWBWBWBW...
        W시작이면 다음줄 B시작 WBWBWBWB...
        
        초기
        이거그냥 입력에서 다시칠하게끔 틀리게 체스판을 입력하는데
        2차원 배열 색종이 문제처럼 일단 체스판을 옳바르게 다채워
        채우는것도 B시작인지 W시작인지 구분해서
        그리고 채우면서 틀린부분이 있는 경우만 boolean 으로 구한다
        틀린부분만 boolean으로 하니까 최소값만 구해지지않을까?
        
        //
        슬라이딩 윈도우 알고리즘을 사용해서 문제를 풀어야한다
        먼저 배열부터 채운다
        채울때 W면 true, B면 false로 한다
        N-7 , M-7 시작점잡을때 배열에 넘기지않기위해
        check 정답지 원래 있어야하는 색깔로
        줄이 바뀔 때 check 색깔을 한번 더 뒤집어줘야 
        체스판 무늬가 유지된다
        64 - count : 첫 색깔을 반대로 칠했을 경우의 수도 계산해서, 
        둘 중 더 작은 값을 택한다
         */


        int N,M,count,min;
        //count =0;
        min = 64;

        String S;

        N = sc.nextInt();
        M = sc.nextInt();


        boolean[][] array = new boolean[N][M];

        //일단 채우기
        for(int i=0; i<N; i++)
        {
            S = sc.next();
            for(int j=0; j<M; j++)
            {
                if(S.charAt(j)=='W')
                {
                    array[i][j] = true;
                }else{
                    array[i][j] = false;
                }
            }
        }

        for(int i=0; i<N-7; i++)
        {
            for(int j=0; j<M-7; j++)
            {

                count = 0;
                boolean check = array[i][j]; //

                //8*8 검사
                for(int k=i; k<i+8; k++) {
                    for(int l=j; l<j+8; l++) {

                        if(array[k][l] != check) {
                            count++;
                        }
                        check = !check; // 다음 칸 색깔 반전
                    }
                    check = !check; // 줄 바뀔 때 색깔 반전
                }


                //정방향 과 역방향 중 작은 거 선택
                count = Math.min(count, 64-count);

                //전체 최솟값 과 비교해서 바꾸기
                min = Math.min(min, count);
            }
        }


        System.out.println(min);



    }
}
