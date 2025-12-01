import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		정수의 개수 N 정수 num 최솟값 min 최댓값 max 
		*/
		
		int N,min,max;
		
		N = 0;
		
		N = sc.nextInt(); 
		
		int[] num = new int[N]; 
		
		for(int i=0;i<num.length;i++)
		{
		    num[i] = sc.nextInt();
		  
		}
		
		max = num[0]; 
		min = num[0];
		
		for(int j=0;j<num.length;j++)
		{
		    
		    if(num[j]>max)
		    {
		        max = num[j];
		    }
		    
		    if(num[j]<min)
		    {
		        min = num[j];
		    }
		        
		        
		}
		
		System.out.println(min+" "+max);
		
		
	}
}
