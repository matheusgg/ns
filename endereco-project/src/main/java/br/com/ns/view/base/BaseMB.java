package br.com.ns.view.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;

import org.omnifaces.util.Faces;
import org.primefaces.context.RequestContext;

/**
 * The Class BaseMB.
 */
public abstract class BaseMB implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4088353973980466440L;

	/** The logger. */
	private Logger logger;

	/**
	 * Inits the bean.
	 */
	@PostConstruct
	void initBean() {
		this.logger = LogManager.getLogManager().getLogger(this.getClass().getName());
	}

	/**
	 * Gets the request context.
	 *
	 * @return the request context
	 */
	public RequestContext getRequestContext() {
		return RequestContext.getCurrentInstance();
	}

	/**
	 * Execute script.
	 *
	 * @param script
	 *            the script
	 */
	public void executeScript(String script) {
		this.getRequestContext().execute(script);
	}

	/**
	 * Update components.
	 *
	 * @param components
	 *            the components
	 */
	public void updateComponents(String... components) {
		this.getRequestContext().update(Arrays.asList(components));
	}

	/**
	 * Reset components.
	 */
	public void resetComponents() {
		this.resetComponents(Faces.getViewRoot().getChildren());
	}

	/**
	 * Reset components.
	 *
	 * @param components
	 *            the components
	 */
	private void resetComponents(List<UIComponent> components) {
		for (UIComponent component : components) {
			if (component instanceof EditableValueHolder) {
				((EditableValueHolder) component).resetValue();
			}
			this.resetComponents(component.getChildren());
		}
	}

	/**
	 * Gets the resource message.
	 *
	 * @param key
	 *            the key
	 * @return the resource message
	 */
	public String getResourceMessage(String key) {
		ResourceBundle bundle = Faces.getResourceBundle("msg");
		return bundle.getString(key);
	}

	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public Logger getLogger() {
		return logger;
	}

}
