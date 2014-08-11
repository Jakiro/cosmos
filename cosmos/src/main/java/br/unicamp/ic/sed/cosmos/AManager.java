package br.unicamp.ic.sed.cosmos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Provides reusable implementation of the methods in interface
 * {@link br.unicamp.ic.sed.cosmos.IManager} and the methods
 * {@link #setProvidedInterface(String, Object)} and
 * {@link #setProvidedInterfaceType(String, Class)}.
 */
public abstract class AManager implements IManager {

	private final Map<String, Object> providedInterfaces;
	private final Map<String, Object> requiredInterfaces;
	private final Map<String, Class<?>> providedInterfaceTypes;
	private final Map<String, Class<?>> requiredInterfaceTypes;

	protected AManager() {
		super();
		providedInterfaces = new HashMap<String, Object>();
		requiredInterfaces = new HashMap<String, Object>();
		providedInterfaceTypes = new HashMap<String, Class<?>>();
		requiredInterfaceTypes = new HashMap<String, Class<?>>();
	}

	/**
	 * Stores an instance of a provided interface of the component.
	 * 
	 * @param name
	 *            the name of the provided interface
	 * @param facade
	 *            an instance of the interface
	 */
	protected void setProvidedInterface(String name, Object facade) {
		providedInterfaces.put(name, facade);
	}

	/**
	 * Store the {@link java.lang.Class} type of an provided interface.
	 * 
	 * @param name
	 *            the name of the provided interface
	 * @param clazz
	 *            the {@link java.lang.Class} type of the provided interface
	 */
	protected void setProvidedInterfaceType(String name, Class<?> clazz) {
		providedInterfaceTypes.put(name, clazz);
	}

	/**
	 * Store the {@link java.lang.Class} type of an required interface.
	 * 
	 * @param name
	 *            the name of the required interface
	 * @param clazz
	 *            the {@link java.lang.Class} type of the required interface
	 */
	protected void setRequiredInterfaceType(String name, Class<?> clazz) {
		requiredInterfaceTypes.put(name, clazz);
	}

	@Override
	public Object getProvidedInterface(String name) {
		return providedInterfaces.get(name);
	}

	@Override
	public Object getRequiredInterface(String name) {
		return requiredInterfaces.get(name);
	}

	@Override
	public void setRequiredInterface(String name, Object facade) {
		requiredInterfaces.put(name, facade);
	}

	@Override
	public String[] listProvidedInterfaceNames() {
		Set<String> keys = providedInterfaces.keySet();
		String[] providedInterfaceNames = keys.toArray(new String[keys.size()]);
		return providedInterfaceNames;
	}

	@Override
	public String[] listRequiredInterfaceNames() {
		Set<String> keys = requiredInterfaces.keySet();
		String[] requiredInterfaceNames = keys.toArray(new String[keys.size()]);
		return requiredInterfaceNames;
	}

	@Override
	public Map<String, Class<?>> getProvidedInterfaceTypes() {
		return providedInterfaceTypes;
	}

	@Override
	public Map<String, Class<?>> getRequiredInterfaceTypes() {
		return requiredInterfaceTypes;
	}

}
