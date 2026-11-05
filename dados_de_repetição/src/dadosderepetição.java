import java.util.Scanner;

public class dadosderepetição{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1;
        int V = 0;
        int P = 0;
        int I = 0;
        int A = 0;
        int S = 0;

        do {
            System.out.print ("Digite um número inteiro, caso queira sair digite 0: ");
            N1 = sc.nextInt();

            //Valores
            if (N1 != 0 && N1 != 0){
                V++;
            }

            //Pares
            if (N1 % 2 == 0){
                P++;
            }

            //Impares
            if (N1 % 2 != 0){
                I++;
            }

            //Acima de 100
            if (N1 > 100){
                A++;
            }

            //Soma
            S += N1;
        } while (N1 != 0);
        
    }
}