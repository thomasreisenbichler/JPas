
package at.mcreiseii.jpas;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JPasStandaloneSetup extends JPasStandaloneSetupGenerated{

	public static void doSetup() {
		new JPasStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

