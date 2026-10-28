import java.time.LocalDate;
import java.util.Scanner;

public class CalculadoradeIdade {

	public static void main(String[] args) {
		System.out.println("Calculadora de Idade");
		Scanner ano = new Scanner(System.in);

		//Pegando o ano de nascimento do usuário
		System.out.print("Digite o seu ano de nascimento: ");
		int Nasc = ano.nextInt();

		//Pegando o ano atual
		int AnoAtual = LocalDate.now().getYear();
		int idade = AnoAtual - Nasc;

		//Mostrando sua idade
		System.out.println("Você tem : " + idade + " anos");

		ano.close();
	}
}