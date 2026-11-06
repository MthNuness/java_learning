public class vetores {
    public static void main(String[] args){
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] dia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0; i < mes.length ; i++){
            System.out.println("O mês de " + mes[i] + " tem " + dia[i] + " dias.");
        }
    }
}