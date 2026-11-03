import java.util.Scanner;

public class parouimpar{
    public static void main (String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int N1 = T.nextInt();
        if (N1 % 2 == 0){
            System.out.println("O seu número é par.");   
        } else{
            System.out.println("O seu número é ímpar.");
        }

        T.close();
    }
}