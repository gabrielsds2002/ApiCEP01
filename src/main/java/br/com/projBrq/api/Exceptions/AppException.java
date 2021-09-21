package br.com.projBrq.api.Exceptions;

public class AppException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppException (String msg) {
		super(msg);
	}

}
