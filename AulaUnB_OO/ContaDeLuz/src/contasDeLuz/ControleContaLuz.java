package contasDeLuz;

public class ControleContaLuz {
	private String id;
	private int qtdContas;
	private ContaLuz[] contas;
	
	public ControleContaLuz(String nome) {
		id = nome;
		qtdContas = 0;
		contas = new ContaLuz[120];
	}
	
	public boolean acrescentarConta(ContaLuz c) {
		if(qtdContas == 120) {
			return false;
		} else {
			contas[qtdContas] = c;
			qtdContas++;
			return true;
		}
	}
	
	public String verificarMesMenorConsumo() {
		if(qtdContas > 0) {
			ContaLuz menor = contas[0];
			for(int i = 0; i < qtdContas; i++) {
				if(contas[i].getQtd_kw_gasto() < menor.getQtd_kw_gasto()) {
					menor = contas[i];
				}
			}
			return menor.getDt_leitura();
		} else {
			return null;
		}
	}
	
	public String verificarMesMaiorConsumo() {
		if(qtdContas > 0) {
			ContaLuz maior = contas[0];
			for(int i = 0; i < qtdContas; i++) {
				if(contas[i].getQtd_kw_gasto() > maior.getQtd_kw_gasto()) {
					maior = contas[i];
				}
			}
			return maior.getDt_leitura();
		} else {
			return null;
		}
	}
	
	public double calculcarMedia() {
		double soma = 0;
		for(int i = 0; i < qtdContas; i++) {
			soma = soma + contas[i].getValor();
		}
		
		return soma/qtdContas;
	}
}
