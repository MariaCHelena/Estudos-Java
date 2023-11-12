package entities;

public class Account {
	private int numeroDaConta;
	private String titularDaConta;
	private double saldo;
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public String getTitularDaConta() {
		return this.titularDaConta;
	}
	
	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}
	
	public double saldo() {
		return saldo;
	}
	
	public Account(int numeroDaConta, String titularDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		realizarDeposito(saldo);
	}
	
	public Account(int numeroDaConta, String titularDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.saldo = 0;
	}
	
	public void realizarSaque(double quantia) {
		this.saldo -= quantia + 5;
	}
	
	public void realizarDeposito(double quantia) {
		this.saldo += quantia;
	}
	
	public String toString() {
		return "Conta " + this.numeroDaConta
				+ "\nO seu títular é: " + this.titularDaConta
				+ "\nO saldo atual da conta é: R$ " + String.format("%.2f", saldo);
	}
}
