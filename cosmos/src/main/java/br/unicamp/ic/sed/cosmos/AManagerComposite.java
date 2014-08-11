package br.unicamp.ic.sed.cosmos;

import java.util.HashMap;
import java.util.Map;

/**
 * Extends class {@link br.unicamp.ic.sed.cosmos.AManager} with the methods
 * {@link #setInternalComponent(String, IManager)} and
 * {@link #getInternalComponent(String)} for composite components.
 */
public abstract class AManagerComposite extends AManager {

	private final Map<String, IManager> internalComponents;

	protected AManagerComposite() {
		super();
		internalComponents = new HashMap<String, IManager>();
	}

	/**
	 * Stores a component as a sub-component of the composite.
	 * 
	 * @param name
	 *            the name under which the component will be stored
	 * @param mgr
	 *            an instance of the component to be stored
	 */
	protected void setInternalComponent(String name, IManager mgr) {
		internalComponents.put(name, mgr);
	}

	/**
	 * Retrieves a component stored as internal to the composite.
	 * 
	 * @param name
	 *            the name under which the component was stored
	 * @return
	 */
	public IManager getInternalComponent(String name) {
		return internalComponents.get(name);
	}

}
