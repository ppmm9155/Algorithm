import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 
		정수의 크기 N 수열 A 와 정수 X 
		A 에서 X보다 작은 수를 모두 출력 
		*/
		
		int N,X;
		
		N = 0;
		X = 0;
		
		N = sc.nextInt(); //정수의 크기 N
		X = sc.nextInt(); //정수 X
		
		int [] A = new int[N]; //
		
		for(int i=0;i<A.length;i++)
		{
		    A[i] = sc.nextInt();
		    if(A[i]<X)
		    {
		        System.out.print(A[i]+" ");    
		    }
		}
		
		
		
	}
}
