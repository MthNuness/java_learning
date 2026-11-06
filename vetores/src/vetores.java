import java.time.LocalDate;

public class vetores {
    public static void main(String[] args){

        //Pegando o ano atual
        int AnoAtual = LocalDate.now().getYear();

        //Declarando vetores
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int[] dia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //Descobrindo se o ano atual é bissexto
        if(AnoAtual % 4 == 0 && AnoAtual % 100 != 0 || AnoAtual % 400 ==0){
            dia[1] = 29;
        }
        for (int i = 0; i < mes.length; i++){
            System.out.println("O mês de " + mes[i] + " tem " + dia[i] + " dias.");
        }
    }
}