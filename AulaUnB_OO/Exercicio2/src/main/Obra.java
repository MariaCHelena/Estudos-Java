package main;

public abstract class Obra {
	protected String titulo;
	protected String editora;
	
	// o construtor de obra no diagrama está errado
	public Obra(String tit, String ed) {
		this.titulo = tit;
		this.editora = ed;
	}
}
