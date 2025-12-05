import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		바구니 총 N 개 바구니는 1부터~N까지 번호가있다
		
		M번 바구니의 순서를 역순으로 할려고한다 
		순서를 역순으로 만들 범위를 정하고, 그범위에 들어있는 바구니의 순서를 
		역순으로 한다.
		
		ex)1 2 3 4 , 2~4까지 범위정함 1 4 3 2 ?
		
		첫쨰 줄 N 과 M   N은 바구니의 개수 , M은 바꿀 횟수? 4번바꾼다 
		둘째 줄 부터 i,j로 역순으로할 범위를 정함 i번 부터 j번까지 역순으로한다.
		
		다하면 왼쪽 바구니부터 순서대로 출력 
		*/
		
		int N,M,i,j,temp,left,right;
		
		N=0;
		M=0;
		i=0;
		j=0;
		temp=0;
	    left=0;
	    right=0;
		
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] basket = new int[N];
		
		
		//바구니 에 순서대로 번호적기
		for(int a=0;a<N;a++) // 0 1 2 3 
		{                    // 1 2 3 4 
		    basket[a] = a+1;
		   
		}
		
		//M번 i,j 입력 
		for(int b=0;b<M;b++)
		{
		    i = sc.nextInt(); //(ex2
		    j = sc.nextInt(); //(ex4
		    
		    //바구니 번호 맞춤
		    i=i-1;
		    j=j-1;
		    
		    left=i;
		    right=j;
		    
		    //역순으로 변경 
		    while(left<=right)
		    {
		        temp = basket[left]; 
		        basket[left] = basket[right];
		        basket[right] = temp;
		        left++;
		        right--;
		    }
		}
		
		for(int d=0;d<N;d++)
		{
		    System.out.print(basket[d]+" ");
		}
		
	}
}
