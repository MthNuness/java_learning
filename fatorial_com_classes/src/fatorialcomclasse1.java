public class fatorialcomclasse1{

    //Atributos
    private int num = 0;
    private int fat = 0;
    private String formula = "";

    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f *= c;
            s += c + " X ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }

    public int getFatorial(){
        return fat;
    }

    public String getFormula(){
        return formula;
    }
}