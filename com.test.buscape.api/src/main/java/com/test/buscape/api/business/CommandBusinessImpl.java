package com.test.buscape.api.business;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.test.buscape.api.business.interfaces.CommandBusiness;
import com.test.buscape.api.core.enums.Command;
import com.test.buscape.api.core.enums.CompassMapping;
import com.test.buscape.api.core.model.Coordinates;

/**
 * Classe de negócio que processa o comando e cria a coordenada
 * @author tbdea
 */
public class CommandBusinessImpl implements CommandBusiness {

	/**
	 * Processando o comando
	 * @param filePath
	 * @return
	 * @throws ParseException
	 * @throws FileNotFoundException
	 */
	public Coordinates processCommand(String commandLine) {
		Coordinates coordinates = new Coordinates();
		
		for(int i=0; i < commandLine.length(); i++) {
			Character command = commandLine.charAt(i);
			
			CompassMapping compassChanges = CompassMapping.getCompassChangeByCompassCurrent(coordinates.getCompassPoint());
			switch (Command.getCommandByCharacter(command)) {
				case UP:
					coordinates.addZ();
					break;
				case DOWN:
					coordinates.subtractZ();
					break;
				case LEFT:
					coordinates.setCompassPoint(compassChanges.getLeftPoint());
					break;
				case RIGHT:
					coordinates.setCompassPoint(compassChanges.getRightPoint());
					break;
				case MOVE:
					moveCoordinates(coordinates);
					break;
				default:
					break;
			}
		}
		
		return coordinates;
	}
	
	/**
	 * Movimenta as cordenadas X e Y
	 * @param coordinates
	 */
	private void moveCoordinates(Coordinates coordinates) {
			switch(coordinates.getCompassPoint()) {
				case NORTH:
					coordinates.addY();
					break;
				case SOUTH:
					coordinates.subtractY();
					break;
				case WEST:
					coordinates.subtractX();
					break;
				case EAST:
					coordinates.addX();
					break;
				default:
					break;
		}
	}
}
