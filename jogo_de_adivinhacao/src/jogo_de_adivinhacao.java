import java.util.Scanner;

public class jogo_de_adivinhacao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Começo do jogo
        System.out.println("Estou pensando em um número entre 1 e 5. Tente adivinhar!");
        int NA = 1 + (int)(Math.random() * 5);
        System.out.print("Digite o seu palpite: ");
        int palpite = sc.nextInt();

        //loop para verificar se o palpite está correto
        if (palpite == NA) {
            System.out.println("Parabens ! Você acertou o número!");
        } else {
            System.out.println("Que pena! o número que eu pensei era: " + NA);
        }

        sc.close();
    }
}
