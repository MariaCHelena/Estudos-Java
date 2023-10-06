package relacionamentos.exercicio;

public class Pessoa {
	protected String nome;
	protected String dataRegistro;
	protected String endereco;
	protected String nacionalidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	public String getDataRegistro() {
		return this.dataRegistro;
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
				", foi registrada no dia " + this.dataRegistro;
	}
	
	public String toString() {
		return "A pessoa tem nome: " + this.nome +
				", endereço: " + this.endereco +
				", data de registro: " + this.dataRegistro +
				" e nacionalidade: " + this.nacionalidade;
	}
}
