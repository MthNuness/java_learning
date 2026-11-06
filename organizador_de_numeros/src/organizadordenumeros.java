import java.util.Arrays;
import java.util.Scanner;

public class organizadordenumeros{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Quantos números deseja organizar? ");
        int numeros = sc.nextInt();

        int[] no = new int[numeros];

        for(int i = 0; i < numeros; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            no[i] = sc.nextInt();
        }
        
        System.out.println("Número organizados: ");
        Arrays.sort(no);
        for(int valor: no){
            System.out.println(valor);
        }
    }
}
