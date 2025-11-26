import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i,sum;
		i = 1;
		n = 0;
		sum=0;
		
		n = sc.nextInt();
		
		while(i<=n)
		{
		    sum+=i;
		    i++;
		}
		
		System.out.println(sum);
		
		
		
	}
}
