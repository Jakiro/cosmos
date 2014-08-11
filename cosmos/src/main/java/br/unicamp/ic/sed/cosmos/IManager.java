package br.unicamp.ic.sed.cosmos;

import java.util.Map;

/**
 * A COSMOS* component is required to offer this interface, that must be
 * implemented in the component's implementation package. An instance of this
 * interface represents an instance of the component at runtime and allows one
 * to discover at runtime what are the provided and required interfaces of a
 * component. Trough this interface it is possible to connect the required
 * interfaces of a component to the provided interfaces of another component.
 */
public interface IManager {

	/**
	 * Returns an implementation of a provided interface of this component.
	 * 
	 * @param name
	 *            the name of the provided interface
	 * @return an implementation of a provided interface of this component
	 */
	Object getProvidedInterface(String name);

	/**
	 * Returns an implementation of a required interface of this component.
	 * 
	 * @param name
	 *            the name of the required interface
	 * @return an implementation of a required interface of this component
	 */
	Object getRequiredInterface(String name);

	/**
	 * Connects a required interface of this component.
	 * 
	 * @param name
	 *            the name of the required interface to be connected
	 * @param facade
	 *            the provided interface of another component, which implements
	 *            the methods expected by the required interface
	 */
	void setRequiredInterface(String name, Object facade);

	/**
	 * Returns an array with the names of the provided interfaces of this
	 * component.
	 * 
	 * @return
	 */
	String[] listProvidedInterfaceNames();

	/**
	 * Returns an array with the names of the required interfaces of this
	 * component.
	 * 
	 * @return
	 */
	String[] listRequiredInterfaceNames();

	/**
	 * Returns a {@link java.util.Map} where each key is the name of the
	 * provided interface and its value is an object {@link java.lang.Class} for
	 * the type of the interface.
	 * 
	 * @return
	 */
	Map<String, Class<?>> getProvidedInterfaceTypes();

	/**
	 * Returns a {@link java.util.Map} where each key is the name of the
	 * required interface and its value is an object {@link java.lang.Class} for
	 * the type of the interface.
	 * 
	 * @return
	 */
	Map<String, Class<?>> getRequiredInterfaceTypes();
}
