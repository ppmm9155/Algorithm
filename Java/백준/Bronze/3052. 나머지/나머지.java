import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		자연수 10개를 입력받은뒤 42로 나머지를구한다 
		서로 다른값이 몇개 있는지 출력하는 
		
		첫번째 줄부터 열번째 줄까지 숫자가 하나씩 주어짐
	    
		첫째줄에 ,42로 나누었을때 서로 다른 나머지가 몇개인지 출력    
		*/
		
		int A,B,result,count;
		B=42;
		result =0;
		count =0;
		
		boolean[] check = new boolean[42];
		
		for(int i=0;i<10;i++)
		{
		    A = sc.nextInt();
		    result = A%B;
		    
		    if(!check[result])
		    {
		        check[result] = true;
		        count ++;
		    }
		    
		    
		}
		
		System.out.println(count);
		
	}
}
