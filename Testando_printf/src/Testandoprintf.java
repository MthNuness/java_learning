public class Testandoprintf {

	public static void main(String[] args) {
		float number = 82.34562f;
		System.out.printf("Sua nota é: %.2f%n", number);
		System.out.printf("Sua nota é: %1f%n", number);
		System.out.printf("Sua nota é: %1.3f%n", number);
		System.out.printf("Sua nota é: %1.4f%n", number);
		System.out.printf("Sua nota é: %.5f%n", number);
	}
}
