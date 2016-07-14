package com.test.buscape.api.core.utils;
import java.util.regex.Pattern;

/**
 * Classe utilitária do app
 * @author tbdea
 *
 */
public final class AppUtils {

	private static final String COMMAND_REGEX = "[LRUDM]*";
	
	public static boolean validateCommand(String command) {
		return command.length() > 0 && Pattern.compile(COMMAND_REGEX).matcher(command).matches();
	}	
}
