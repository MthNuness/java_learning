import java.util.Scanner;

public class operadores_ternarios {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o primeiro número:" );
        int N1 = sc.nextInt();
        System.out.print("Escreva o segundo número: ");
        int N2 = sc.nextInt();
        System.out.print("Agora vamos comparar esses número, se o primeiro for maior que o segundo, o programa vai retornar 1, caso o segundo seja maior que o primeiro, o programa vai retornar 2, e caso os dois sejam iguais, o programa vai retornar 3: ");
        int R = 0;

        //Fazendo por if e else if
        if(N1 > N2){
            R = 1;
        } else if (N2 > N1){
            R = 2;
        } else{
            R = 3;
        }
        System.out.println("O resultado da comparação é: " + R);

        //Fazendo por operador ternário
        R = (N1 > N2) ? 1 : (N2 > N1) ? 2 : 3;
        System.out.println("O resultado da comparação é: " + R);

        sc.close();
    }
    
}
