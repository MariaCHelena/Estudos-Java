package relacionamentos.exercicio;

public class Pessoa {
	private String nome;
	private String dataCriacao;
	private String endereco;
	private String nacionalidade;
	private String status;
	// pessoa jurídica private String status;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDataCriacao(String nome) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getDataCriacao() {
		return this.dataCriacao;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public String emitirAtestadoRegistro() {
		return "É possível declarar que a pessoa de nome " + this.nome +
				" é registrada no endereço " + this.endereco +
				", de nacionalidade " + this.nacionalidade +
				", foi registrada no dia " + this.dataCriacao;
	}
	
	public String toString() {
		return "A pessoa tem nome: " + this.nome +
				", endereço: " + this.endereco +
				", data de registro: " + this.dataCriacao +
				" e nacionalidade: " + this.nacionalidade;
	}
}
