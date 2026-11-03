import java.util.Scanner;

public class operadores_logicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Operadores Lógicos

        int x, y, z;
        boolean r;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();
        System.out.print("Digite o valor de z: ");
        z = sc.nextInt();

        r = (x < y && y < z)? true:false;
        System.out.println("O resultado da comparação é: " + r);

        r = (x < y || y < z)? true:false;
        System.out.println("O resultado da comparação é: " + r);

        r = (x < y ^ y < z)? true:false;
        System.out.println("O resultado da comparação é: " + r);

        r = !(x < y && y < z)? true:false;
        System.out.println("O resultado da comparação é: " + r);
    }
}
