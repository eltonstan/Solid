package capitulo5;

public class ContaDeEstudante {

	private ManipuladorDeSaldo manipulador;
	private int milhas;
	
	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}
	
	public int getMilhas() {
		return milhas;
	}
	
	public void saca(double valor) {
		this.manipulador.saca(valor);
	}

	public void deposita(double valor) {
		this.manipulador.deposita(valor);
		this.milhas =+ (int)valor;
	}
	
	public double getSaldo() {
		return this.manipulador.getSaldo();
	}

}
