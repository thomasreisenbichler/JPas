package at.mcreiseii.jpas.generator;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class ResourceExtensions {
	/**
	 * Returns all the contents of the {@code resource} as an {@link Iterable}.
	 * 
	 * @param resource
	 *            the resource whose contents should be traversed. May not be <code>null</code>.
	 * @return an iterable that yields all the contents of the resource. Never <code>null</code>.
	 */
	public static Iterable<EObject> allContentsIterable(final Resource resource) {
		if (resource == null)
			throw new NullPointerException("resource");
		return new Iterable<EObject>() {
			public Iterator<EObject> iterator() {
				return resource.getAllContents();
			}
		};
	}
}
