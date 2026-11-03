public class operadores_logicos {
    public static void main(String[] args) {

        //Operadores Lógicos
        
        int x, y, z;
        x= 5;
        y= 10;
        z= 15;

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
