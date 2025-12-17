import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        가로 세로 각각 100인 정사각형 도화지
        세로의 크기는 10으로 고정 가로의 크기는 10
        검정 색종이를 겹치게 여러장 붙였을때 검정색종이의 영역의 넓이
        를 구하는 프로그램 작성

        첫째 줄 색종이의 수
        둘째 줄 색종이를 붙인 위치 (ex 3 7
        
        검정 색종이 개수
        검정 색종이 개수만큼 붙이기
        도화지에 검정색종이 붙인곳 넓이 구하기
         */
        int T,x,y,area;
        T=0;
        area =0;

        //도화지
        boolean[][] paper = new boolean[100][100];

        T=sc.nextInt();

        //T만큼 검정색종이 입력
        for(int i=0;i<T;i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();

            //검정 색종이
            for(int j=x;j<x+10;j++)
            {

                for(int k=y;k<y+10;k++)
                {
                    paper[j][k] = true;
                }
            }

        }

        //도화지에 검정색종이 넓이 구하기
        for(int l=0;l<paper.length;l++)
        {
            for(int m=0;m<paper[l].length;m++)
            {
                if(paper[l][m])
                {
                    area++;
                }
            }
        }

        System.out.println(area);

        
        
    }
}
