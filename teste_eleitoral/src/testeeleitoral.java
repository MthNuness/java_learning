import java.util.Scanner;

public class testeeleitoral {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        //Coletando a idade
        System.out.print("Digite sua idade: ");
        int idadeE = idade.nextInt();

        //Verificando a idade
        if (idadeE < 16) {
            System.out.print("Você não pode votar.");
        }else if (idadeE >= 16 && idadeE < 18) {
            System.out.print("O voto é opcional.");
        }else if (idadeE >= 18 && idadeE < 70){
            System.out.print("O voto é obrigatório.");
        }else if (idadeE >= 70) {
            System.out.print("O voto é opcional.");
        }

    }
}