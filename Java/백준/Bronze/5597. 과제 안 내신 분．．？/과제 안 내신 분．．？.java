import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
		X대학 M교수 학생 30명 학생별로 1~30번까지의 출석번호 
		특별과제 28명만함 제출안한 학생 2명의 출석번호 구하기
		
		입력28번 제출자의 출석번호로 중복X
		출력 2줄 1번째줄은 제출안한 출석번호중 가장작은 2번째는 그다음
		*/
        
        int student_number;

        boolean[] student = new boolean[30]; //0~29

        for(int i =0; i<28;i++) 
        {
            student_number = sc.nextInt();
            student[student_number-1] = true; //과제제출
        }

        for(int j =0; j<30;j++) 
        {
            
            if(!student[j])
            {
                System.out.println(j+1);
            }
            
        }
        
        
        
    }
}
