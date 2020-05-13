package capitulo2;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salva nf no banco");		
	}

}
