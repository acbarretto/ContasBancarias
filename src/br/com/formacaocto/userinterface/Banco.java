package br.com.formacaocto.userinterface;

import java.util.ArrayList;

import br.com.formacaocto.core.ContaBancaria;
import br.com.formacaocto.core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
//		ContaBancaria contas[] = new ContaBancaria[5];
		ArrayList <ContaBancaria> contas;
		contas = new ArrayList<ContaBancaria>();
		
//		contas[0] = new ContaBancaria(111, "Cliente 1", "111");
//		contas[1] = new ContaBancaria(222, "Cliente 2", "222");
//		contas[2] = new ContaBancaria(333, "Cliente 3", "333");
//		contas[3] = new ContaBancaria(444, "Cliente 4", "444");
//		contas[4] = new ContaBancaria(555, "Cliente 5", "555");
		
		contas.add(new ContaBancaria(555, "Cliente 5", "555"));
		contas.add(new ContaEspecial(777, "Cliente especial", "777", 200));
		
//		for (int i = 0; i<contas.length; i++) {
//			System.out.println(contas[i].exibirDados());
//		}
		
//		for (ContaBancaria c:contas) {
//			System.out.println(c.exibirDados());
//		}
		
//		int x = (2>3) ? 5:10;
		
		for (int i=0; i<contas.size(); i++) {
			System.out.println(contas.get(i).exibirDados());
		}
	}
}
