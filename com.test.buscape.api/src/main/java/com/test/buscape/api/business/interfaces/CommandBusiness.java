package com.test.buscape.api.business.interfaces;

import com.test.buscape.api.core.model.Coordinates;

public interface CommandBusiness {

	public Coordinates processCommand(String commandLine);
}
