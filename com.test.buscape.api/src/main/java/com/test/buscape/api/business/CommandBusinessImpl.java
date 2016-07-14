package com.test.buscape.api.business;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.test.buscape.api.business.interfaces.CommandBusiness;
import com.test.buscape.api.core.enums.CommandEnum;
import com.test.buscape.api.core.model.Coordinates;

/**
 * Lendo log do jogo e aplicando as regras para geração do Ranking
 * @author tbdea
 */
public class CommandBusinessImpl implements CommandBusiness {

	/**
	 * Lendo e gerando resultado por linha do arquivo
	 * @param filePath
	 * @return
	 * @throws ParseException
	 * @throws FileNotFoundException
	 */
	public Coordinates processCommand(String commandLine) {
		Coordinates coordinates = new Coordinates();
		
		for(int i=0; i < commandLine.length(); i++) {
			Character command = commandLine.charAt(i);
			
			switch (CommandEnum.getCommandByCharacter(command)) {
				case LEFT:				
					break;
				case RIGHT:				
					break;
				case UP:				
					break;
				case DOWN:				
					break;
				case MOVE:				
					break;
				default:
					break;
			}
		}
		
		return coordinates;
	}
	
}
