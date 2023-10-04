package relacionamentos.heranca;

public class Carro extends Veiculo {
    private boolean status; 
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void ligar() {
        status = true;
    }
    public void desligar() {
        status = false;
    }
    //Sobrescreve metodo de Veiculo
    public void acelerar() { 
        final int turbo = 2; 
        float novaVelocidade = getVelocidade();
        if (getVelocidade() <= 10) {
            novaVelocidade += turbo;
            setVelocidade(novaVelocidade);     
        }
    }
    //Sobrescreve o metodo de Veículo
    public void frear() {
    	float velocidade = getVelocidade();
        if (velocidade > 0) {
        	velocidade = velocidade - 2;
        	setVelocidade(velocidade);
        }
            
    }
    
    //Sobrescreve metodo de Object e de Veiculo
    public String toString() {
    	String status = getStatus() ? "ligado" : "desligado";
    	return "Esse veiculo e um carro. Marca = " + 
    			this.getMarca() + ". Velocidade = " + 
    			this.getVelocidade() + ". Status = " +  
    			status;
    }
}
