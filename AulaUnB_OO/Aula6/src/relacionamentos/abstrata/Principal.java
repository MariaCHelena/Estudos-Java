package relacionamentos.abstrata;

public class Principal {

	public static void main(String[] args) {
		// Qualquer filho de "Veiculo" pode preencher a instância de veículo
		Veiculo v = new Carro("FIAT", 0, false);
		Carro c = new Carro("CHEVROLET", 0, false);
		
		System.out.println(v);
		System.out.println(c);

	}

}
