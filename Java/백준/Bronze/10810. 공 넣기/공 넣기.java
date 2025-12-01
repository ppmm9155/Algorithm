import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		바구니 N개 바구니 1~N까지의 번호
		1~N까지의 번호가 있는 공 
		처음 바구니에는 공이 안들어감 , 바구니에는 1개만 넣을수있다
		도현이는 M번 넣으려고한다 공을 
		한번넣을떄 바구님의 범위와 정한 바구니에 모두 같은 번호로 적혀있는 공을 넣는다
		바구니에 이미 공이 있으면 공을 빼고 , 새로 공을 넣는다
		공을 어떻게 넣을지 M번 공을 넣은후에 바구니에 어떤공이 있는지 구하는 
		
		첫번째 줄에 N , 과 M
		둘째줄 부터 M개의 줄에 걸쳐 세정수 i,j,k 로 이루어짐 
		i번 바구니부터 j번까지에 k번 번호가 적혀있는 공을 넣음
		
		ex) 2 5 6 이면 2~5번까지 6번 공을 넣는다
		즉 N은 바구니의 개수 ,M은 도현이가 M번 바구니에 넣는 횟수
		*/
		
		int N,M,i,j,k;
		
		N = sc.nextInt(); //배열의 크기?
		
		M = sc.nextInt(); //넣는 횟수
		
		int[] basket = new int[N]; //바구니 배열 선언 크기N 0 1 2 3 4 크기
		
		for(int a=0;a<M;a++) //도현이가 M번 넣는 횟수 0 1 2 3 4 5 
		{
		    //각바구니는 i부터N번까지 
		    i = sc.nextInt(); 
		    j = sc.nextInt();
		    k = sc.nextInt(); 
		    //i~k 까지 k번호로 공넣기 
		    for(int b=i;b<=j;b++)
		    {
		        basket[b-1]=k; //ex 1입력시 basket[0] 인걸로
		    }
		    
		}
		
		for(int c=0;c<N;c++)
		{
		    System.out.print(basket[c]+" ");
		}
		
	}
}
