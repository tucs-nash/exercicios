package com.test.buscape.api.business.interfaces;

import com.test.buscape.api.core.model.Coordinates;

/**
 * Interface da regra de neg�cio do comando
 * @author tbdea
 *
 */
public interface CommandBusiness {

	public Coordinates processCommand(String commandLine);
}
