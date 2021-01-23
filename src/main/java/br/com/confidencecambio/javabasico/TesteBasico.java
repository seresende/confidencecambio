package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.model.NomeConfig;
import br.com.confidencecambio.javabasico.model.Robo;

public class TesteBasico {

	public static void main(String[] args)  {

		final String nomeCliente = "Sérgio Luiz Resende ";
		final String nomeGerente = "Maria Luiza Sousa ";
		final String nomeRobo = "Pedro Antonio Soares";
		
		NomeConfig cli  = null;
		NomeConfig ger  = null;
		NomeConfig rob  = null;
		
		
		try {
			 cli  = new Cliente(nomeCliente);
			 ger = new Gerente(nomeGerente);
			 rob = new Robo(nomeRobo);
		} catch (Exception  e) {
			System.out.println(e.getMessage());
		}

		

		try {
			System.out.println(cli.retornaPrimeiroNome());
			System.out.println(ger.retornaPrimeiroNome());
			System.out.println(rob.retornaPrimeiroNome());
			
			System.out.println(cli.retornaUltimoNome());
			System.out.println(ger.retornaUltimoNome());
			System.out.println(rob.retornaUltimoNome());
			
			System.out.println(cli.retornaNomeMaiusculo());
			System.out.println(ger.retornaNomeMaiusculo());
			System.out.println(rob.retornaNomeMaiusculo());
			
			System.out.println(cli.retornaNomeAbreviado());
			System.out.println(ger.retornaNomeAbreviado());
			System.out.println(rob.retornaNomeAbreviado());

		} catch (Exception  e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
