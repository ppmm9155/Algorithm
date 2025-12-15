import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        9X9 격자판에 쓰여진 81개의 자연수 또는 0이 주어졌을때
        최댓값을 찾고 최댓값이 몇 행 몇 열 에 위치한 수인지 구하는 프로그램

        첫쨰 줄 부터 아홉 번째 줄까지 한줄에 아홉 개씩 주어짐

        출력
        첫째 줄에 최댓값 출력
        둘째줄 행과 여 번호

        최댓값 90
        행과열 5 7

        배열입력
        최댓값 찾기
        행과열 찾기
         */
        int max,x,y;
        max =0;
        x= 0;
        y= 0;


        int[][] Array = new int[9][9]; //0~8 , 0~8 , 81

        max = 0;

        //배열 정수 입력
        for(int i=0;i<Array.length;i++)
        {
            for(int j=0;j<Array[i].length;j++)
            {
                Array[i][j] = sc.nextInt();
                //최댓값 찾기
                if(Array[i][j]>max)
                {
                    max = Array[i][j];
                    //행과열 찾기
                    x= i;
                    y= j;
                }

            }
        }

        System.out.println(max);
        System.out.println((x+1)+" "+(y+1));

        


    }
}
