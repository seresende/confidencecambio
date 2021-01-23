package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.confidencecambio.javabasico.service.ImcService;

@RestController
@RequestMapping("/imc")
public class ImcController {
	
	@Autowired
	private ImcService imcService;
	
	@GetMapping("/{altura}/{peso}")
	public ResponseEntity<String> calcularImc(@PathVariable String altura,@PathVariable String peso) {
		
		return ResponseEntity.status(HttpStatus.OK).body(imcService.calcularImc(peso, altura));

	}
 

}
