import java.util.Scanner;

public class OperadoresAritmetico {

	public static void main(String [] args) {
		Scanner num = new Scanner(System.in);

		//Pegando os valores do usuário
		System.out.print("Digite o primeiro número: ");
		double N1 = num.nextDouble();
		System.out.print("Digite o segundo número: ");
		double N2 = num.nextDouble();

		//Realizando as operações
		double soma = N1 + N2;
		double subtracao = N1 - N2;
		double mutiplicacao = N1 * N2;
		double divisao = N1 / N2;
		double resto = N1 % N2;
		double media = (N1 + N2) / 2;
		double potencia  = Math.pow(N1, N2);
		double cubo = Math.pow(N1, 3);
		double cubo2 = Math.pow(N2, 3);
		double raizQuadrada = Math.sqrt(N1);
		double raizQuadrada2 = Math.sqrt(N2);
		double raozCubica = Math.cbrt(N1);
		double raizCubica2 = Math.cbrt(N2);
		double valorAbsoluto = Math.abs(N1);
		double valorAbsoluto2 = Math.abs(N2);



		//Exibindo os resultados
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A subtração dos números é: " + subtracao);
		System.out.println("A multiplicação dos números é: " + mutiplicacao);
		System.out.println("A divisão dos números é: " + divisao);
		System.out.println("O resto da divisão dos números é: " + resto);
		System.out.println("A média dos números é: " + media);
		System.out.println("A potência do primeiro número elevado ao segundo é: " + potencia);
		System.out.println("O primeiro número elevado ao cubo e': " +cubo);
		System.out.println("O segundo número elevado ao cubo e': " +cubo2);
		System.out.println("A raiz quadrada do primeiro número é: " + raizQuadrada);
		System.out.println("A raiz quadrada do segundo número é: " + raizQuadrada2);
		System.out.println("A raiz cúbica do primeiro número é: " + raozCubica);
		System.out.println("A raiz cúbica do segundo número é: " + raizCubica2);
		System.out.println("O valor absoluto do primeiro número é: " + valorAbsoluto);
		System.out.println("O valor absoluto do segundo número é: " + valorAbsoluto2);

		num.close();
	}
}