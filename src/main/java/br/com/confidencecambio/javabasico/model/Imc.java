package br.com.confidencecambio.javabasico.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Imc {
	
	@NotEmpty
	@NotNull
	private String altura;

	@NotEmpty
	@NotNull
	private String peso;

	public String getAltura() {
		return altura;
	}

	public String getPeso() {
		return peso;
	}
	
	public Imc(String altura, String peso) {
		this.altura = altura;
		this.peso = peso;
	}

}
