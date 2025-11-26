import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,T,i;
		
		A=0;
		B=0;
		i=0;
		
		T = sc.nextInt();
		
		while(i<T)
		{
		    A = sc.nextInt();
		    B = sc.nextInt();
		    
		    System.out.println(A+B);
		    
		    i++;
		}
		
		
		
		
	}
}
