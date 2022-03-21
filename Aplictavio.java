package Aplicativo;

import matheus.com.banco.contas.ContaPf;
import matheus.com.banco.contas.ContaPj;
import matheus.com.banco.contas.ContaPr;

public class Aplictavio {
	
		public static void main(String[] args) {
		
		ContaPf contaPf = new ContaPf("pf", "Joao da Silva", 800.00, "123456" );
		ContaPr contaPr = new ContaPr("123456", "Joao da Silva", 800.00, "Pr");
		ContaPj contapj = new ContaPj("123456", "Joao da Silva", 800.00, "pj");
		
		contaPf.detalhes();
		
	}


}
