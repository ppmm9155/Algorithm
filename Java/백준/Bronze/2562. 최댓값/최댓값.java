import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//최댓값이 몇 번째 수인지
		
		int max,max_index;
		
		max =0;
		max_index = 0;
		
		int[] num = new int[9]; //9개의 서로다른 자연수
		
		for(int i=0;i<num.length;i++)
		{
		    num[i] = sc.nextInt();
		}
		
		max = num[0];
		
		for(int j=0;j<num.length;j++)
		{
		    if(num[j]>max)
		    {
		        max = num[j];
		        max_index = j;
		    }
		    
		}
		
		System.out.println(max);
		System.out.println(max_index+1);
	}
}
