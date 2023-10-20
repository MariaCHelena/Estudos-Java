package main;

public class Revista extends Obra{
	private String issn;
	private String data;
	private int ano;
	private int numero;
	
	public Revista(String titulo, String editora, String issn, String data, int ano, int numero) {
		super(titulo, editora);
		this.issn = issn;
		this.data = data;
		this.ano = ano;
		this.numero = numero;
	}
}
