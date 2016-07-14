package com.test.buscape.api.core.enums;

/**
 * Pontos cardeais e seus textos
 * @author tbdea
 *
 */
public enum CompassPoint {
	
	NORTH("buscape.command.north"),
	SOUTH("buscape.command.south"),
	EAST("buscape.command.east"),
	WEST("buscape.command.west"),
	;

	private final String compassPointProperty;
	
	private CompassPoint(String compassPointProperty) {
		this.compassPointProperty = compassPointProperty;
	}

	public String getCompassPointProperty() {
		return compassPointProperty;
	}
}
