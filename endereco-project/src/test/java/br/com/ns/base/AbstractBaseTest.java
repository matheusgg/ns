package br.com.ns.base;

import java.lang.reflect.Field;

/**
 * The Class AbstractTestBase.
 *
 * @author Matheus
 * @version 1.0 - 29/04/2015
 */
public abstract class AbstractBaseTest {

	/**
	 * Inits the field.
	 *
	 * @param instance
	 *            the instance
	 * @param fieldName
	 *            the field name
	 * @param value
	 *            the value
	 * @throws NoSuchFieldException
	 *             the no such field exception
	 * @throws SecurityException
	 *             the security exception
	 * @throws IllegalArgumentException
	 *             the illegal argument exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 */
	protected void initField(Object instance, String fieldName, Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException {
		Field field = instance.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		field.set(instance, value);
	}

}
