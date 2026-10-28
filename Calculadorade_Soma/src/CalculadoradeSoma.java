import java.util.Scanner;

public class CalculadoradeSoma {

	public static void main(String[] args) {
		System.out.println("Calculadora de Soma");
		Scanner cal = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		Integer N1 = cal.nextInt();
		System.out.print("Digite o Segundo número que deseja somar: ");
		Integer N2 = cal.nextInt();
		Integer soma = N1 + N2;
		System.out.println("O resultado da sua soma é: " + soma + " Correto?");
		cal.nextLine();
		String resposta = cal.nextLine();
		if (resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Ótimo, volte sempre");
		} else {
			System.out.println("Que pena, vamos tentar novamente");
		};

		cal.close();
	}
}