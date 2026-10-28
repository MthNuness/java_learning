import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoradosistemaApplication {

	public static void main(String[] args) {
		Date relogio = new Date();
		System.out.println("Hora do sistema é:");
		System.out.println(relogio);

		Locale local = Locale.getDefault();
		System.out.println("O idioma desse sitema é: " + local.getDisplayLanguage());
		System.out.println("O país desse sistema é: " + local.getDisplayCountry());

		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("A resolução da tela é: " + tela.width + " x " + tela.height);

	}
}