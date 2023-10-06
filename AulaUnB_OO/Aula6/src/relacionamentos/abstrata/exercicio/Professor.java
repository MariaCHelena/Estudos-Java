package relacionamentos.abstrata.exercicio;

public class Professor extends Servidor {
	private String disciplinasMinistradas;
	
	public Professor(String nome, String matricula, double salario, String departamento, String disciplinasMinistradas, String titulacao) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setSalario(0);
		this.setDepartamento(departamento);
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.setTitulacao(titulacao);
	}
	
	public String toString() {
		return "Nome: " + this.getNome() + ", matricula: " + this.getMatricula() + ", salario: " + this.getSalario();
	}	
}
