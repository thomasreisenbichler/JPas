/*
* generated by Xtext
*/
package at.mcreiseii.jpas.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JPasAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/mcreiseii/jpas/parser/antlr/internal/InternalJPas.tokens");
	}
}
