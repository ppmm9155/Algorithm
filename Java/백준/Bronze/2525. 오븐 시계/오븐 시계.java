import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int A,B,C;
	    //시간 A | 분 B | 필요시간 C
	    
	    A = sc.nextInt(); //시간
	    B = sc.nextInt(); // 분
	    C = sc.nextInt(); // 필요시간
	    
	    B+=C;
	    
	    if(B>=60)
	    {
	        A+=(B/60); // ex 120분이면 120/60 = 2 즉 2시간 
	       
	        B = B%60;
	        if(A>=24)
	        {
	            A=A-24;
	        }
	        System.out.println(A+" "+B);
	    }else{
	        System.out.println(A+" "+B);
	    }
	    
	    
	    
	}   
}
