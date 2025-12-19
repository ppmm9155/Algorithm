import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        어떤 자연수 N 그 자연수 N의 분해합은 N과N을 이루는 각
        자리수의 합이다
        어떤 자연수 M의 분해합이 N인 경우 M을 N의 생성자라고 한다.

        245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의
        생성자가 된다.

        자연수 N이 주어졌을떄,N의 가장 작은 분해합을 구해내는 프로그램
         */
        /*
        198 = 198+1+9+8=216

        입력에서 분해합을 입력한다
        출력에서 최소값의 생성자가 나온다
        생성자가 없는경우 0을 출력한다.

        분해합의 생성자를 어떻게 구해야하지?
        생성자를 어떻게 구하지가 관건이네
        수학적으로 안되니까 브루트포스구나
        모든 숫자의 분해합을 다구해보고 입력값과 같은지 비교
         */

        int N,temp,sum,result;
        N=0;
        result =0;

        N = sc.nextInt();

        for(int i=1;i<=N;i++)
        {
            temp = i;
            sum =i;

            //자릿수
            while (temp>0){
                sum += temp%10;
                temp /=10;
            }
            
            if(sum==N)
            {
                result = i;
                break;
            }
            
        }

        System.out.println(result);

    }
}
