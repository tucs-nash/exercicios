package com.test.buscape.api.controller;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.test.buscape.api.business.CommandBusinessImpl;
import com.test.buscape.api.business.interfaces.CommandBusiness;
import com.test.buscape.api.core.AppCore;
import com.test.buscape.api.core.model.Coordinates;
import com.test.buscape.api.core.utils.AppUtils;

/**
 * Classe responsável pela manipulação do comando
 * @author tbdea
 *
 */
public class CommandContoller {

	private CommandBusiness submarineBusiness;
	
	public CommandContoller() {
		this.submarineBusiness = new CommandBusinessImpl();
	}
	
	/**
	 * Lê o comando, processa e imprimi a posição
	 * @param filePath
	 * @throws FileNotFoundException
	 * @throws ParseException
	 */
	public void processCommand(String commandLine) throws Exception {
		
		if(!AppUtils.validateCommand(commandLine)) {
			throw new IllegalArgumentException();
		}
		
		Coordinates coordinates = submarineBusiness.processCommand(commandLine);
		printPosition(coordinates);		
	}

	/**
	 * Imprimi a posição do submarino
	 * @param players
	 * @param submarineBusiness 
	 */
	private void printPosition(Coordinates coordinates) {		
		String compassPoint = AppCore.getInstance().getProperties().getProperty(coordinates.getCompassPoint().getCompassPointProperty());
		
		System.out.println(coordinates.getX() + "," + 
							coordinates.getY()  + "," + 
							coordinates.getZ()    + "," + 
							compassPoint);
	}

}
