package teste;

public class Carro {
	private String marca; // Por padrão os atributos devem ser privados.
	private String cor;
	private int numPortas;
	private int ano;
	private boolean movimento;

	public Carro(String marca, String cor, int numPortas, int ano, boolean movimento) {
		this.marca = marca;
		this.cor = cor;
		this.numPortas = numPortas;
		this.ano = ano;
		this.movimento = movimento;

	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
