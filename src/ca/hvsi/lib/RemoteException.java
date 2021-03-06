package ca.hvsi.lib;

public class RemoteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8261385366227679937L;
	private String exception, message;
	public RemoteException(String exc, String msg) {
		this.exception = exc;
		this.message = msg;
	}
	public String toString() {
		return this.exception + ": " + this.message;
	}
}
