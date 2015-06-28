package org.voovan.network.exception;

public class SendMessageException extends Exception {

	private static final long	serialVersionUID	= 1L;

	public SendMessageException(String message,Exception e){
		super(message);
		this.setStackTrace(e.getStackTrace());
	}
	
	public SendMessageException(String message){
		super(message);
	}
}