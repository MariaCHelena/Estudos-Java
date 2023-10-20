package main;

public class Livro extends Obra {
	private String autor;
	private String isbn;
	private int edicao;
	
	public Livro(String titulo, String editora, String aut, String isbn, int edicao) {
		super(titulo, editora); //herdando os elementos da classe abstrata
		this.autor = aut;
		this.isbn = isbn;
		this.edicao = edicao;
	}
}
