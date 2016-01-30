package br.com.ns.business.exception;

import javax.ejb.ApplicationException;

/**
 * The Class BusinessException.
 */
@ApplicationException(rollback = true)
public class BusinessException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6800999212376744483L;

	/**
	 * Instantiates a new business exception.
	 */
	public BusinessException() {

	}

	/**
	 * Instantiates a new business exception.
	 *
	 * @param message
	 *            the message
	 */
	public BusinessException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new business exception.
	 *
	 * @param throwable
	 *            the throwable
	 */
	public BusinessException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Instantiates a new business exception.
	 *
	 * @param message
	 *            the message
	 * @param throwable
	 *            the throwable
	 */
	public BusinessException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
