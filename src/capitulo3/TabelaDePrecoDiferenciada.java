package capitulo3;

public class TabelaDePrecoDiferenciada implements TabelaDePreco {

	@Override
	public double descontoPara(double valor) {
		return valor * 0.20;
	}

}
