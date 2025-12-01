import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,V,increase; 
		
		N = 0;
		V = 0;
		increase = 0;
		
		/*개수 N ,정수 num ,정수 V 
		정수 num 과 정수 V 를 같은지 판단후 
		정수 num 과 정수 V 의 값이 같은 개수 출력 
		정수 num 과 정수 V 는 , num >=-100 && num <= 100
		
		*/
		N = sc.nextInt();
		
		int[] num = new int[N]; //배열의 크기 N 결정
		
		for(int i=0;i<num.length;i++) // 0 1 2 3 4 5 
		{
		    num[i] = sc.nextInt();
		    
		}
		
		V = sc.nextInt();
		
		for(int j=0;j<num.length;j++)
		{
		    if(num[j]==V)
		    {
		        increase++;
		    }
		    
		}
		
		System.out.println(increase);
		

		
		
	}
}
