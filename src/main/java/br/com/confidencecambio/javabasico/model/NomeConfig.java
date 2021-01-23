package br.com.confidencecambio.javabasico.model;


import br.com.confidencecambio.javabasico.exception.NomeException;

public abstract class NomeConfig {
	
	private String nome;
	
	protected NomeConfig(String nome) throws NomeException {
		this.nome = nome;
		validarNome();
	}

	public String retornaPrimeiroNome() {
		return  getClass().getSimpleName() + ": " + nome.split(" ")[0].trim();
	}
	
	public String retornaUltimoNome() {
		String[] separado = nome.split(" ");
		return  getClass().getSimpleName() + ": " + separado[separado.length - 1].trim();
	}

	public String retornaNomeMaiusculo() {
		return  getClass().getSimpleName() + ": " + this.nome.toUpperCase().trim();
	}
	
	public String retornaNomeAbreviado() {
		String abreviado="";
		String[] separado = nome.split(" ");

		//1º Nome
		abreviado+= separado[0] + " ";
		//Abreviando o nome
		for (int i=1;i < separado.length-1;i++) {
           abreviado += separado[i].charAt(0) + ". ";
		}
		//Ultimo Nome
		abreviado+= separado[separado.length-1];
		return getClass().getSimpleName() + ": " + abreviado.trim();
	}

	private void validarNome() throws NomeException {
		if ((nome == null) || nome.isBlank() || nome.isEmpty() ) {
			throw new NomeException(getClass().getSimpleName() + ": Atenção: Nome não pode ser nulo e/ou vazio!!");
		}

	}

}
