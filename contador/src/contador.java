import java.util.Scanner;

public class contador{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite até que número você deseja que a maquina conte:" );
        int N = sc.nextInt();
        int C = 1;
        while (C <= N){
            System.out.println(C);
            C++;
        }
    }
}