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
	
	private void registrarPessoa() {
		Scanner scReg = new Scanner(System.in);
		
		System.out.println("Para prosseguir com o registro de pessoa, siga os seguintes passos: ");
		
		System.out.println("Digite o nome da pessoa:");
		String nome = scReg.next();
		
		System.out.println("Digite o cpf da pessoa (caso ela não possua CPF, digite NAO):");
		String cpf = scReg.next();
		if (cpf.equals("NAO")) {
			cpf = gerarCPF();
		}
		
		System.out.println("Digite a idade da pessoa:");
		int idade = scReg.nextInt();
		
		System.out.println("Digite o endereço da pessoa:");
		String endereco = scReg.next();
		
		System.out.println("Digite a nacionalidade da pessoa:");
		String nacionalidade = scReg.next();
		
		System.out.println("Digite a data de nascimento da pessoa (no formato DD/MM/AAAA):");
		String dataNasc = scReg.next();
		
		System.out.println("Escolha o estado civil da pessoa:");
		System.out.println("1 - SOLTEIRO, 2 - CASADO, 3 - DIVORCIADO, 4 - VIUVO");
		EstadoCivil resEstado = EstadoCivil.SOLTEIRO;
		int resEstCivil = scReg.nextInt();
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
		int resStatus = scReg.nextInt();
		StatusPessoaFisica defStatus = StatusPessoaFisica.VIVO;
		if (resStatus > 1) {
			defStatus = StatusPessoaFisica.MORTO;
		}
		Calendar dataAgora = Calendar.getInstance();
		String dataAgoraFormat = Integer.toString(dataAgora.get(dataAgora.DAY_OF_MONTH)) + "/" + Integer.toString(dataAgora.get(dataAgora.MONTH)) + "/" + Integer.toString(dataAgora.get(dataAgora.YEAR));
		
		scReg.close();
		
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
	
	
	//crud
	public void operacaoUsuario() {
		switch (menuEscolha()) {
		case 1:
			registrarPessoa();
			break;
		case 2:
			toString();
			break;
		case 3:
			atualizarCampo();
			break;
		case 4:
			excluirPessoa();
			break;
		case 5:
			return;
		}
		
		operacaoUsuario();
	}
	
	private void excluirPessoa() {
		// Eu não tenho certeza de como fazer isso, então por hora irei só colocar todos os atributos como null
		Scanner scExc = new Scanner(System.in);
		System.out.println("Você tem certeza de que deseja excluir o cadastro de " + this.nome + "?");
		System.out.println("1 - SIM; 2 - NAO.");
		int res = scExc.nextInt();
		if (res == 1) {
			setNome(null);
			setCpf(null);
			setIdade(0);
			setEndereco(null);
			setNacionalidade(null);
			setDataRegistro(null);
			setDataNascimento(null);
			setEstadoCivil(null);
			setStatus(null);
		}
		return;
	}

	private void atualizarCampo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o campo que você deseja atualizar: ");
		System.out.println("1 - nome; 2 - cpf; 3 - idade; 4 - data de nascimento; \n5 - endereço; 6 - nacionalidade; 7 - estado civil; 8 - status; 9 - sair.");
		int res = sc.nextInt();
		
		switch (res) {
			case 1:
				System.out.println("MUDAR O NOME");
				System.out.print("Nome antigo: " + this.nome + ". Novo nome: ");
				String nome = sc.next();
				setNome(nome);
				break;
			case 2:
				System.out.println("MUDAR O CPF");
				System.out.print("CPF antigo: " + this.cpf + ". Novo cpf: ");
				String cpf = sc.next();
				setCpf(cpf);
				break;
			case 3:
				System.out.println("MUDAR A IDADE");
				System.out.print("Idade antiga: " + this.idade + ". Nova idade: ");
				int idade = sc.nextInt();
				setIdade(idade);
				break;
			case 4:
				System.out.println("MUDAR A DATA DE NASCIMENTO");
				System.out.print("Data de nascimento antiga: " + this.dataNascimento + ". Nova data de nascimento: ");
				String dataNascimento = sc.next();
				setDataNascimento(dataNascimento);
				break;
			case 5:
				System.out.println("MUDAR O ENDEREÇO");
				System.out.print("Endereço antigo: " + this.endereco + ". Novo endereço: ");
				String endereco = sc.next();
				setEndereco(endereco);
				break;
			case 6:
				System.out.println("MUDAR A NACIONALIDADE");
				System.out.print("Nacionalidade antiga: " + this.nacionalidade + ". Nova nacionalidade: ");
				String nacionalidade = sc.next();
				setNacionalidade(nacionalidade);
				break;
			case 7:
				System.out.println("MUDAR O ESTADO CIVIL");
				System.out.print("Antigo estado civil: " + retornaEstadoCivil() + ". Escolha o novo estado civil: ");
				System.out.println("1 - Solteiro. 2 - Casado; 3 - Divorciado; 4 - Viúvo.");
				EstadoCivil estadoCivil = null;
				int resEstado = sc.nextInt();
				switch (resEstado) {
					case 1:
						//solteiro
						estadoCivil = estadoCivil.SOLTEIRO;
						break;
					case 2:
						//casado
						estadoCivil = estadoCivil.CASADO;
						break;
					case 3:
						//divorciado
						estadoCivil = estadoCivil.DIVORCIADO;
						break;
					case 4:
						//viuvo
						estadoCivil = estadoCivil.VIUVO;
						break;
					default:
						break;
				}
				setEstadoCivil(estadoCivil);
				sc.close();
				break;
			case 8:
				System.out.println("MUDAR O STATUS");
				System.out.print("Estatus atual: " + retornaStatus() + ". Escolha o novo Status:");
				System.out.println("1 - Vivo; 2 - Morto.");
				int resStatus = sc.nextInt();
				StatusPessoaFisica status = null;
				switch (res) {
					case 1:
						status = status.VIVO;
						break;
					case 2:
						status = status.MORTO;
						break;
				}
				setStatus(status);
				sc.close();
				break;
			case 9:
				break;
		}
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
