package interfaz;

import javax.swing.JOptionPane;

import conversor.Temperatura;

public class ConversorTemperatura {
    public ConversorTemperatura() {
		main();
	}
	
	public void main() {
		String opciones[] = {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Celsius a Kelvin",
				"De Kelvin a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit"};
		
		principal(opciones);
		
	}
	
	public void principal(String opciones[]) {
		String opc = JOptionPane.showInputDialog(null, "Elije la temperatuta que deseas convertir",
				"Opciones", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]).toString();
		
		switch(opc) {
			case "De Celsius a Fahrenheit":
				celsiusAFahrenheit();
				continuar(opciones);
				break;
			case "De Fahrenheit a Celsius":
				fahrenheitACelsius();
				continuar(opciones);
				break;
			case "De Celsius a Kelvin":
				celsiusAKelvin();
				continuar(opciones);
				break;
			case "De Kelvin a Celsius":
				kelvinACelsius();
				continuar(opciones);
				break;
			case "De Fahrenheit a Kelvin":
				fahrenheitAKelvin();
				continuar(opciones);
				break;
			case "De Kelvin a Fahrenheit":
				kelvinAFahrenheit();
				continuar(opciones);
				break;
			default:
				System.out.println("Error!!");
				break;
		}	
	}
	
	public void celsiusAFahrenheit() {
		double fahrenheit = 0;
		try {
			double celsius =  Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if(celsius > 0) {
				Temperatura temperatura = new Temperatura(celsius);
				fahrenheit = (temperatura.getGrados() *  9 / 5) + 32;
				JOptionPane.showMessageDialog(null, "Tienes " + fahrenheit + " °F");
			}else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}
	
	public void fahrenheitACelsius() {
		double celsius = 0;
		try {
			double fahrenheit =  Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if(fahrenheit > 0) {
				Temperatura temperatura = new Temperatura(fahrenheit);
				celsius = (temperatura.getGrados() - 32) * 5 / 9;
				JOptionPane.showMessageDialog(null, "Tienes " + celsius + " °C");
			}else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}	
	}
	
	public void celsiusAKelvin() {
		double kelvin = 0;
		try {
			double celsius = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if (celsius > 0) {
				Temperatura temperatura = new Temperatura(celsius);
				kelvin = temperatura.getGrados() + 273.15;
				JOptionPane.showMessageDialog(null, "Tienes " + kelvin + " K");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}
	
	public void kelvinACelsius() {
		double celsius = 0;
		try {
			double kelvin = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if (kelvin >= 0) {
				Temperatura temperatura = new Temperatura(kelvin);
				celsius = temperatura.getGrados() - 273.15;
				JOptionPane.showMessageDialog(null, "Tienes " + celsius + " °C");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}
	
	public void fahrenheitAKelvin() {
		double kelvin = 0;
		try {
			double fahrenheit = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if (fahrenheit > 0) {
				Temperatura temperatura = new Temperatura(fahrenheit);
				kelvin = (temperatura.getGrados() - 32) * 5 / 9 + 273.15;
				JOptionPane.showMessageDialog(null, "Tienes " + kelvin + " K");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}
	
	public void kelvinAFahrenheit() {
		double fahrenheit = 0;
		try {
			double kelvin = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir:"));
			if (kelvin >= 0) {
				Temperatura temperatura = new Temperatura(kelvin);
				fahrenheit = (temperatura.getGrados() - 273.15) * 9 / 5 + 32;
				JOptionPane.showMessageDialog(null, "Tienes " + fahrenheit + " °F");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}
	
	public void continuar(String opciones[]) {
		int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		switch (opcion) {
		case 0 -> {
			principal(opciones);
		}
		default -> JOptionPane.showMessageDialog(null, "Finalizar Programa");
		}
	}
}
