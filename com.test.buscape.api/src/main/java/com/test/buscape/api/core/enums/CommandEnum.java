package com.test.buscape.api.core.enums;

public enum CommandEnum {
	
	LEFT('L'),
	RIGHT('R'),
	UP('U'),
	DOWN('D'),
	MOVE('M')
	;
	
	private final Character command;
	
	private CommandEnum(Character command) {
		this.command = command;
	}

	public Character getCommand() {
		return command;
	}

	public static CommandEnum getCommandByCharacter(Character c) {
		for(CommandEnum commandEnum : values()) {
			if(commandEnum.getCommand().equals(c)) {
				return commandEnum;
			}
		}
		return null;
	}
}
