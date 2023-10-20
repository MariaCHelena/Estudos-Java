package main;

public class Biblioteca {
	private String nome;
	private String endereco;
	private Obra[] obras;
	private int qtdObras;
	// esse atributo não está representado no diagrama original
	
	public Biblioteca(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		obras = new Obra[100];
		qtdObras = 0;
	}
	
	public boolean adquirirLivro(Obra o) {
		if(qtdObras < 100) {
			obras[qtdObras] = o;
			qtdObras++;
			return true;
		} else {
			return false;
		}
	}
}
