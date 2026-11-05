import java.util.Scanner;

public class dadosderepetição{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1;
        int valores = 0;
        int pares = 0;
        int impares = 0;
        int acimaDe100 = 0;
        int soma = 0;

        do {
            System.out.print ("Digite um número inteiro, caso queira sair digite 0: ");
            N1 = sc.nextInt();

            //Valores
            if (N1 != 0){
                valores++;
            }

            //Pares
            if (N1 % 2 == 0 && N1 != 0){
                pares++;
            }

            //Impares
            if (N1 % 2 != 0){
                impares++;
            }

            //Acima de 100
            if (N1 > 100){
                acimaDe100++;
            }

            //Soma
            soma += N1;

        } while (N1 != 0);

        //Média
        double media = (double) soma / valores;

        //Resultados
        System.out.println("Total de Valores: " + valores);
        System.out.println("Total de Pares: " + pares);
        System.out.println("Total de Ímpares: " + impares);
        System.out.println("Acima de 100: " + acimaDe100);
        System.out.println("Média dos Valores: " + media);

        sc.close();
    }
}