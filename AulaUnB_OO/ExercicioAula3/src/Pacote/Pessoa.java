package Pacote;

public class Pessoa {
	private String nome;
	private int idade;
	private int peso;
	private String cpf;
	private boolean acordado;
	
	
	public Pessoa(String nome, int idade, int peso, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getCpf() {
		return cpf;
	}
}
