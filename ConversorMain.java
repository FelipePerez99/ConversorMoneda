

import javax.swing.JOptionPane;

import interfaz.ConversorMoneda;
import interfaz.ConversorTemperatura;

public class ConversorMain {
    public static void main(String[] args) {
        String conversor = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversor",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Selecciona", "Conversor de Moneda", "Conversor de Temperatura" }, "Selecciona")
				.toString();
		

		switch (conversor) {
			case "Conversor de Moneda" -> new ConversorMoneda();
			case "Conversor de Temperatura" -> new ConversorTemperatura();
			default -> System.out.println("No válido");
        }
    }
}
