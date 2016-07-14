package com.test.buscape.api.core.enums;

/**
 * Comandos para o submarino
 * @author tbdea
 *
 */
public enum Command {
	
	LEFT('L'),
	RIGHT('R'),
	UP('U'),
	DOWN('D'),
	MOVE('M')
	;
	
	private final Character command;
	
	private Command(Character command) {
		this.command = command;
	}

	public Character getCommand() {
		return command;
	}

	/**
	 * Pegar o enum apartir do caracter do comando
	 * @param c
	 * @return
	 */
	public static Command getCommandByCharacter(Character c) {
		for(Command commandEnum : values()) {
			if(commandEnum.getCommand().equals(c)) {
				return commandEnum;
			}
		}
		return null;
	}
}
