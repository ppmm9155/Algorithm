import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a,b,c,result,max;
	    
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    
	    max = a;
	    
	    
	    if(a==b&&b==c)
	    {
	        result = 10000 + (a * 1000);
	        
	    }else if(a==b)
	    {
	        result = 1000+(a*100);
	    }else if(b==c)
	    {
	        result = 1000+(b*100);
	    }else if(c==a)
	    {
	        result = 1000+(c*100);
	    }else
	    {
	        if(b>max)
	        {
	            max = b;
	        }
	        if(c>max)
	        {
	            max = c;
	        }
	        result = max*100;
	    }
	    
	    System.out.println(result);
	        
	   
	}   
}
