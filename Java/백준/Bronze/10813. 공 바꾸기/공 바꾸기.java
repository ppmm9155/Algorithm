import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		도현이의 바구니 총 N개 각각의 바구니에는 1~A까지의 번호가 있다
		바구니에는 공이 최소 1개씩 있고 바구니에 적혀있는 번호와 같은번호로 
		공이 들어있다.
		
		도현이가 M번 공을 바꾸려고 한다  (ex 1번공 
		공을 바꿀 바구니 2개를 선택하고  (1번공이 있는 바구니 a , b ?
		두 바구니에 들어있는 공을 서로 교환한다 
		
		첫번째 줄 N과 M 을 주어짐 바구니개수 N , 바꿀횟수 M
		둘째줄 i번 바구니 , j번 바구니 
		
		공의번호는 1번바구니 1번공 최소 공이 1개 
		
		*/
		
		int N,M,i,j,temp;
		
		temp = 0;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] basket = new int[N];
		
		//일단 바구니에 공을 채워야함 
		
		for(int a=0;a<basket.length;a++) // 0 1 2 3 4 
		{                                // 1 2 3 4 5 
		    basket[a] = a+1;             // 
		    
		}
		
		// i번 j번 입력
		for(int b=0;b<M;b++)
		{
		    i = sc.nextInt();
		    j = sc.nextInt();
		    
		    if(i!=j)
		    {
		        temp = basket[i-1];
		        basket[i-1] = basket[j-1];
		        basket[j-1] = temp;
		    }
		        
		}
		
		for(int c=0;c<basket.length;c++)
		{
		    System.out.print(basket[c]+" ");
		}
		
		
	}
}
