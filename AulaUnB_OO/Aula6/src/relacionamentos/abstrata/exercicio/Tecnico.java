package relacionamentos.abstrata.exercicio;

public class Tecnico extends Servidor {
	private String funcao;
	
	public Tecnico(String nome, String matricula, double salario, String departamento, String funcao, String titulacao) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setSalario(0);
		this.setDepartamento(departamento);
		this.funcao = funcao;
		this.setTitulacao(titulacao);
	}
}
