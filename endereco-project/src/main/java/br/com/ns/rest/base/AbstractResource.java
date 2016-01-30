package br.com.ns.rest.base;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.ns.util.Constantes;

/**
 * The Class AbstractResource.
 */
public abstract class AbstractResource implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1321369074396730731L;

	/** The Constant DEFAULT_RESOURCE_BUNDLE_BASE_NAME. */
	private static final String DEFAULT_RESOURCE_BUNDLE_BASE_NAME = "br.com.ns.messages.messages";

	/** The request. */
	@Context
	private HttpServletRequest request;

	/**
	 * Builds the textual response.
	 *
	 * @param messageKey
	 *            the message key
	 * @return the response
	 */
	public Response buildTextualResponse(final String messageKey) {
		Locale requestLocale = this.request.getLocale();
		if (requestLocale == null) {
			requestLocale = Constantes.APP_DEFAULT_LOCALE;
		}
		ResourceBundle bundle = ResourceBundle.getBundle(DEFAULT_RESOURCE_BUNDLE_BASE_NAME, requestLocale);
		return Response.ok(bundle.getString(messageKey)).type(MediaType.TEXT_PLAIN).build();
	}

	/**
	 * Gets the request.
	 *
	 * @return the request
	 */
	protected HttpServletRequest getRequest() {
		return request;
	}

}
