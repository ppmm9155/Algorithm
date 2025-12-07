import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i;
        String S;
        S = sc.nextLine();
        i = sc.nextInt();

        char charvalue = S.charAt(i-1);
        System.out.println(charvalue);

    }
}
