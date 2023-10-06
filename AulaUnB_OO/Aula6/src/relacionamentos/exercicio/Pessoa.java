package relacionamentos.exercicio;

import java.util.Scanner;

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
	
	public int menuEscolha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual tipo de operação você deseja realizar?");
		System.out.println("1 - Cadastrar nova pessoa; \n2 - Ler informações da pessoa cadastrada; \n3 - Editar informações da pessoa cadastrada; \n4 - Excluir pessoa cadastrada; \n5 - Sair.");
		int res = sc.nextInt();
		sc.close();
		return res;
	}
	
	public void operacaoUsuario() {
		switch (menuEscolha()) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			return;
		}
		
		operacaoUsuario();
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
