public class TiposPrimitivos{

	public static void main(String[] args) {

		//Tipos primitivos
		float peso = 68.45f;
		int idade = 21;
		String nome = "Matheus Nunes";
		boolean estudante = true;

		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade + " Anos");
		System.out.println("Seu peso é: " + peso + "Kg");
		System.out.println("Você é estudante? " + estudante);

		System.out.println("-----------------------------------------------------");
		System.out.println("Basicamente, existem aqueles não empacotados e os empacotados, que são os tipos primitivos com wrapper, que são classes que encapsulam os tipos primitivos e fornecem métodos para manipulá-los.");
		System.out.println("-----------------------------------------------------");

		//Tipos primitivos com wrapper
		Integer idadeW = 21;
		Float pesoW = 68.45f;
		String nomeW = "Matheus Nunes";
		Boolean estudanteW = true;

		System.out.println("Seu nome é: " + nomeW);
		System.out.println("Sua idade é: " + idadeW + " Anos");
		System.out.println("Seu peso é: " + pesoW + "Kg");
		System.out.println("Você é estudante? " + estudanteW);

	}
}