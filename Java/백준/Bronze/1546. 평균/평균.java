import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        세준이는 자기 점수 중에 최댓값을 골랐다 이값을 M
        모든 점수를 모든 점수/최댓값*100

        (ex 최고점이 M = 70 수학점수가 50 이면
        50/70*100 이되어 71.43 이된다

        이방식으로 계산했을때 새로운 평균을 구해라

        첫째 줄에 시험 본 과목의 개수 N
        둘째 줄에 세전이의 성적 100보다 작거나 같은 음이 아닌 정수

        과목입력
        최댓값 찾기
        최댓값으로 나머지 과목 점수변경
        변경된 과목 점수들로 평균 구하기
         */

        int N,max;
        max =0;

        double avg,hap;
        avg =0;
        hap =0;

        N = sc.nextInt(); //과목의 개수 N (ex 3

        double[] subject = new double[N]; //3 : 0 1 2

        //일단 점수넣기
        for(int a=0;a<subject.length;a++)
        {
            subject[a] = sc.nextInt(); //점수입력
        }

        max = (int)subject[0];
        //최댓값 찾기
        for(int b=0;b<subject.length;b++)
        {
            if(subject[b]>max)
            {
                max = (int)subject[b];
            }

        }

        //점수변경
        for(int c=0;c<subject.length;c++)
        {
            subject[c] = subject[c]/max*100;
        }

        //새로 평균 구하기
        for(int d=0;d<subject.length;d++)
        {
            //과목의 합
            hap+=subject[d];
        }
        //평균
        avg = hap/N;
        
        System.out.println(avg);
    }
}
