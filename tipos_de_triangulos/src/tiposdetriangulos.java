import java.util.Scanner;

public class tiposdetriangulos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //Pegando os lados
        System.out.print("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();

        //Verificando se é um triângulo
        if (ladoA + ladoB > ladoC && ladoA + ladoB > ladoC && ladoB + ladoC > ladoA) {
            System.out.println("É um triângulo!");
            if (ladoA == ladoB && ladoB == ladoC){
            System.out.println("É um triângulo equilátero!");
            }else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC ){
            System.out.println("É um triângulo isósceles!");
            }else {
            System.out.println("É um triângulo escaleno!");
            }
        }else {
            System.out.println("Não é um triângulo!");
        }

        //Verificando o tipo do triângulo
       
        
    }
}
