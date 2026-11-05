import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não-negativo: ");
        int N = sc.nextInt();

        long F = 1;   
        int C = 1;    

        while (C <= N) {
            F *= C;   
            C++;
        }

        System.out.println("O fatorial de " + N + " é: " + F);

        sc.close();
    }
}