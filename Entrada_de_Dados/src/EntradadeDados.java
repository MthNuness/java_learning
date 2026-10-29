import java.util.Scanner;

public class EntradadeDados{

    public static  void main(String[] args){
        Scanner meu = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        Float number = meu.nextFloat();
        System.out.printf("Seu número é: %.2f %s", number, "correto?");

        meu.nextLine();
        String resposta = meu.nextLine();
        System.out.print("Obrigado pelo feedback!");

        meu.close();
    }
}