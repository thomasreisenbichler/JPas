/*
* generated by Xtext
*/
package at.mcreiseii.jpas;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Injector;

public class JPasInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	protected GlobalStateMemento globalStateMemento;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new JPasStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
		if (injector != null)
			new JPasStandaloneSetup().register(injector);
	}
	
}
