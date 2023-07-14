package br.com.formacaocto.core;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public ContaEspecial(int numeroConta, String nomeTitular, String cpfTitular, double limite) {
		super(numeroConta, nomeTitular, cpfTitular);
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String exibirDados() {
		return super.exibirDados() + " Limite R$"+ limite;
	}
}
