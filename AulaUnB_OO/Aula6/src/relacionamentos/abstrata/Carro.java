package relacionamentos.abstrata;

public class Carro extends Veiculo implements Rodovia {
	private boolean status;
	
	public Carro(String marca, float velocidade, boolean status) {
		this.setMarca(marca);
		this.setVelocidade(velocidade);
		this.setStatus(status);
	}
	
	@Override
	public String toString() {
		return "Carro [marca=" + this.getMarca() + "/velocidade=" + this.getVelocidade() + "/status=" + status + "]" ;
	}

	// Encapsulando a classe Carro
	public boolean getStatus() {
		return status;    
	}
	
	public void setStatus(boolean status) {
		this.status = status;    
	}
	
	public void liga() {        
		status = true;
	}
	
	public void desliga() {
		status = false;    
	}
	
	// Implementação obrigatoria do metodo abstrato 
	public void mover() {
        final String combustivel = "gasolina";
        System.out.println("O veiculo e a gasolina" +
        "e esta em movimento");
    }
	
	// Implementação obrigatória do método da interface
	public boolean controlarVelocidade(float velocidade) {
		if (velocidade < LIMITE) {
			return true;
		} else {
			return false;
		}
	}
}
