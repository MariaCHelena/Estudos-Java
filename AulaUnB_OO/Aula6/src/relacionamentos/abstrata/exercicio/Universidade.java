package relacionamentos.abstrata.exercicio;

public class Universidade {
	private String nome;
	private String endereco;
	private Servidor[] funcionarios;
	private int qtdServidores;
	
	public Universidade(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		funcionarios = new Servidor[500];
		qtdServidores = 0;
	}
	

	public boolean addServidor(Servidor s) {
		if (qtdServidores < 500) {
			funcionarios[qtdServidores] = s;
			return true;
		} else {
			return false;
		}
	}
	
	public String exibeProfessor() {
		String saida = "";
		for (int i = 0; i < qtdServidores; i++) {
			if(funcionarios[i] instanceof Professor) {
				saida.concat(funcionarios[i].toString());
				saida.concat("\n");
			}
		}	
		return saida;
	}
}
