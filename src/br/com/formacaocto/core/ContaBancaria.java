package br.com.formacaocto.core;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private String cpfTitular;
	protected double saldo;
	
	
	
	public ContaBancaria(int numeroConta, String nomeTitular, String cpfTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String exibirDados() {
		return numeroConta + " - "+ nomeTitular +" ("+ cpfTitular +") R$"+ saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
}
