import java.util.Scanner;

public class bancodigital{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int saldo1 = 1000 + (int)(Math.random() * 4000);
        int resposta = 1;

        while (resposta != 0){

            //Interface

            System.out.println("===========================");
            System.out.println("       BANCO DIGITAL       ");
            System.out.println("===========================");
            System.out.println("");
            System.out.println("[ 1 ] Cria a conta");
            System.out.println("[ 2 ] Depositar");        
            System.out.println("[ 3 ] Sacar");
            System.out.println("[ 4 ] Transferir");
            System.out.println("[ 5 ] Ver extrato");
            System.out.println("[ 0 ] Sair");
            System.out.println("");
            System.out.print("Escolha uma opção: ");
            resposta = sc.nextInt();

            //Banco

            switch (resposta) {
                case 1:
                    String N1 = sc.nextLine();
                    System.out.print("Me informe seu nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Me informe sua senha: ");
                    String senha = sc.nextLine();
                    System.out.print("Sua conta foi criada com sucesso senhor(a) " + nome);
                    break;
                case 2: 
                    System.out.println("Saldo: " + saldo1);
                    System.out.print("Quando deseja depositar? ");
                    int saldo2 = sc.nextInt();
                    saldo1 += saldo2;
                    System.out.println("Saldo atual: " + saldo1);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo1);
                    System.out.print("Quanto deseja sacar? ");
                    int sacar = sc.nextInt();
                    if (sacar > saldo1){
                        System.out.println("ERRO: Valor de saque indisponível");
                    }else{
                        saldo1 -= sacar;
                        System.out.println("Saque aprovado");
                        System.out.println("Saldo atual: " + saldo1);
                    }
                    break;
                case 4:
                    System.out.println("Saldo atual: " + saldo1);
                    System.out.print("Para quem deseja transferir? ");
                    String transferir1 = sc.nextLine();
                    System.out.print("Quantia que deseja transferir a " + transferir1 + ": ");
                    int transferir2 = sc.nextInt();
                    if (transferir2 > saldo1){
                        System.out.println("ERRO: Valor indisponível");
                    }else {
                        System.out.println("Tranferencia realizada");
                        System.out.println("Saldo atual: " + saldo1);
                    }
                    break;
        }
    }
    }
}