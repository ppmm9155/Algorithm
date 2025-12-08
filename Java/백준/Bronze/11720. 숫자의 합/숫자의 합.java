import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        그냥 int로 배열처리하면 54321입력시 묶어서 처리함
        char로 배열선언후 int로 파싱하면 될듯한데

        1 입력시 49 , 1이 나오게 하려면 49-48 = 1
        -48을 하자
         */
        int N,sum;
        sum = 0;

        N = sc.nextInt();
        String num = sc.next();

        for(int i=0;i<N;i++)
        {
            sum+=num.charAt(i)-48; //문자'0'(48) 빼기
        }

        System.out.println(sum);


    }
}
