import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        /*
        입력이 주어진다. 입력은 최대 100줄로 이루어져 있고,
        알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
        각 줄은 100글자를 넘지 않으며,
        빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고,
        공백으로 끝나지 않는다.

        몇번 입력할건지랑 언제 끝날지도 안알려주네
        지난번에 반복문도 이렇게 나온걸로 기억하는데

        버퍼리더 이용해서 문제풀자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S;

        while ((S = br.readLine()) != null)
        {
            bw.write(S);
            bw.newLine();
        }

        bw.flush();



    }
}
