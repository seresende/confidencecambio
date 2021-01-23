package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {
	
	public String calcularImc(String peso, String altura) {
		return String.format("Seu IMC: %.2f", (Double.valueOf(peso) / (Math.pow(Double.valueOf(altura), 2))));

	}

}
