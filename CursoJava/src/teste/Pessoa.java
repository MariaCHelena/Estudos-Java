package teste;

public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	} /*Em um constructor, adicionar somente os 
	atributos relevantes para a existência de um objeto*/
	
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
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
