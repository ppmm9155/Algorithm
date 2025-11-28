import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		String star = "";
		
		//star+="*"
		
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++)
		{
		    // 공백우선 처리 그다음 별처리
		    for(int j=1;j<=N-i;j++)
		    {
		        System.out.print(" ");
		        
		    }
		   
		    System.out.println(star+="*");
		    
		}
		
		
		
	}
}
