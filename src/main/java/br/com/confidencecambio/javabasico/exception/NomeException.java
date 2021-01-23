package br.com.confidencecambio.javabasico.exception;


public class NomeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NomeException(String msn_error) {
		super(msn_error);
	}

}
