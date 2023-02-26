package interfaz;

import javax.swing.JOptionPane;

import conversor.Moneda;

public class ConversorMoneda {
    public ConversorMoneda() {
		main();
	}

	public void main() {

		String opciones[] = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De libras a Pesos",
				"De Yen a Pesos", "De Won Coreano a Pesos" };

		principal(opciones);

	}

	public void principal(String opciones[]) {
		String opc = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
				"Opciones", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]).toString();
		
		switch (opc) {
			case "De Pesos a Dólar":
				pesosADolares();
				continuar(opciones);
				break;
			case "De Pesos a Euro":
				pesosAEuros();
				continuar(opciones);
				break;
			case "De Pesos a Libras":
				pesosALibras();
				continuar(opciones);
				break;
			case "De Pesos a Yen":
				pesosAYen();
				continuar(opciones);
				break;
			case "De Pesos a Won Coreano":
				pesosAWonCoreano();
				continuar(opciones);
				break;
			case "De Dólar a Pesos":
				dolaresAPesos();
				continuar(opciones);
				break;
			case "De Euro a Pesos":
				eurosAPesos();
				continuar(opciones);
			case "De libras a Pesos":
				librasAPesos();
				continuar(opciones);
				break;
			case "De Yen a Pesos":
				yenAPesos();
				continuar(opciones);
				break;
			case "De Won Coreano a Pesos":
				wonCoreanoAPesos();
				continuar(opciones);
				break;
			default:
				System.out.println("Error!!");
				break;
		}
	}

	public void pesosADolares() {
		double dolar = 0;
		try {
			double pesos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (pesos > 0) {
				Moneda moneda = new Moneda("COP", 4855);
				dolar = Math.round((pesos / moneda.getValor()) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + dolar + " Dolares");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
		
	}

	public void dolaresAPesos() {
		double pesos = 0;
		try {
			double dolar = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (dolar > 0) {
				Moneda moneda = new Moneda("Dólar", 4855);
				pesos = moneda.getValor() * dolar;
				JOptionPane.showMessageDialog(null, "Tienes $" + pesos + " Pesos");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void pesosAEuros() {
		double euros = 0;
		try {
			double pesos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (pesos > 0) {
				Moneda moneda = new Moneda("COP", 5133);
				euros = Math.round((pesos / moneda.getValor()) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + euros + " Euros");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void eurosAPesos() {
		double pesos = 0;
		try {
			int euros = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (euros > 0) {
				Moneda moneda = new Moneda("EUR", 5133);
				pesos = Math.round((moneda.getValor() * euros) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + pesos + " Pesos");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void pesosALibras() {
		double libras = 0;
		try {
			double pesos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (pesos > 0) {
				Moneda moneda = new Moneda("COP", 5800);
				libras = Math.round((pesos / moneda.getValor()) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + libras + " Libras");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}	
	}

	public void librasAPesos() {
		double pesos = 0;
		try {
			double libras = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (libras > 0) {
				Moneda moneda = new Moneda("GBP", 5800);
				pesos = Math.round((moneda.getValor() * libras) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + pesos + " Pesos");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void pesosAYen() {
		double yen = 0;
		try {
			double pesos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (pesos > 0) {
				Moneda moneda = new Moneda("COP", 35.58);
				yen = Math.round((pesos / moneda.getValor()) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + yen + " Yen");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}	
	}

	public void yenAPesos() {
		double pesos = 0;
		try {
			int yen = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (yen > 0) {
				Moneda moneda = new Moneda("JPY", 35.58);
				pesos = Math.round((moneda.getValor() * yen) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + pesos + " Pesos");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void pesosAWonCoreano() {
		double wonCoreano = 0;
		try {
			double pesos = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (pesos > 0) {
				Moneda moneda = new Moneda("COP", 3.69);
				wonCoreano = Math.round((pesos / moneda.getValor()) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + wonCoreano + " Libras");
			} else {
				JOptionPane.showMessageDialog(null, "El número debe ser positivo");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		}
	}

	public void wonCoreanoAPesos() {
		double pesos = 0;
		try {
			double wonCoreano = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));
			if (wonCoreano > 0) {
				Moneda moneda = new Moneda("KRW", 3.69);
				pesos = Math.round((moneda.getValor() * wonCoreano) * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, "Tienes $" + pesos + " Libras");
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
