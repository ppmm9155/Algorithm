import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		int num1,num2,result,
		A,B,C;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		A= (num2%10) ;          //5 
		B= ((num2%100)/10);     //8
		C= ((num2%1000)/100);   //3
		
		
		
	    System.out.println(num1*A);
	    System.out.println(num1*B);
	    System.out.println(num1*C);
	    System.out.println(num1*num2);
	    
		
		
		
	
	}
}
