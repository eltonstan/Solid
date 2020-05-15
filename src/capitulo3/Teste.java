package capitulo3;

public class Teste {
	public static void main(String[] args)  {
		
        TabelaDePreco tabela = new TabelaDePrecoPadrao();
        ServicoDeEntrega entrega = new Frete();
        
        new CalculadoraDePrecos(tabela, entrega);
        
        TabelaDePreco tabela2 = new TabelaDePrecoDiferenciada();
        ServicoDeEntrega entrega2 = new Frete();
        
        new CalculadoraDePrecos(tabela2, entrega2);
    }
}