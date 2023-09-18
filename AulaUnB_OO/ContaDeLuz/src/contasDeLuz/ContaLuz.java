package contasDeLuz;

public class ContaLuz {
	private String dt_leitura;
	private String dt_pagamento;
	private double qtd_kw_gasto;
	private double valor;
	
	public ContaLuz(String dt_leitura, String dt_pagamento, double qtd_kw_gasto, double valor){
		this.dt_leitura = dt_leitura;
		this.dt_pagamento = dt_pagamento;
		this.qtd_kw_gasto = qtd_kw_gasto;
		this.valor = valor;
	}
	
	public String getDt_leitura() {
		return dt_leitura;
	}
	
	public String getDt_pagamento() {
		return dt_pagamento;
	}
	
	public double getQtd_kw_gasto() {
		return qtd_kw_gasto;
	}

	public double getValor() {
		return valor;
	}
	
}
