import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X ,N;
		int a,b,subTotal;
		
		int i=0;
		int sum =0;
		
		
		/* 
		X 총 금액
		N 물건의 종류의 개수
		a 물건의 가격
		b 물건의 개수
		*/
		
		X = sc.nextInt();
		N = sc.nextInt();
		
		while(i<N)
		{
		    a = sc.nextInt();
		    b = sc.nextInt();
		    
		    subTotal = a*b;
		    
		    sum +=subTotal;
		    
		    i++;
		}
		
		if(X==sum)
		    System.out.println("Yes");
		else
		    System.out.println("No");
		
	}
}
