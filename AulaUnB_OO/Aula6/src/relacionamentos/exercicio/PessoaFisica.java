package relacionamentos.exercicio;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class PessoaFisica extends Pessoa {
	private int idade;
	private String cpf;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	private StatusPessoaFisica status;
	
	
	/*
	 * public PessoaFisica(String nome, String cpf, int idade, String endereco, String nacionalidade, String dataRegistro, String dataNascimento, EstadoCivil estadoCivil, StatusPessoaFisica status) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.nacionalidade = nacionalidade;
		this.dataRegistro = dataRegistro;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.status = status;
	}
	 * */

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public StatusPessoaFisica getStatus() {
		return status;
	}

	public void setStatus(StatusPessoaFisica status) {
		this.status = status;
	}
	
	public String emitirAtestadoEstadoCivil() {
		return "É possível declarar que a pessoa de nome " + this.nome +
				", possuidora do CPF (Cadastro de pessoa física): " + this.cpf +
				", registrada no endereço " + this.endereco +
				", de nacionalidade " + this.nacionalidade +
				", possui o estado civil: " + this.estadoCivil;
	}
	
	public void registrarPessoa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para prosseguir com o registro de pessoa, siga os seguintes passos: ");
		
		System.out.println("Digite o nome da pessoa:");
		String nome = sc.next();
		
		System.out.println("Digite o cpf da pessoa (caso ela não possua CPF, digite NAO):");
		String cpf = sc.next();
		if (cpf.equals("NAO")) {
			cpf = gerarCPF();
		}
		
		System.out.println("Digite a idade da pessoa:");
		int idade = sc.nextInt();
		
		System.out.println("Digite o endereço da pessoa:");
		String endereco = sc.next();
		
		System.out.println("Digite a nacionalidade da pessoa:");
		String nacionalidade = sc.next();
		
		System.out.println("Digite a data de nascimento da pessoa (no formato DD/MM/AAAA):");
		String dataNasc = sc.next();
		
		System.out.println("Escolha o estado civil da pessoa:");
		System.out.println("1 - SOLTEIRO, 2 - CASADO, 3 - DIVORCIADO, 4 - VIUVO");
		EstadoCivil resEstado = EstadoCivil.SOLTEIRO;
		int resEstCivil = sc.nextInt();
		switch (resEstCivil) {
			case 1:
				break;
			case 2:
				resEstado = EstadoCivil.CASADO;
				break;
			case 3:
				resEstado = EstadoCivil.DIVORCIADO;
				break;
			case 4:
				resEstado = EstadoCivil.VIUVO;
				break;
		}
		
		System.out.println("Escolha o status da pessoa:");
		System.out.println("1 - VIVO, 2 - MORTO");
		int resStatus = sc.nextInt();
		StatusPessoaFisica defStatus = StatusPessoaFisica.VIVO;
		if (resStatus > 1) {
			defStatus = StatusPessoaFisica.MORTO;
		}
		Calendar dataAgora = Calendar.getInstance();
		String dataAgoraFormat = Integer.toString(dataAgora.get(dataAgora.DAY_OF_MONTH)) + "/" + Integer.toString(dataAgora.get(dataAgora.MONTH)) + "/" + Integer.toString(dataAgora.get(dataAgora.YEAR));
		
		sc.close();
		
		setNome(nome);
		setCpf(cpf);
		setIdade(idade);
		setEndereco(endereco);
		setNacionalidade(nacionalidade);
		setDataRegistro(dataAgoraFormat);
		setDataNascimento(dataNasc);
		setEstadoCivil(resEstado);
		setStatus(defStatus);
		System.out.println("Pessoa registrada com sucesso!");
		System.out.println("Abaixo, seguem as informações da pessoa que você registrou: ");
		System.out.println(toString());
		return;
	}
	
	private String retornaEstadoCivil() {
		String stringRetorno = "";
		switch (this.estadoCivil) {
			case SOLTEIRO:
				stringRetorno = "Solteiro";
				break;
			case CASADO:
				stringRetorno = "Casado";
				break;
			case DIVORCIADO:
				stringRetorno = "Divorciado";
				break;
			case VIUVO:
				stringRetorno = "Viuvo";
				break;
		}
		return stringRetorno;
	}
	
	private String retornaStatus() {
		String stringRetorno = "";
		switch (this.status) {
			case VIVO:
				stringRetorno = "Vivo";
				break;
			case MORTO:
				stringRetorno = "Morto";
				break;
		}
		return stringRetorno;
	}
	
	public String gerarCPF() {
		Random gerador = new Random();
		return "CPFGERADOPELOSISTEMA" + gerador.nextInt(1001);
	}
	
	public String toString() {
		return "A pessoa tem nome: " + this.nome +
				", possui o cpf: " + this.cpf +
				",\ntem: " + this.idade + " anos" +
				", nascido no dia: " + this.dataNascimento +
				",\nendereço: " + this.endereco +
				" e nacionalidade: " + this.nacionalidade +
				",\nseu estado civil é: " + retornaEstadoCivil() +
				" e seu status atual é: " + retornaStatus() +
				".\nData de registro: " + this.dataRegistro + ".";
	}
}
