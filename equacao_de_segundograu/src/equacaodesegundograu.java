import java.util.Scanner;

public class equacaodesegundograu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta é: " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma única raiz: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 é: " + x1);
            System.out.println("x2 é: " + x2);
        }

    }
}