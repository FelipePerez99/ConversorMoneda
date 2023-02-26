package conversor;

public class Moneda {
	
	private String divisa;
    private double valor;

    public Moneda(){

    }

    public Moneda(String divisa, double valor) {
        this.divisa = divisa;
        this.valor = valor;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Moneda [divisa=" + divisa + ", valor=" + valor + "]";
    }
	
	
}
