import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		N * M 크기의 두 행렬 A 와 B 가 주어졌을 때,
		두 행렬을 더하는 프로그램 
		
		첫번째 줄 크기 N 과 M 
		둘번째 줄 행렬 A의 원소 M개가 차례대로 주어진다 
	
		
		행렬 A 와 행렬 B
		두 행렬 A와 B 크기가 동일 
		
		먼저 A행렬 먼저 입력 
		그후 B 행렬 입력
		
		A행렬
		1 1 1
		2 2 2
		0 1 0
		
		B행렬 
		3 3 3
		4 4 4 
		5 5 100 
		*/
		
		int N , M;
		N =0;
		M =0;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] A = new int[N][M]; //A행렬
		int[][] B = new int[N][M]; //B행렬
		
		//A
		for(int i=0;i<A.length;i++)
		{
		
		    for(int j=0;j<A[i].length;j++)
		    {
		        A[i][j]=sc.nextInt();
		    }
		}
        //B		
		for(int k=0;k<B.length;k++)
		{
		
		    for(int o=0;o<B[k].length;o++)
		    {
		        B[k][o]=sc.nextInt();
		    }
		}
		
		//A ,B 행렬 합 
		for(int a=0;a<N;a++)
		{
		    for(int b=0;b<M;b++)
		    {
		        System.out.print(A[a][b]+B[a][b]+" ");
		    }
		    System.out.println();
		}
		
		
		
		
		
	}
}
